package ru.job4j.collection;

import java.util.Collections;
import java.util.List;

public class SubList {
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        int first = list.indexOf(el);
        int last = list.lastIndexOf(el);
        if (first == -1 || first == last) {
            return Collections.emptyList();
        }
        return list.subList(first, last);
    }
}
