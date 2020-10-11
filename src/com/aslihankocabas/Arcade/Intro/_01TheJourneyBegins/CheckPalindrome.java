package com.aslihankocabas.Arcade.Intro._01TheJourneyBegins;

public class CheckPalindrome {
    Boolean checkPalindrome(String inputString) {
        StringBuilder temp = new StringBuilder();

        for (int i = inputString.length() - 1; i >= 0; i--) {
            temp.append(inputString.charAt(i));
        }

        return inputString.equals(temp.toString());
    }

    public static void main(String[] args) {
        CheckPalindrome palindrome = new CheckPalindrome();
        System.out.println("Input: aabaa\nExpected Output: true");
        System.out.println("Output: " + palindrome.checkPalindrome("aabaa"));
        System.out.println("Input: abac\nExpected Output: false");
        System.out.println("Output: " + palindrome.checkPalindrome("abac"));
    }
}
