package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        String pointA = "Москва";
        String pointB = "Владивасток";
        System.out.println("Рейс " + pointA + "- " + pointB + "отправляется через 5 минут");

    }

    @Override
    public void passengers(int pass) {
        System.out.println("Общее количество пассажиров = " + pass);

    }

    @Override
    public int refuel(int fuel, int price) {
        int fullTank = 40;
        price = fuel * fullTank;
        return price;
    }
}
