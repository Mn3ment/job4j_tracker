package ru.job4j.popo;

public class Popo {
    public static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle buss = new Buss();
        Vehicle train = new Train();
        Vehicle[] vehicles = new Vehicle[] {train, buss, airplane};
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
