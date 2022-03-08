package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу банковской системы
 * @author Denis Soldatkin
 * @version 1.0
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
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> list = users.get(user);
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
    public User findByPassport(String passport) {
        User rsl = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                rsl = user;
                break;
            }
        }
        return rsl;
    }

    /**
     * Метод позволяет найти пользователя по банковским реквизитам
     * @param passport номер и серия паспорта пользователя
     * @param requisite реквизиты счета
     * @return возвращает банковский счет пользователя по реквизитам
     */
    public Account findByRequisite(String passport, String requisite) {
        Account rsl = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account currentAccount : accounts) {
                if (currentAccount.getRequisite().equals(requisite)) {
                    rsl = currentAccount;
                    break;
                }
            }
        }
        return rsl;
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
        Account source = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, destRequisite);
        if (source != null && source.getBalance() - amount >= 0 && dest != null) {
            source.setBalance(source.getBalance() - amount);
            dest.setBalance(dest.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
