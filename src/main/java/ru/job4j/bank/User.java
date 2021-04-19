package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает пользователя с 2мя состояниями: паспортные данные и имя пользователя
 * @author Mikhail Isakhanyan
 * @version 1.0
 */
public class User {
    private String passport;
    private String username;

    /**
     * Конструктор для класса User с 2мя параметрами
     * @param passport паспортиные данные
     * @param username имя пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод получает значение поля паспорт
     * @return значение поля passport
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод присваивает значение поля паспорт
     * @param passport принимает значение для поля паспорт
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }
    /**
     * Метод получает значение поля имя пользователя
     * @return значение поля username
     */

    public String getUsername() {
        return username;
    }
    /**
     * Метод присваивает значение поля имя пользователя
     * @param username значение для поля имя пользователя
     */

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}