package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        char[] first = left.toCharArray();
        char[] second = right.toCharArray();
        Map<Object, Integer> map = new HashMap();
        for (char firstKey : first) {
            if (map.containsKey(firstKey)) {
                map.put(firstKey, map.get(firstKey) + 1);
            }
            map.putIfAbsent(firstKey, 1);
        }
        for (char key : second) {
            if (!map.containsKey(key)) {
                return false;
            } else {
                if (map.get(key) > 1) {
                    map.put(key, map.get(key) - 1);
                } else {
                    map.remove(key);
                }
            }
        }
        return true;
    }
}
