package com.ht.streams.lists;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DuplicateElementsTest {

    @Test
    void testNormalCase() {
        List<Integer> input = Arrays.asList(1, 2, 3, 2, 4, 3, 5);
        List<Integer> expected = Arrays.asList(2, 3);

        assertEquals(expected, DuplicateElements.findDuplicates(input));
    }

    @Test
    void testNoDuplicates() {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expected = Collections.emptyList();

        assertEquals(expected, DuplicateElements.findDuplicates(input));
    }

    @Test
    void testAllDuplicates() {
        List<String> input = Arrays.asList("a", "a", "b", "b");
        List<String> expected = Arrays.asList("a", "b");

        assertEquals(expected, DuplicateElements.findDuplicates(input));
    }

    @Test
    void testEmptyList() {
        List<Integer> input = Collections.emptyList();
        List<Integer> expected = Collections.emptyList();

        assertEquals(expected, DuplicateElements.findDuplicates(input));
    }

    @Test
    void testSingleElement() {
        List<String> input = Collections.singletonList("x");
        List<String> expected = Collections.emptyList();

        assertEquals(expected, DuplicateElements.findDuplicates(input));
    }
}
