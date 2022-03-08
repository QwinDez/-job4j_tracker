package ru.job4j.sort;

import ru.job4j.tracker.Item;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemSorter {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item(12, "Alex"),
                new Item(32, "Ivan"),
                new Item(21, "Petr"),
                new Item(45, "Sergey")
        );
        System.out.println(items);
        Collections.sort(items, new ItemAscByName());
        System.out.println(items);
        Collections.sort(items, new ItemDescByName());
        System.out.println(items);
    }
}
