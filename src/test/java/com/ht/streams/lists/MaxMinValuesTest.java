package com.ht.streams.lists;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxMinValuesTest {

    @Test
    void testNormalCase() {
        List<Integer> input = Arrays.asList(5, 1, 9, 3);
        assertEquals(Optional.of(9), MaxMinValues.findMax(input));
        assertEquals(Optional.of(1), MaxMinValues.findMin(input));
    }

    @Test
    void testSingleElement() {
        List<Integer> input = Collections.singletonList(7);
        assertEquals(Optional.of(7), MaxMinValues.findMax(input));
        assertEquals(Optional.of(7), MaxMinValues.findMin(input));
    }

    @Test
    void testEmptyList() {
        List<Integer> input = Collections.emptyList();
        assertEquals(Optional.empty(), MaxMinValues.findMax(input));
        assertEquals(Optional.empty(), MaxMinValues.findMin(input));
    }

    @Test
    void testWithNegativeNumbers() {
        List<Integer> input = Arrays.asList(-5, -2, -9, -1);
        assertEquals(Optional.of(-1), MaxMinValues.findMax(input));
        assertEquals(Optional.of(-9), MaxMinValues.findMin(input));
    }

    @Test
    void testWithStrings() {
        List<String> input = Arrays.asList("apple", "banana", "pear");
        assertEquals(Optional.of("pear"), MaxMinValues.findMax(input));
        assertEquals(Optional.of("apple"), MaxMinValues.findMin(input));
    }
}
