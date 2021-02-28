package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
        System.out.println("Factorial of 5 = " + calc(5));
    }

    public static int calc(int n) {
        if (n < 0 ) {
            throw new IllegalArgumentException("number should be more then 0.");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
/* java.lang.IllegalArgumentException - метод вызывается с некорректными параметрами.

java.lang.IllegalStateException - метод вызывается с объекта в не корректном состоянии.

java.lang.NullPointerException - методы вызывается у переменной, которая инициализирована null ссылкой.    */
