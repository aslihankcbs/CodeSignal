package com.aslihankocabas.Arcade.Intro._02EdgeOfTheOcean;

public class AdjacentElementsProduct {
    int adjacentElementsProduct(int[] inputArray) {
        int largestProduct = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length - 1; i++) {
            largestProduct = Math.max(largestProduct, (inputArray[i] * inputArray[i + 1]));
        }
        return largestProduct;
    }

    public static void main(String[] args) {
        AdjacentElementsProduct aep = new AdjacentElementsProduct();
        int[] inputArray = {9, 5, 10, 2, 24, -1, -48};
        System.out.println("inputArray: [9, 5, 10, 2, 24, -1, -48]\nExpected Output: 50");
        System.out.println("Output: " + aep.adjacentElementsProduct(inputArray));

    }
}
