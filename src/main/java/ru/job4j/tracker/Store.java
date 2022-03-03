package ru.job4j.tracker;

import java.util.List;

public interface Store {
    Item add(Item item);

    boolean delete(int id);

    boolean replace(int id, Item item);

    List<Item> findAll();

    List<Item> findByName(String key);

    Item findById(int id);

}
