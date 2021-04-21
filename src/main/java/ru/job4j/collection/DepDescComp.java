package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            int comp = o2.split("/")[0].compareTo(o1.split("/")[0]);
            if (comp == 0) {
                comp = o1.compareTo(o2);
            }
            return comp;
        }
}
