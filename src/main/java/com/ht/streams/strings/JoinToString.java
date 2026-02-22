package com.ht.streams.strings;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JoinToString {

    public static void main(String[] args) {

        List<String> strList = List.of("Hello", "to", "Stream", "World");

        // Convert Stream back to List
        String str = strList.stream()
                .collect(Collectors.joining(" "));
        System.out.println("The String is: " + str);
    }
}
