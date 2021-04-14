package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

public class NotifyAccount {
    public static HashSet<Accounts> sent(List<Accounts> accounts) {
        HashSet<Accounts> rsl = new HashSet<>();
        for (Accounts account: accounts) {
            rsl.add(account);
        }
        return rsl;
    }
}