package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("mn3ment@yandex.ru", "Mikhail Isakhanyan");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);

            // 2й вариант
            /* for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue(); // возвращает и ключ и коллекцию
                System.out.println(key + " = " + value);
            } */
        }
    }
}
