package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Wolf volk = new Wolf();
        Hare zayac = new Hare();
        Fox lisa = new Fox();
        zayac.tryEat(kolobok);
        kolobok.run(zayac);
        volk.tryEat(kolobok);
        kolobok.run(volk);
        lisa.eat(kolobok);
        kolobok.kaput(kolobok);
    }
}
