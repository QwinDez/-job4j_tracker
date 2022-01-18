package ru.job4j.inheritance;

public class TextPeport {
    public String generate(String name, String body) {
        return name + System.lineSeparator() + body;
    }
}
