package com.ht.streams.lists;

import java.util.List;

public class AllMatchCondition {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 20, 30, 40, 50);

        boolean allGreaterThanFive = allMatchCondition(numbers);

        System.out.println("All numbers > 5? " + allGreaterThanFive);
    }

    public static boolean allMatchCondition(List<Integer> list) {

        return list.stream()
                .allMatch(n -> n > 5);
    }
}

