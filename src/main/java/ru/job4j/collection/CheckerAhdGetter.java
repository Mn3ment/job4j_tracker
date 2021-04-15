package ru.job4j.collection;

import java.util.List;

public class CheckerAhdGetter {
    public static String getElement(List<String> list) {
        if (!list.isEmpty()) {
          list.get(0);
        } else {
           list.add("");
        }
        return list.get(0);
    }
}