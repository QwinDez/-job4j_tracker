package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sun(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int multiply(int y) {
        return x * y;
    }

    public int sumAllOperation(int y) {
        return sun(y) + minus(y) + divide(y) + multiply(y);
    }

    public static void main(String[] args) {
        int y = 2;
        int result = sun(y);
        System.out.println(result);
        result = minus(y);
        System.out.println(result);
        Calculator calc = new Calculator();
        result = calc.divide(y);
        System.out.println(result);
        result = calc.multiply(y);
        System.out.println(result);
        result = calc.sumAllOperation(y);
        System.out.println(result);
    }
}
