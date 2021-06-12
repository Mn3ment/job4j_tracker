package ru.job4j.profession;

public class Surgeon extends Doctor {
    private String scalpel;

    public Surgeon(String name, String surname, int age, String education) {
        super(name, surname, age, education);
    }

    public void surgery() {
    }

}
