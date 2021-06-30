package ru.job4j.bank;

import java.util.*;

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
       Optional<User> user = findByPassport(passport);
       if (user.isPresent()) {
           if (!users.get(user.get()).contains(account)) {
               users.get(user.get()).add(account);
           }
       }

    }

    /**
     * Метод ищет пользователя по паспортным данным
     * @param passport Паспортные данные по которым происходит поиск
     * @return Пользователь, который подошел параметрам поиска
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(s -> s.getPassport().equals(passport))
                .findFirst();

    }

    /**
     * Метод ищет банковский щет по реквизитам
     * @param passport Паспортные данные по которому происходит поик пользователя
     * @param requisite Реквизиты по которому происходит поиск баковского счета
     * @return банковский счет
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
       Optional<User> user = findByPassport(passport);
       if (user.isEmpty()) {
           return Optional.empty();
       }
            return users.get(user.get())
                    .stream()
                    .filter(s -> s.getRequisite().equals(requisite))
                    .findFirst();

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
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> destAccount = findByRequisite(destPassport, destRequisite);
        boolean rsl = false;
        if ((srcAccount.isPresent()
                && destAccount.isPresent()
                    && srcAccount.get().getBalance() >= amount)) {
            srcAccount.get().setBalance(srcAccount.get().getBalance() - amount);
            destAccount.get().setBalance(destAccount.get().getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}