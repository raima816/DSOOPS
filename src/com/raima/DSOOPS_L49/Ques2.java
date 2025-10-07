package com.raima.DSOOPS_L49;

public class Ques2 {
    public static void main(String[] args) {
        String word = "Hello";
        char[] letters = word.toCharArray();

        letters[0] = 'Y';

        System.out.println("Modified char array: " + new String(letters));
        System.out.println("Original String: " + word);
    }
}

