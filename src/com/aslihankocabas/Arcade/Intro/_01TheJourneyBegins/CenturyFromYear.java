package com.aslihankocabas.Arcade.Intro._01TheJourneyBegins;

public class CenturyFromYear {
    int centuryFromYear(int year) {
        return (year + 99) / 100;
    }

    public static void main(String[] args) {
        CenturyFromYear century = new CenturyFromYear();
        System.out.println("year: 1905\nExpected Output: 20");
        System.out.println("Output: " + century.centuryFromYear(1905));
        System.out.println("year: 2020\nExpected Output: 21");
        System.out.println("Output: " + century.centuryFromYear(2020));
    }
}
