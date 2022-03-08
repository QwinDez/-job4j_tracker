package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = left.length() - right.length();
        int strLength = rsl > 0 ? right.length() : left.length();
        for (int index = 0; index < strLength; index++) {
            if (left.charAt(index) != right.charAt(index)) {
                rsl = left.charAt(index) - right.charAt(index);
            }
        }
        return rsl;
    }
}
