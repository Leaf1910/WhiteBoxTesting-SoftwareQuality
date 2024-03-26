package com.daksh.HW;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.daksh.HW.App;

public class AppTest {

    @Test
    public void testNodeCoverage_NullArray() {
        try {
            App.countOccurrences(null, 'a');
        } catch (IllegalArgumentException e) {
            assertEquals("Array must not be null or empty", e.getMessage());
        }
    }

    @Test
    public void testEdgeCoverage_MultipleOccurrences() {
        char[] characters = {'a', 'b', 'c', 'a', 'd', 'a'};
        char target = 'a';
        int expectedOccurrences = 3;
        int actualOccurrences = App.countOccurrences(characters, target);
        assertEquals(expectedOccurrences, actualOccurrences);
    }

    @Test
    public void testEdgePairCoverage_SingleOccurrence() {
        char[] characters = {'a', 'b', 'c', 'd', 'e'};
        char target = 'b';
        int expectedOccurrences = 1;
        int actualOccurrences = App.countOccurrences(characters, target);
        assertEquals(expectedOccurrences, actualOccurrences);
    }

    @Test
    public void testPrimePathCoverage_NoOccurrences() {
        char[] characters = {'x', 'y', 'z'};
        char target = 'a'; // 'a' doesn't exist in the array
        int expectedOccurrences = 0;
        int actualOccurrences = App.countOccurrences(characters, target);
        assertEquals(expectedOccurrences, actualOccurrences);
    }

    @Test
    public void testAdditionalCase_MultipleTargets() {
        char[] characters = {'a', 'b', 'c', 'a', 'd', 'a'};
        char target = 'a';
        int expectedOccurrences = 3;
        int actualOccurrences = App.countOccurrences(characters, target);
        assertEquals(expectedOccurrences, actualOccurrences);
    }


    @Test
    public void testAdditionalCase_TargetNotInArray() {
        char[] characters = {'x', 'y', 'z'};
        char target = 'a';
        int expectedOccurrences = 0;
        int actualOccurrences = App.countOccurrences(characters, target);
        assertEquals(expectedOccurrences, actualOccurrences);
    }

    @Test
    public void testAdditionalCase_TargetAtBeginning() {
        char[] characters = {'a', 'b', 'c', 'd', 'e'};
        char target = 'a';
        int expectedOccurrences = 1;
        int actualOccurrences = App.countOccurrences(characters, target);
        assertEquals(expectedOccurrences, actualOccurrences);
    }

    @Test
    public void testAdditionalCase_TargetAtEnd() {
        char[] characters = {'a', 'b', 'c', 'd', 'a'};
        char target = 'a';
        int expectedOccurrences = 2;
        int actualOccurrences = App.countOccurrences(characters, target);
        assertEquals(expectedOccurrences, actualOccurrences);
    }
}
