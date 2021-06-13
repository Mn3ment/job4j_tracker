package ru.job4j.profession;

public class Dentist extends Doctor {
    private String drill;

    public Dentist(String name, String surname, int age, String education, String drill) {
        super(name, surname, age, education);
        this.drill = drill;
    }

    public void drillTeeth() {
    }

    public String getDrill() {
        return drill;
    }
}
