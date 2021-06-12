package ru.job4j.profession;

public class Dentist extends Doctor {
    private String drill;

    public Dentist(String name, String surname, int age, String education) {
        super(name, surname, age, education);
    }

    public void drillTeeth() {
    }
}
