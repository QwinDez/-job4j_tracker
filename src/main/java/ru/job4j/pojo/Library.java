package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book directory = new Book("Directory", 230);
        Book cookbook = new Book("Cookbook", 132);
        Book textbook = new Book("Clean code", 341);
        Book workbook = new Book("Workbook", 48);
        Book[] books = new Book[4];
        books[0] = directory; books[1] = cookbook; books[2] = textbook; books[3] = workbook;
        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getCount());
        }
        Book temp = books[0]; books[0] = books[3]; books[3] = temp;
        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getCount());
        }
        for (Book book : books) {
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getCount());
            }
        }
    }
}
