package ru.job4j.ex;

public class FindEl {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
            int rsl = -1;
            for (int index = 0; index < value.length; index++) {
                if (value[index].equals(key)) {
                    rsl = index;
                    break;
                }
            }
            if (rsl == -1) {
            throw new ElementNotFoundException("Element not found");
        }
            return rsl;
    }

    public static void main(String[] args) {
        String[] str = {"one", "two", "three", "four"};
        String el = "four";
        int rsl = -1;
        try {
            rsl = indexOf(str, el);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(rsl);
    }
}

/* nt count = 0;
        for (String i : value) {
            if (i.equals(key)) {
                rsl = count;
                break;
            }
            count++;
        }*/
