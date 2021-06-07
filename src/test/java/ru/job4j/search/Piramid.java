package ru.job4j.search;

public class Piramid {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        String[] c = {"UP", "DOWN", "LEFT", "RIGHT", "UP_LEFT", "UP_RIGHT"};
        for (int i = 0; i < 15; i++) {
            b = a + b;
            a = b - a;
            System.out.println(b + " " + c[i % 6]);
        }
    }
}
