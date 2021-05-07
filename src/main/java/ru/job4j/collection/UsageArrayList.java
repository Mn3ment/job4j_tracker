package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Petr");
        names.add("Ivan");
        names.add("Stepan");
        for (Object value : names) {
            System.out.println(value);
        }
        ArrayList list = new ArrayList();
        list.add("blabla");
        list.add(1234);
        for (Object bls: list) {
            System.out.println(bls);
        }
    }
}
