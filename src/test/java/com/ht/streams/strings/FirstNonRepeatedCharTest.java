package com.ht.streams.strings;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstNonRepeatedCharTest {

    @Test
    void testNormalCase() {
        String input = "swiss";
        Optional<Character> expected = Optional.of('w');
        assertEquals(expected, FirstNonRepeatedChar.findFirstNonRepeated(input));
    }

    @Test
    void testNoUniqueCharacter() {
        String input = "aabbcc";
        Optional<Character> expected = Optional.empty();
        assertEquals(expected, FirstNonRepeatedChar.findFirstNonRepeated(input));
    }

    @Test
    void testFirstCharUnique() {
        String input = "abcabcx";
        Optional<Character> expected = Optional.of('x');
        assertEquals(expected, FirstNonRepeatedChar.findFirstNonRepeated(input));
    }

    @Test
    void testEmptyString() {
        String input = "";
        Optional<Character> expected = Optional.empty();
        assertEquals(expected, FirstNonRepeatedChar.findFirstNonRepeated(input));
    }

    @Test
    void testSingleCharacter() {
        String input = "z";
        Optional<Character> expected = Optional.of('z');
        assertEquals(expected, FirstNonRepeatedChar.findFirstNonRepeated(input));
    }
}
