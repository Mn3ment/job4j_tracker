package ru.job4j.profession;

public class Pacient extends Doctor {
    private Pacient sick;

    public Pacient getSick() {
        return sick;
    }

    public Pacient(String name, String surname, int age) {
        super(name, surname, age);
    }
    public void healing(Pacient pacient) {
        Diagnosis diagnos = pacient.heal(pacient.getSick());
    }
}
