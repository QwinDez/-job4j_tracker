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

    public Item[] findAll() {
        int sizes = 0;
        Item[] result = new Item[size];
        for (int index = 0; index < size; index++) {
            Item name = items[index];
            if (name != null) {
                result[sizes] = name;
                sizes++;
            }
        }
        return Arrays.copyOf(result, sizes);
    }

    public Item[] findByName(String key) {
        int sizes = 0;
        Item[] result = new Item[items.length];
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getName().equals(key)) {
                result[index] = item;
                sizes++;
            }
        }
        return Arrays.copyOf(result, sizes);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}