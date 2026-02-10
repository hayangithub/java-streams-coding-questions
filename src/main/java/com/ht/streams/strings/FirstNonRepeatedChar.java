package com.ht.streams.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Problem: Find the first non-repeated character in a string using Java Streams.
 *
 * Approach:
 * 1. Convert the string to a stream of characters using chars().
 * 2. Map int values to Character objects.
 * 3. Use Collectors.groupingBy() with LinkedHashMap to preserve order.
 * 4. Filter entries with count == 1.
 * 5. Return the first entry's key (non-repeated character).
 *
 * Example:
 * Input: "swiss"
 * Output: 'w'
 *
 * Complexity:
 * - Time: O(n)
 * - Space: O(n)
 */
public class FirstNonRepeatedChar {

    /**
     * Returns the first non-repeated character in a string, if any.
     *
     * @param input the string to search
     * @return Optional<Character> of the first non-repeated character
     */
    public static Optional<Character> findFirstNonRepeated(String input) {
        Map<Character, Long> frequencyMap = input.chars()
                .mapToObj(c -> (char) c)
                .collect(LinkedHashMap::new,
                        (map, c) -> map.put(c, map.getOrDefault(c, 0L) + 1),
                        Map::putAll);

        return frequencyMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
    }

    public static void main(String[] args) {
        String input = "swiss";
        Optional<Character> result = findFirstNonRepeated(input);

        if (result.isPresent()) {
            System.out.println("First non-repeated character: " + result.get());
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
}

