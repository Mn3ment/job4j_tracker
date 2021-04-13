package ru.job4j.comporate;
import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        String[] first = left.split("\\.");
        int a = Integer.parseInt(first[0]);
        String[] second = right.split("\\.");
        int b = Integer.parseInt(second[0]);
        return Integer.compare(a, b);
    }
}
