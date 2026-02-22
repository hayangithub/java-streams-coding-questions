package com.ht.streams.strings;

import java.util.Arrays;

public class AnagramCheck {

    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";

        boolean result = areAnagrams(str1, str2);

        System.out.println("Are \"" + str1 + "\" and \"" + str2 + "\" anagrams? " + result);
    }

    public static boolean areAnagrams(String str1, String str2) {

        if (str1 == null || str2 == null) {
            return false;
        }

        // Remove spaces and normalize case
        String s1 = str1.replaceAll("\\s+", "").toLowerCase();
        String s2 = str2.replaceAll("\\s+", "").toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        return Arrays.equals(
                s1.chars().sorted().toArray(),
                s2.chars().sorted().toArray()
        );
    }
}
