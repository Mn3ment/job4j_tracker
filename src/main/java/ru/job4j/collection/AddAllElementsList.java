package ru.job4j.collection;

import java.util.List;

public class AddAllElementsList {
    public static int containsElement(List<String> left, List<String> right, String str) {
        if (left.contains(str) && right.contains(str)) {
            left.remove(str);
            left.addAll(right);
        }
        int index = left.indexOf(str);
        return index;
    }
}
