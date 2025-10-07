package com.raima.DSOOPS_L49;

public class Ques3 {
    public static String replaceVowels(String str) {
        String vowels = "AEIOUaeiou";
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (vowels.indexOf(chars[i]) != -1) {
                chars[i] = '*';
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String text = "Raima";
        String modified = replaceVowels(text);

        System.out.println("Original String: " + text);
        System.out.println("Modified String: " + modified);
    }
}


