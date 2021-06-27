package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Even {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < 21; i++) {
            numbers.add(i);
        }
        numbers.add(-50);
        numbers.add(-12345);
        numbers.add(100500);
        List<Integer> even = numbers.stream().filter(number -> number > 0)
                .collect(Collectors.toList());
                even.forEach(System.out::println);
    }
}
