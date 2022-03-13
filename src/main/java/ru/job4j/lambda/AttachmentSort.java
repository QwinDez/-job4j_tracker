package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AttachmentSort {
    public static void main(String[] args) {
        List<Attachment> attachments = Arrays.asList(
                new Attachment("image 1", 100),
                new Attachment("image 2", 34),
                new Attachment("image 3", 13)
        );
        Comparator<Attachment> comparator = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment left, Attachment right) {
                return Integer.compare(left.getSize(), right.getSize());
            }
        };
        attachments.sort(comparator);
        System.out.println(attachments);
        ArrayList<Integer> list = new ArrayList<Integer>() {
            @Override
            public boolean add(Integer integer) {
                System.out.println("Add a new element to list: " + integer);
                return super.add(integer);
            }
        };
        list.add(100500);
        Comparator<Attachment> attachmentComparator = new Comparator<Attachment>() {
            @Override
            public int compare(Attachment first, Attachment second) {
                return first.getName().compareTo(second.getName());
            }
        };
        attachments.sort(attachmentComparator);
        System.out.println(attachments);
    }
}
