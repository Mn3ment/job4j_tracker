package ru.job4j.profession;

public class Builder extends Engineer {
    private String draft;
    private String test;

    public Builder(String name, String surname, int age, String education,
                   String development, String draft, String test) {
        super(name, surname, age, education, development);
        this.draft = draft;
        this.test = test;
    }

    public void building() {
    }

    public String getDraft() {
        return draft;
    }

    public String getTest() {
        return test;
    }
}
