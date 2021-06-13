package ru.job4j.profession;

public class Surgeon extends Doctor {
    private String scalpel;

    public Surgeon(String name, String surname, int age, String education, String scalpel) {
        super(name, surname, age, education);
        this.scalpel = scalpel;
    }

    public void surgery() {
    }

    public String getScalpel() {
        return scalpel;
    }
}
