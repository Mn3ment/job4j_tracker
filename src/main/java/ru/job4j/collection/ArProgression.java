package ru.job4j.collection;

import java.util.Iterator;
import java.util.List;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        int sum = 0;
        int i = 0;
        while ((data.get(i + 1) == (data.get(i) + data.get(i + 2)) / 2)) {
                sum += data.get(i);
        }
        return sum;
    }
}
