package com.ht.streams.lists;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Problem: Identify duplicate elements in a list using Java Streams.
 *
 * Approach:
 * 1. Use stream() on the list.
 * 2. Use groupingBy() collector to count occurrences.
 * 3. Filter entries where count > 1 to find duplicates.
 *
 * Example:
 * Input: [1, 2, 3, 2, 4, 3, 5]
 * Output: [2, 3]
 *
 * Complexity:
 * - Time: O(n)
 * - Space: O(n)
 */
public class DuplicateElements {

    /**
     * Returns a list of duplicate elements from the given list.
     *
     * @param list input list of elements
     * @param <T>  type of list elements
     * @return list of duplicates (no particular order)
     */
    public static <T> List<T> findDuplicates(List<T> list) {
        return list.stream()
                .collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5);
        List<Integer> duplicates = findDuplicates(numbers);

        System.out.println("Duplicate elements: " + duplicates);
    }
}
