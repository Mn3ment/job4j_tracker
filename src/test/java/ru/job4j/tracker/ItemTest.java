package ru.job4j.tracker;

import java.util.ArrayList;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ItemTest {
    @Test
    public void whenAscending() {
        List<Item> items = new ArrayList<>(List.of(
                new Item(3, "Ivan"),
                new Item(1, "Artur"),
                new Item(4, "Oleg"),
                new Item(2, "Renat")
        ));
        items.sort(new SortById());
        List<Item> expected = List.of(
                new Item(1, "Artur"),
                new Item(2, "Renat"),
                new Item(3, "Ivan"),
                new Item(4, "Oleg")
        );
        assertThat(items, is(expected));
    }

    @Test
    public void whenDescending() {
        List<Item> items = Arrays.asList(
                new Item(3, "Ivan"),
                new Item(1, "Artur"),
                new Item(4, "Oleg"),
                new Item(2, "Renat")
        );
        items.sort(new SortBydescending());
        List<Item> expected = Arrays.asList(
                new Item(4, "Oleg"),
                new Item(3, "Ivan"),
                new Item(2, "Renat"),
                new Item(1, "Artur")
        );
        assertThat(items, is(expected));

    }

}