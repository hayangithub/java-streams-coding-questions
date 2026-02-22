package com.ht.streams.lists;

import java.util.List;
import java.util.stream.Collectors;

public class FlattenListUsingFlatMap {

    public static void main(String[] args) {

        List<List<Integer>> nestedList = List.of(
                List.of(1, 2, 3),
                List.of(4, 5),
                List.of(6, 7, 8)
        );

        List<Integer> flattenedList = flatten(nestedList);

        System.out.println("Nested List: " + nestedList);
        System.out.println("Flattened List: " + flattenedList);
    }

    public static List<Integer> flatten(List<List<Integer>> list) {

        return list.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }
}
