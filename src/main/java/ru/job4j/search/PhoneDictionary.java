package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person value : persons) {
            if (value.getName().contains(key) || value.getSurname().contains(key)
            || value.getPhone().contains(key) || value.getAddress().contains(key)) {
                result.add(value);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        for (Person value : persons) {
            System.out.println(value);
        }
    }
}