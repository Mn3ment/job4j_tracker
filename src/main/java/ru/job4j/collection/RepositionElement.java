package ru.job4j.collection;

import java.util.LinkedList;
import java.util.List;

public class RepositionElement {
    public static List<String> changePosition(List<String> list, int index) {
        int lastIndex = list.size() - 1;
        String rm = list.remove(lastIndex);
        if (index <= list.size()) {
            list.set(index, rm);
        }
        return list;
    }
}
