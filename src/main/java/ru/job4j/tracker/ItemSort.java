package ru.job4j.tracker;
import ru.job4j.oop.College;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemSort {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item(3, "Ivan"),
                new Item(1, "Artur"),
                new Item(4, "Oleg"),
                new Item(2, "Renat")
        );
        System.out.println(items);
        Collections.sort(items, new SortById());
        System.out.println(items);
        Collections.sort(items, new SortBydescending());
        System.out.println(items);
    }
}
