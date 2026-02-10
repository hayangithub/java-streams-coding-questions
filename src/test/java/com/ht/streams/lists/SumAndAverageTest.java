package com.ht.streams.lists;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumAndAverageTest {

    @Test
    void testNormalCase() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        assertEquals(15, SumAndAverage.calculateSum(numbers));
        assertEquals(3.0, SumAndAverage.calculateAverage(numbers).getAsDouble());
    }

    @Test
    void testEmptyList() {
        List<Integer> numbers = List.of();
        assertEquals(0, SumAndAverage.calculateSum(numbers));
        assertEquals(OptionalDouble.empty(), SumAndAverage.calculateAverage(numbers));
    }

    @Test
    void testSingleElement() {
        List<Integer> numbers = List.of(10);
        assertEquals(10, SumAndAverage.calculateSum(numbers));
        assertEquals(10.0, SumAndAverage.calculateAverage(numbers).getAsDouble());
    }

    @Test
    void testNegativeNumbers() {
        List<Integer> numbers = List.of(-5, -10, 15);
        assertEquals(0, SumAndAverage.calculateSum(numbers));
        assertEquals(0.0, SumAndAverage.calculateAverage(numbers).getAsDouble());
    }
}
