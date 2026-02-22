package com.ht.streams.lists;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionList {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        Map<Boolean, List<Integer>> num = partitionEvenOdd(numbers);
        System.out.println("partition Even Odd: " + num);

    }

    public static Map<Boolean, List<Integer>> partitionEvenOdd(List<Integer> list) {
        return list.stream()
                .collect(Collectors.partitioningBy(n-> n % 2 == 0));

    }
}
