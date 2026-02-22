package com.ht.streams.lists;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectToListOrSet {

    public static void main(String[] args) {

        List<String> names = List.of("Alice", "Bob", "Charlie", "Alice");

        // Convert Stream back to List
        List<String> nameList = names.stream()
                .filter(name -> name.length() > 3)
                .collect(Collectors.toList());

        // Convert Stream back to Set (removes duplicates)
        Set<String> nameSet = names.stream()
                .collect(Collectors.toSet());

        System.out.println("Filtered List: " + nameList);
        System.out.println("Set (No Duplicates): " + nameSet);
    }
}
