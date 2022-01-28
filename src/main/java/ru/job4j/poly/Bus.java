package ru.job4j.poly;

public class Bus implements Transport {
    private int speed;
    private int passengers;
    private double refuel;

    @Override
    public void drive() {
        this.speed = 0;
    }

    @Override
    public int passengers() {
        return this.passengers;
    }

    @Override
    public double refuel(int fuel) {
        this.refuel = fuel;
        return refuel;
    }

    public static void main(String[] args) {

    }
}
