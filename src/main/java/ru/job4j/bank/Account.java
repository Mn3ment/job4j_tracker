package ru.job4j.bank;

import java.util.Objects;
/**
 * Класс описывает модель банковского счета с 2мя состояниями: реквизиты и баланс
 * @author Mikhail Isakhanyan
 * @version 1.0
 */
public class Account {
    private String requisite;
    private double balance;

    /**
     * Конструктор для класса Account с 2мя параметрами
     * @param requisite - реквизиты
     * @param balance - баланс
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }
    /**
     * Метод получает значение поля requisite
     * @return значение поля requisite
     */
    public String getRequisite() {
        return requisite;
    }
    /**
     * Метод присваивает значение поля requisite
     * @param requisite принимает значение для requisite
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }
    /**
     * Метод получает значение поля balance
     * @return значение поля balance
     */
    public double getBalance() {
        return balance;
    }
    /**
     * Метод присваивает значение поля balance
     * @param balance принимает значение для balance
     */
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

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}