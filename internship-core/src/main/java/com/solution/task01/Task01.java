package com.solution.task01;

import java.util.*;

public class Task01 {
    public static void main(String[] args) {
        int sizeArray = 5;
        int[][] array = new int[sizeArray][sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            for (int j = 0; j < sizeArray; j++) {
                array[i][j] = generatesRandomNumbers(1, 100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(findMinMaxAvgNumberArray(array));
    }

    private static int generatesRandomNumbers(int initNumber, int endNumber) {
        List<Integer> list = new ArrayList<>();
        for (int i = initNumber; i < endNumber; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        return list.get(0);
    }

    static String findMinMaxAvgNumberArray(int[][] initialArray) {
        int count = 0;
        int numberAverage = 0;
        int numberMin = initialArray[0][0];
        int numberMax = initialArray[0][0];

        for (int[] array : initialArray) {
            for (int numberArray : array) {
                if (numberMin > numberArray) {
                    numberMin = numberArray;
                }
                if (numberMax < numberArray) {
                    numberMax = numberArray;
                }
                numberAverage += numberArray;
                count++;
            }
        }
        return "MIN number- " + numberMin + ", MAX number- " + numberMax
                + ", AVERAGE number- " + (float) numberAverage / count;
    }

}