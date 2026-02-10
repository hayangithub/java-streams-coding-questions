package com.ht.streams.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseStringStreamTest {

    @Test
    void testNormalString() {
        String input = "hello";
        String expected = "olleh";
        assertEquals(expected, ReverseStringStream.reverseString(input));
    }

    @Test
    void testStringWithSpaces() {
        String input = "hello world";
        String expected = "dlrow olleh";
        assertEquals(expected, ReverseStringStream.reverseString(input));
    }

    @Test
    void testEmptyString() {
        String input = "";
        String expected = "";
        assertEquals(expected, ReverseStringStream.reverseString(input));
    }

    @Test
    void testSingleCharacter() {
        String input = "A";
        String expected = "A";
        assertEquals(expected, ReverseStringStream.reverseString(input));
    }

    @Test
    void testPalindrome() {
        String input = "madam";
        String expected = "madam";
        assertEquals(expected, ReverseStringStream.reverseString(input));
    }
}
