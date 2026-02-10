package com.ht.streams.lists;

import java.util.List;
import java.util.OptionalDouble;

/**
 * Problem: Calculate the sum and average of a list of numbers using Java Streams.
 *
 * Approach:
 * 1. Use stream() on the list.
 * 2. Use mapToInt() (or mapToDouble() for doubles) to convert to numeric stream.
 * 3. Use sum() for total sum.
 * 4. Use average() to get OptionalDouble for average.
 *
 * Example:
 * Input: [1, 2, 3, 4, 5]
 * Output: Sum = 15, Average = 3.0
 *
 * Complexity:
 * - Time: O(n)
 * - Space: O(1)
 */
public class SumAndAverage {

    /**
     * Returns the sum of numbers in the list.
     *
     * @param numbers list of integers
     * @return sum of numbers
     */
    public static int calculateSum(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    /**
     * Returns the average of numbers in the list.
     *
     * @param numbers list of integers
     * @return average as OptionalDouble (empty if list is empty)
     */
    public static OptionalDouble calculateAverage(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(Integer::intValue)
                .average();
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int sum = calculateSum(numbers);
        OptionalDouble average = calculateAverage(numbers);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (average.isPresent() ? average.getAsDouble() : "N/A"));
    }
}
