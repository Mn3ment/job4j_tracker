package ru.job4j.profession;

public class Doctor extends Profession {
    private String education;

    public Doctor(String name, String surname, int age, String education) {
        super(name, surname, age);
        this.education = education;
    }

    public Doctor(String name, String surname, int age) {
        super(name, surname, age);
    }

    public String getEducation()  {
        return education;
    }

    public Diagnosis heal(Pacient pacient) {
        Diagnosis diagnos = new Diagnosis();
        return diagnos;
    }

}
