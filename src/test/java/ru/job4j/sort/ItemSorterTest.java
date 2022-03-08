package ru.job4j.sort;

import org.junit.Test;
import ru.job4j.tracker.Item;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemSorterTest {

    @Test
    public void sortAscItem() {
        List<Item> items = Arrays.asList(
                new Item(12, "Alex"),
                new Item(32, "Ivan"),
                new Item(21, "Petr")
        );
        Collections.sort(items, new ItemAscByName());
        List<Item> expected = Arrays.asList(
                new Item(12, "Alex"),
                new Item(32, "Ivan"),
                new Item(21, "Petr")
        );
        assertThat(items.toString(), is(expected.toString()));
    }

    @Test
    public void sortDescItem() {
        List<Item> items = Arrays.asList(
                new Item(12, "Alex"),
                new Item(32, "Ivan"),
                new Item(21, "Petr")
        );
        Collections.sort(items, new ItemDescByName());
        List<Item> expected = Arrays.asList(
                new Item(21, "Petr"),
                new Item(32, "Ivan"),
                new Item(12, "Alex")

        );
        assertThat(items.toString(), is(expected.toString()));
    }

}