package com.aslihankocabas.Arcade.Intro._02EdgeOfTheOcean;

public class ShapeArea {
    int shapeArea(int n) {
        return (int) (Math.pow(n, 2) + Math.pow(n - 1, 2));
    }

    public static void main(String[] args) {
        ShapeArea area = new ShapeArea();
        System.out.println("Input: 2\nExpected Output: 5");
        System.out.println("Output: " + area.shapeArea(2));
        System.out.println("Input: 5\nExpected Output: 41");
        System.out.println("Output: " + area.shapeArea(5));
    }
}
