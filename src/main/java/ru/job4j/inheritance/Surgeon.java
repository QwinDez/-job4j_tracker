package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String operation;

    public Surgeon(String name, String surname, String education, String birthday, int practice, String operation) {
        super(name, surname, education, birthday, practice);
        this.operation = operation;
    }

    public String hold(String pacient) {
        return pacient;
    }
}
