package ru.job4j.poly;

public interface Transport {
    public void drive();
    public void passengers(int pass);
    public int refuel(int fuel, int price);
}
