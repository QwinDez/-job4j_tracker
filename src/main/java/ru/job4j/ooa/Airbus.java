package ru.job4j.ooa;

import java.util.Objects;

public final class Airbus extends Aircraft {

    private static final int COUNT_ENGINE = 2;

    private String name;

    public Airbus(String name) {
        this.name = name;
    }

    public void printCountEngine() {
        int countEngine = 4;
        if (Objects.equals(name, "A380")) {
            System.out.println("Количество двигателей равно: " + countEngine);
        } else {
            System.out.println("Количество двигателей равно: " + COUNT_ENGINE);
        }

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
