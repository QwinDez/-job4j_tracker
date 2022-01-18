package ru.job4j.inheritance;

public class Builder extends Engineer {
    private int discharge;

    public Builder(String name, String surname, String education, String birthday, String category, int discharge) {
        super(name, surname, education, birthday, category);
        this.discharge = discharge;
    }

    public int earns(int age) {
        return age;
    }
}
