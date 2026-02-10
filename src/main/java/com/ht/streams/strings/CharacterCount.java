package com.ht.streams.strings;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Problem: Count occurrences of each character in a string using Java Streams.
 *
 * Approach:
 * 1. Convert the string into a stream of characters using chars().
 * 2. Map int values to Character objects.
 * 3. Use Collectors.groupingBy() to group identical characters.
 * 4. Use Collectors.counting() to count frequency.
 *
 * Example:
 * Input: "programming"
 * Output: {p=1, r=2, o=1, g=2, a=1, m=2, i=1, n=1}
 *
 * Complexity:
 * - Time: O(n)
 * - Space: O(n)
 */
public class CharacterCount {

    public static Map<Character, Long> countCharacters(String input) {
        return input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        LinkedHashMap::new,
                        Collectors.counting()
                ));
    }

    public static void main(String[] args) {
        String input = "programming";
        Map<Character, Long> result = countCharacters(input);
        System.out.println(result);
    }
}
