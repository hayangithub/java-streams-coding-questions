package com.ht.streams.lists;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesTest {

    @Test
    void testNormalCase() {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        List<String> expected = Arrays.asList("apple", "banana", "orange");

        assertEquals(expected, RemoveDuplicates.removeDuplicates(items));
    }

    @Test
    void testEmptyList() {
        List<Integer> items = Collections.emptyList();
        List<Integer> expected = Collections.emptyList();

        assertEquals(expected, RemoveDuplicates.removeDuplicates(items));
    }

    @Test
    void testSingleElement() {
        List<String> items = Collections.singletonList("apple");
        List<String> expected = Collections.singletonList("apple");

        assertEquals(expected, RemoveDuplicates.removeDuplicates(items));
    }

    @Test
    void testAllUnique() {
        List<Integer> items = Arrays.asList(1, 2, 3, 4);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);

        assertEquals(expected, RemoveDuplicates.removeDuplicates(items));
    }

    @Test
    void testAllDuplicates() {
        List<String> items = Arrays.asList("x", "x", "x");
        List<String> expected = Collections.singletonList("x");

        assertEquals(expected, RemoveDuplicates.removeDuplicates(items));
    }
}
