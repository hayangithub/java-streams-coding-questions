package com.ht.streams.lists;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ElementFrequencyTest {

    @Test
    void testNormalCase() {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Long> expected = new LinkedHashMap<>();
        expected.put("apple", 3L);
        expected.put("banana", 2L);
        expected.put("orange", 1L);

        assertEquals(expected, ElementFrequency.calculateFrequency(items));
    }

    @Test
    void testEmptyList() {
        List<Integer> items = Collections.emptyList();
        Map<Integer, Long> expected = Collections.emptyMap();

        assertEquals(expected, ElementFrequency.calculateFrequency(items));
    }

    @Test
    void testSingleElement() {
        List<String> items = Collections.singletonList("apple");

        Map<String, Long> expected = new LinkedHashMap<>();
        expected.put("apple", 1L);

        assertEquals(expected, ElementFrequency.calculateFrequency(items));
    }

    @Test
    void testAllUnique() {
        List<Integer> items = Arrays.asList(1, 2, 3, 4);

        Map<Integer, Long> expected = new LinkedHashMap<>();
        expected.put(1, 1L);
        expected.put(2, 1L);
        expected.put(3, 1L);
        expected.put(4, 1L);

        assertEquals(expected, ElementFrequency.calculateFrequency(items));
    }
}
