package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу модели банковского счета
 * @author Mikhail Isakhanyan
 * @version 1.0
 */
public class BankService {
    /**
     * Хранение данных осществляется в коллекции типа Map
     * где ключом является объект User, а значением коллекция типа List
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет нового пользователя в коллекцию
     * @param user Объект типа User
     * Метод провевряет по ключу, который является объектом User, есть ли такой элемент в коллекции
     * Если такого элемента нет, или его значение == null, метод создает новый элемент в коллекции
     * с ключом user(входящий параметр метода) и значением в виде пустой коллекции типа ArrayList
     */
    public void addUser(User user) {
        /* if (!users.containsKey(user)) {
            users.put(user, new ArrayList<>());
        } */
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * метод добавляет новый банковский счет существующему пользователю
     * @param passport происходит поиск пользователя по этому параметру
     * @param account если у пользователя нет такого счета, то он добавляется
     */
    public void addAccount(String passport, Account account) {
       User user = findByPassport(passport);
       if (user != null) {
           if (!users.get(user).contains(account)) {
               users.get(user).add(account);
           }
       }

    }

    /**
     * Метод ищет пользователя по паспортным данным
     * @param passport Паспортные данные по которым происходит поиск
     * @return Пользователь, который подошел параметрам поиска
     */
    public User findByPassport(String passport) {
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                return key;
            }

        }
        return null;
    }

    /**
     * Метод ищет банковский щет по реквизитам
     * @param passport Паспортные данные по которому происходит поик пользователя
     * @param requisite Реквизиты по которому происходит поиск баковского счета
     * @return банковский счет
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;

    }

    /**
     * Метод позволяет произвести перевод средств с одного банковского счета на другой,
     * при условии что на первом счете достаточно средств
     * @param srcPassport паспортные данные пользователя со счета которого переводятся средства
     * @param srcRequisite реквизиты пользователя со счета которого переводятся средства
     * @param destPassport паспортные данные пользователя на счет которого поступают средства
     * @param destRequisite реквизиты пользователя на счет которого поступают средства
     * @param amount Сумма перевода
     * @return True - если перевод прошел успешно, false - если нет
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        boolean rsl = false;
        if ((srcAccount != null
                && destAccount != null)
                    && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}