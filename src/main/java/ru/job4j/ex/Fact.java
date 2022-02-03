package ru.job4j.ex;

public class Fact {
    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("N could not be less then 0");
        }
        int result = 1;
        for (int index = 2; index <= n; index++) {
            result *= index;
        }
        return result;
    }

    public static int calcRec(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return calcRec(n - 1) * n;
    }

    public static void main(String[] args) {
        int rsl = calcRec(3);
        System.out.println(rsl);
    }
}
