package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывает работу банковской системы
 * @author Denis Soldatkin
 * @version 1.2
 */
public class BankService {
    /**
     * Хранение словаря пользователя и его счетов в коллекции типа Map
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет нового пользователя в систему
     * @param user пользователь, который добавляется в систему
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет банковский счет к пользователю
     * @param passport номер и серия пользователя
     * @param account банковский счет
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> list = users.get(user.get());
            if (!list.contains(account)) {
                list.add(account);
            }
        }
    }

    /**
     * Метод позволяет найти пользователя по номеру и серии паспорта
     * @param passport номер и серия пользователя
     * @return возвращает найденного пользователя
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод позволяет найти пользователя по банковским реквизитам
     * @param passport номер и серия паспорта пользователя
     * @param requisite реквизиты счета
     * @return возвращает банковский счет пользователя по реквизитам
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        Optional<Account> account = Optional.empty();
        if (user.isPresent()) {
            account = users.get(user.get())
                    .stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst();
        }
        return account;
    }

    /**
     * Метод осуществляет перевед денежных средств между счетами пользователей
     * @param srcPassport номер и серия пользователя отправителя
     * @param srcRequisite реквизиты счета отправителя
     * @param destPassport номер и серия пользователя получателя
     * @param destRequisite реквизиты счета получателя
     * @param amount сумма перевода
     * @return результать выполнения операции
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Optional<Account> source = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> dest = findByRequisite(destPassport, destRequisite);
        if (source.isPresent() && source.get().getBalance() - amount >= 0 && dest.isPresent()) {
            source.get().setBalance(source.get().getBalance() - amount);
            dest.get().setBalance(dest.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
