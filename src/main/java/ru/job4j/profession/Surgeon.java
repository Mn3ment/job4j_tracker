package ru.job4j.profession;

public class Surgeon extends Doctor {
    public Surgeon(String name, String surname, int age, String education) {
        super(name, surname, age, education);
    }
    private String scalpel;

    public void surgery() {
    }

}
