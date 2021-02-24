package ru.job4j.popo;

public class Buss implements Vehicle{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " едет по дороге");
    }
}
