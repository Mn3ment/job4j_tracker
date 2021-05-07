package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

public class Article {
    public static boolean generateBy(String origin, String line) {
        HashSet<String> first = new HashSet<>(Arrays
                .asList(origin
                        .replaceAll("\\p{P}", "")
                                .split(" ")));
        for (String value : line.replaceAll("\\p{P}", "").split(" ")) {
                if (!first.contains(value)) {
                    return false;
                }
        }
        return true;
    }

}

