package com.aslihankocabas.Arcade.Intro._01TheJourneyBegins;

public class Add {
    public static void main(String[] args) {
        Add testAdd = new Add();
        System.out.println("Input: 2, -39\nExpected Output: -37\nOutput: " + testAdd.add(2, -39));
    }

    //sum of two numbers
    int add(int param1, int param2) {
        return param1 + param2;
    }
}
