package com.solution.task02;

import java.util.Arrays;

import static com.solution.task02.Task02.sortArray;

public class Task02Test {

    public static void main(String[] args) {
        int[] initArray = {1, 2, 7, 9, 7, 5, 8, 10, 2};
        int[] expectedArray = {1, 2, 2, 5, 7, 7, 8, 9, 10};

        assertEquals("Task02.sortArray", sortArray(initArray), expectedArray);
    }

    public static void assertEquals(String testName, int[] expected, int[] actual) {
        if (Arrays.equals(expected, actual)) {
            System.out.println(testName + " - test passed");
        } else {
            System.out.println(testName + " - failed:expected " + Arrays.toString(expected) + " , actual " + Arrays.toString(actual));
        }
    }

}
