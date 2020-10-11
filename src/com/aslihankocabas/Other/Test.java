package com.aslihankocabas.Other;

import java.util.Arrays;

public class Test {
    int sirala(int[] inputArray) {
        int number = 0;
        Arrays.sort(inputArray);
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[0] != 1) {
                return 1;
            }
            if (inputArray[i] - inputArray[i - 1] != 1) {
                number = inputArray[i - 1] + 1;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        Test test = new Test();
//        int[] inputArray = {4, 2, 1, 5, 6};
        int[] inputArray = {4, 3, 2, 1, 5, 6, 9, 8};
//        int[] inputArray = {3, 2};
        System.out.println("Output: " + test.sirala(inputArray));
    }
}
