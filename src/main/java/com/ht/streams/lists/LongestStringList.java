package com.ht.streams.lists;

import java.util.Comparator;
import java.util.List;

public class LongestStringList {

        public static void main(String[] args) {
            List<String> strList = List.of("abcd", "Hello world", "Java Here", "Spring boot", "python");
            String str = longestString(strList);
            System.out.println("Longest String is: " + str);
        }

        public static String longestString(List<String> list) {
            return list.stream()
                    .max(Comparator.comparingInt(String::length))
                    .orElse(null);
        }

}
