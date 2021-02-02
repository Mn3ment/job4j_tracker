package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println(this.name + this.food);
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.giveNick("Kitty Gav ");
        gav.eat("eat kotleta");
        gav.show();
        Cat black = new Cat();
        black.giveNick("Black Cat ");
        black.eat("eat fish");
        black.show();
    }
}
