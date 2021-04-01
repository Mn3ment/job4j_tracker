package ru.job4j.bank;

import ru.job4j.collection.Accounts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        /* if (!users.containsKey(user)) {
            users.put(user, new ArrayList<>());
        } */
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
       User user = findByPassport(passport);
        if (!users.get(user).contains(account)) {
            users.get(user).add(account);
        }

    }

    public User findByPassport(String passport) {
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                return key;
            }

        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        List<Account> accounts = users.get(user);
        if (accounts != null) {
            int index = accounts.indexOf(new Account(requisite, -1));
            return accounts.get(index);
        }
        return null;

    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account account1 = findByRequisite(srcPassport, srcRequisite);
        Account account2 = findByRequisite(destPassport, destRequisite);
        boolean rsl = true;
        account1.setBalance(account1.getBalance() - amount);
        account2.setBalance(account2.getBalance() + amount);
        if (account1.getBalance() < amount || account1 != null) {
            rsl = false;
        }
        return rsl;
    }
}