package com.ht.streams.lists;

import java.util.List;
import java.util.Optional;

public class FindFirstAndAny {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 20, 30, 40, 50);

        Optional<Integer> firstElement = findFirst(numbers);
        Optional<Integer> anyElement = findAny(numbers);

        System.out.println("First Element: " + firstElement.orElse(null));
        System.out.println("Any Element: " + anyElement.orElse(null));
    }

    public static Optional<Integer> findFirst(List<Integer> list) {
        return list.stream()
                .findFirst();
    }

    public static Optional<Integer> findAny(List<Integer> list) {
        return list.stream()
                .findAny();
    }
}
