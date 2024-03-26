package com.daksh.HW;

public class App {

    public static int countOccurrences(char[] array, char target) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int count = 0;
        for (char c : array) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }
}
