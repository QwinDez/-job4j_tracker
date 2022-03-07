package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("ivanov@mail.ru", "Ivan Ivanov Ivanovich");
        map.put("sidorov@mail.ru", "Sergey Sidorov Ivanovich");
        map.put("alex@mail.ru", "Alex Ivanov Ivanovich");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println("E-mail: " + key + " ФИО: " + value);
        }
    }
}
