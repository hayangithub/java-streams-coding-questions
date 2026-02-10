package com.ht.streams.lists;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Problem: Find the maximum and minimum values in a list using Java Streams.
 *
 * Approach:
 * 1. Use stream() on the list.
 * 2. Use max() and min() with Comparator.naturalOrder().
 * 3. Return Optional to safely handle empty lists.
 *
 * Example:
 * Input: [5, 1, 9, 3]
 * Output: Max = 9, Min = 1
 *
 * Complexity:
 * - Time: O(n)
 * - Space: O(1) (ignoring stream overhead)
 */
public class MaxMinValues {

    /**
     * Returns the maximum value in the list.
     *
     * @param list input list of Comparable elements
     * @param <T>  type of elements
     * @return Optional containing max value or empty if list is empty
     */
    public static <T extends Comparable<T>> Optional<T> findMax(List<T> list) {
        return list.stream()
                .max(Comparator.naturalOrder());
    }

    /**
     * Returns the minimum value in the list.
     *
     * @param list input list of Comparable elements
     * @param <T>  type of elements
     * @return Optional containing min value or empty if list is empty
     */
    public static <T extends Comparable<T>> Optional<T> findMin(List<T> list) {
        return list.stream()
                .min(Comparator.naturalOrder());
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 1, 9, 3);

        Optional<Integer> max = findMax(numbers);
        Optional<Integer> min = findMin(numbers);

        max.ifPresent(value -> System.out.println("Maximum value: " + value));
        min.ifPresent(value -> System.out.println("Minimum value: " + value));
    }
}
