package com.raima.week10_L39
public class HighLowUsingWhile {
    public static void main(String[] args) {
        int num = 1;

        while (num <= 10) {
            if (num > 5) {
                System.out.println(num+": High");
            } else {
                System.out.println(num+  ": Low");
            }
            num++;
        }
    }
}
