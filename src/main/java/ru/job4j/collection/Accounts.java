package ru.job4j.collection;

import java.util.Objects;

public class Accounts {
    private String passport;
    private String username;
    private String deposit;

    public Accounts(String passport, String username, String deposit) {
        this.passport = passport;
        this.username = username;
        this.deposit = deposit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Accounts accounts = (Accounts) o;
        return Objects.equals(passport, accounts.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }

    @Override
    public String toString() {
        return "Account{"
                + "passport='"
                + passport
                + '\''
                + ", username='"
                + username + '\''
                + ", deposit='"
                + deposit
                + '\''
                + '}';
    }
}