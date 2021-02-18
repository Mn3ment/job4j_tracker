package ru.job4j.tracker;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }
    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
        
    }
    public Item[] findByName(String key) {
        Item[] findName = new Item[items.length];
        int j = 0;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                findName[j] = item;
                j++;
            }
        }
        findName = Arrays.copyOf(findName, j);
        return findName;
    }
    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        item.setId(id);
        items[index] = item;
        return indexOf(id) != -1 ? true : false;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
            System.arraycopy(items, index + 1, items, index, size - index);
            items[size - 1] = null;
            size--;

        return indexOf(id) != -1 ? true : false;
    }
}