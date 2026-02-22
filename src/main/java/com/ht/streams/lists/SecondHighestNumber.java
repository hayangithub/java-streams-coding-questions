package com.ht.streams.lists;

import java.util.*;
import java.util.stream.Collectors;

public class SecondHighestNumber {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        int num = secondHighest(numbers);
        System.out.println("Second Highest: " + num);

    }

    public static Integer secondHighest(List<Integer> list) {
        return list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Not enough elements"));
    }
}
