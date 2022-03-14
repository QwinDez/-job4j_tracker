package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 120),
                new Attachment("image 2", 23)
        };
        Comparator<Attachment> comparator = (first, second) -> Integer.compare(first.getSize(), second.getSize());
        Comparator<String> cmpSize = (first, second) -> Integer.compare(first.length(), second.length());
        Comparator<String> cmpText = (left, right) -> left.compareTo(right);
        Comparator<String> cmpDescSize = (left, right) -> right.compareTo(left);
        Arrays.sort(atts, comparator);
    }
}
