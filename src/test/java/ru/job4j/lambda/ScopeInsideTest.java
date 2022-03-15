package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class ScopeInsideTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = ScopeInside.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        List<Double> result = ScopeInside.diapason(5, 8, x -> 5 * Math.pow(x, 2) + 3 * x + 1);
        List<Double> expected = Arrays.asList(141D, 199D, 267D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLogarithmicFunctionThenLogarithmicResults() {
        List<Double> result = ScopeInside.diapason(1, 3, Math::log);
        List<Double> expected = Arrays.asList(0D, 0.6931471805599453D);
        assertThat(result, is(expected));
    }
}