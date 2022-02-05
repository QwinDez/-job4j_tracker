package ru.job4j.ooa;

import java.util.Objects;

public final class Airbus extends Aircraft {

    private static final int COUNT_ENGINE = 2;

    private String name;

    public Airbus(String name) {
        this.name = name;
    }

    public void printCountEngine() {
        int countEngine = Objects.equals(name, "A380") ? 4 : COUNT_ENGINE;
    }

    @Override
    public String toString() {
        return "Airbus{"
                + "name='" + name + '\''
                + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printModel() {
        super.printModel();
    }
}
