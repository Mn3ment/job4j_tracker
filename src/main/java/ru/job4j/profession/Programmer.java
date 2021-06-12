package ru.job4j.profession;

public class Programmer extends Engineer {
    private String programmingLanguage;

    public Programmer(String name, String surname, int age, String education, String development) {
        super(name, surname, age, education, development);
    }

    public void coding() {}
}
