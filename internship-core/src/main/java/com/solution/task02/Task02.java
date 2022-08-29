package com.solution.task02;

import java.util.Arrays;
public class Task02 {

    public static void main(String[] args) {
        int[] array = {5, 6, 3, 2, 5, 1, 4, 9, 1};
        System.out.println("array init: " + Arrays.toString(array));
        sortArray(array);
        System.out.println("array sort: " + Arrays.toString(array));
    }

    static int[] sortArray(int[] array) {
        boolean nextIteration = true;
        while (nextIteration) {
            nextIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    nextIteration = true;
                }
            }
        }
        return array;
    }

}