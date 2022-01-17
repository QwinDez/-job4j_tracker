package ru.job4j.oop;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TriangleTest {

    @Test
    public void area() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        assertThat(result, closeTo(8, 0.001));
    }

    @Test
    public void whenAreaToMinus1() {
        Point a = new Point(0, -1);
        Point b = new Point(0, 0);
        Point c = new Point(0, -1);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        assertThat(result, closeTo(-1, 0.01));
    }
}