package com.solution.task01;

import static com.solution.task01.Task01.findMinMaxAvgNumberArray;

public class Task01Test {

    public static void main(String[] args) {
        int[][] testArray = {{1, 2, 3, 4, 5},
                            {6, 7, 8, 9, 10},
                            {11, 12, 13, 14, 15},
                            {16, 17, 18, 19, 20},
                            {21, 22, 23, 24, 25}
        };
        String testResult = "MIN number- 1, MAX number- 25, AVERAGE number- 13.0";

        assertEquals("Task01.findMinMaxAvgNumberArray", findMinMaxAvgNumberArray(testArray), testResult);
    }
    public static void assertEquals(String testName, String expected, String actual) {
        if (expected.equals(actual)) {
            System.out.println(testName + " - test passed");
        } else {
            System.out.println(testName + " - failed:expected " + expected + " , actual " + actual);
        }
    }

}