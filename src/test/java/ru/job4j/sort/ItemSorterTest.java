package ru.job4j.sort;

import org.junit.Test;
import ru.job4j.tracker.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemSorterTest {

    @Test
    public void sortAscItem() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Alex"));
        items.add(new Item("Ivan"));
        items.add(new Item("Petr"));
        List<Item> expected = List.of(
                new Item("Alex"),
                new Item("Ivan"),
                new Item("Petr")
        );
        Collections.sort(items, new ItemAscByName());
        List<Item> result = items;
        assertThat(result.toString(), is(expected.toString()));
    }

    @Test
    public void sortDescItem() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Alex"));
        items.add(new Item("Ivan"));
        items.add(new Item("Petr"));
        List<Item> expected = List.of(
                new Item("Alex"),
                new Item("Ivan"),
                new Item("Petr")
        );
        Collections.sort(items, new ItemDescByName());
        List<Item> result = items;
        assertThat(result.toString(), is(expected.toString()));
    }

}