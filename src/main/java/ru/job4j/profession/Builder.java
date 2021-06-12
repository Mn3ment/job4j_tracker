package ru.job4j.profession;

public class Builder extends Engineer {
    private String draft;
    private String test;

    public Builder(String name, String surname, int age, String education, String development) {
        super(name, surname, age, education, development);
    }

    public void building() {}
}
