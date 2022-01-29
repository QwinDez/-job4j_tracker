package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " дивгается по скоростным трассам");
    }

    @Override
    public void capacity() {
        System.out.println(getClass().getSimpleName() + " вмещает 40 человек");
    }
}
