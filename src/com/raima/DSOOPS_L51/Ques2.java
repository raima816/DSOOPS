package com.raima.DSOOPS_L51;

public class Ques2 {
    public static void main(String[] args) {
        String input = "RaimaTech";
        String lower = input.toLowerCase();

        StringBuilder sb = new StringBuilder(lower);
        String reversed = sb.reverse().toString();

        System.out.println("Original: " + input);
        System.out.println("Lowercase: " + lower);
        System.out.println("Reversed: " + reversed);
    }
}

