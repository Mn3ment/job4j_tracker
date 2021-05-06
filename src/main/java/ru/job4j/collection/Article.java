package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

public class Article {
    public static boolean generateBy(String origin, String line) {
        HashSet<String> first = new HashSet<>(Arrays.asList(origin.split("[., :;!?]")));
        HashSet<String> second = new HashSet<>(Arrays.asList(line.split("[., :;!?]")));
        for (String value : second) {
                if (!first.contains(value)) {
                    return false;
                }
        }
        return true;
    }

}

