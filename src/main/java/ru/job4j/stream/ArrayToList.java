package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayToList {

    public static List<Integer> convert(Integer[][] array) {
        return Stream.of(array).flatMap(Stream::of).collect(Collectors.toList());
    }
}
