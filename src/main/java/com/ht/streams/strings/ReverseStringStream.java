package com.ht.streams.strings;

import java.util.stream.Collectors;

/**
 * Problem: Reverse a string using Java Streams.
 *
 * Approach:
 * 1. Convert the string to a stream of characters using chars().
 * 2. Map each int to Character.
 * 3. Collect in reverse order using Collectors.
 *
 * Example:
 * Input: "hello"
 * Output: "olleh"
 *
 * Complexity:
 * - Time: O(n)
 * - Space: O(n)
 */
public class ReverseStringStream {

    /**
     * Reverses the given string using Stream operations.
     *
     * @param input input string
     * @return reversed string
     */
    public static String reverseString(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            java.util.Collections.reverse(list);
                            return list.stream()
                                    .map(String::valueOf)
                                    .collect(Collectors.joining());
                        }
                ));
    }

    public static void main(String[] args) {
        String str = "hello world";
        String reversed = reverseString(str);
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}
