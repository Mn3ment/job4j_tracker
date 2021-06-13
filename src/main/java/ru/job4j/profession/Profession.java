package ru.job4j.profession;

public class Profession {
    private String name;
    private String surname;
    private int age;

    public Profession(String name, String surname, int age) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    public String getName()  {
        return name;
    }

    public String getSurname()  {
        return surname;
    }

    public int getAge()  {
        return age;
    }
}
