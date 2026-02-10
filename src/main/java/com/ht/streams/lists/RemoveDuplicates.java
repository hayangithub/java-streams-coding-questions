package com.ht.streams.lists;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Problem: Remove duplicates from a list using Java Streams.
 *
 * Approach:
 * 1. Use stream() on the list.
 * 2. Use distinct() to remove duplicates.
 * 3. Collect back into a list.
 *
 * Example:
 * Input: [1, 2, 3, 2, 4, 3, 5]
 * Output: [1, 2, 3, 4, 5]
 *
 * Complexity:
 * - Time: O(n)
 * - Space: O(n)
 */
public class RemoveDuplicates {

    /**
     * Removes duplicates from the given list.
     *
     * @param list input list of elements
     * @param <T>  type of elements
     * @return list with duplicates removed
     */
    public static <T> List<T> removeDuplicates(List<T> list) {
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        List<String> uniqueItems = removeDuplicates(items);

        System.out.println("Unique Items: " + uniqueItems);
    }
}
