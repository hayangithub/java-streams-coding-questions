package com.ht.streams.lists;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Problem: Find the frequency of each element in a list using Java Streams.
 *
 * Approach:
 * 1. Use stream() on the list.
 * 2. Use Collectors.groupingBy() to group elements and count occurrences.
 * 3. Return a LinkedHashMap to preserve insertion order.
 *
 * Example:
 * Input: [1, 2, 2, 3, 3, 3]
 * Output: {1=1, 2=2, 3=3}
 *
 * Complexity:
 * - Time: O(n)
 * - Space: O(n)
 */
public class ElementFrequency {

    /**
     * Returns a map of each element and its frequency in the list.
     *
     * @param list input list of elements
     * @param <T>  type of elements
     * @return map of element -> frequency
     */
    public static <T> Map<T, Long> calculateFrequency(List<T> list) {
        return list.stream()
                .collect(Collectors.groupingBy(
                        e -> e,
                        LinkedHashMap::new, // preserve order
                        Collectors.counting()
                ));
    }

    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Long> frequencyMap = calculateFrequency(items);

        System.out.println("Element Frequencies: " + frequencyMap);
    }
}
