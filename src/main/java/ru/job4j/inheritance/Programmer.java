package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String language;

    public Programmer(String name, String surname, String education, String birthday, String category, String language) {
        super(name, surname, education, birthday, category);
        this.language = language;
    }

    public int write(int test) {
        return test;
    }
}
