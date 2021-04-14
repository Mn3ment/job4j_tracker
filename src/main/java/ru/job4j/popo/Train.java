package ru.job4j.popo;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " едет только по рельсам");

    }
}
