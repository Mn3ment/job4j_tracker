package ru.job4j.profession;

public class Programmer extends Engineer {
    private String programmingLanguage;

    public Programmer(String name, String surname, int age,
                      String education, String development, String programmingLanguage) {
        super(name, surname, age, education, development);
        this.programmingLanguage = programmingLanguage;
    }

    public void coding() {
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
}
