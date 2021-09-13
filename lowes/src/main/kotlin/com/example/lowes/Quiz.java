package com.example.lowes;

public class Quiz {

    static String category;
    Results results;

    Quiz() {
        category = "";
        results = new Results();
    }

    public static void setCategory(String input) {
        category = input;
    }

    public void setResults(Results input) {
        results = input;
    }
}
