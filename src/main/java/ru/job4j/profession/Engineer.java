package ru.job4j.profession;

public class Engineer extends Profession {
    private String education;
    private String development;

    public Engineer(String name, String surname, int age, String education, String development) {
        super(name, surname, age);
        this.development = development;
        this.education = education;
    }

    public void invent() {
    }

    public String getEducation() {
        return education;
    }

    public String getDevelopment() {
        return development;
    }
}
