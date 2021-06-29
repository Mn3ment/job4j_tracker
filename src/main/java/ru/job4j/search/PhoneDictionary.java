package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        var result = new ArrayList<Person>();
        Predicate<Person> first = x -> x.getName().contains(key);
        Predicate<Person> second = x -> x.getSurname().contains(key);
        Predicate<Person> third = x -> x.getPhone().contains(key);
        Predicate<Person> forth = x -> x.getAddress().contains(key);
        Predicate<Person> combine = first.or(second).or(third).or(forth);
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}