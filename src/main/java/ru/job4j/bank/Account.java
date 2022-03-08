package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает модель данных - банковский счет
 * @author Denis Soldatkin
 * @version 1.0
 */
public class Account {
    private String requisite;
    private double balance;

    /**
     * Конструктор для банковского счета
     * @param requisite реквизиты счета
     * @param balance баланс счета
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    public String getRequisite() {
        return requisite;
    }

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    /**
     * Метод возвращает hashCode реквизитов
     * @return возвращает hashCode реквизитов
     */
    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
