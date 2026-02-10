package com.ht.streams.strings;

import org.junit.jupiter.api.Test;
import java.util.Map;
import java.util.LinkedHashMap;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CharacterCountTest {

    @Test
    void testNormalString() {
        String input = "programming";
        Map<Character, Long> expected = new LinkedHashMap<>();
        expected.put('p', 1L);
        expected.put('r', 2L);
        expected.put('o', 1L);
        expected.put('g', 2L);
        expected.put('a', 1L);
        expected.put('m', 2L);
        expected.put('i', 1L);
        expected.put('n', 1L);

        // Call the static method from CharacterCount
        assertEquals(expected, CharacterCount.countCharacters(input));
    }

    @Test
    void testEmptyString() {
        assertEquals(new LinkedHashMap<>(), CharacterCount.countCharacters(""));
    }
}
