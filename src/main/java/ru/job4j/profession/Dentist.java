package ru.job4j.profession;

public class Dentist extends Doctor{
    public Dentist(String name, String surname, int age, String education) {
        super(name, surname, age, education);
    }
    private String drill;

    public void drillTeeth() {}

}
