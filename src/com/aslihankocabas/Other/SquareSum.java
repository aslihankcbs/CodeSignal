package com.aslihankocabas.Other;

import java.time.Duration;
import java.time.Instant;

public class SquareSum {
    // Take an input of n and return the sum of the squares of numbers from 1 to n
    int squareSum1(int n) {
        int total = 0;

        for (int i = 1; i < n + 1; i++) {
            total += Math.pow(i, 2);
        }
        return total;
    }

    int squareSum2(int n) {
        return (n * (n + 1) * (2 * n + 1)) / 6;
    }

    public static void main(String[] args)  {
        SquareSum squareSum = new SquareSum();
        Instant start = Instant.now();
//      System.out.println("Input: 3\nOutput: " + squareSum.squareSum1(3));
        System.out.println("Input: 3\nOutput: " + squareSum.squareSum2(3));
        Instant end = Instant.now();
        System.out.println(Duration.between(start, end));

        //squareSum2 algoritması daha hızlı. running time daha kısa. Fakat bu donanıma bağlı.
        // Hangisinin daha iyi olduğunu kesin olarak belirlemek için Big-O notasyonu kullanılır.
    }
}
