package com.raima.DSOOPS_L44;

public class Ques2 {

        public static int sum(int n) {
            if (n == 0)
                return 0;
            return n + sum(n - 1);
        }

        public static void main(String[] args) {
            int n = 5;
            System.out.println("Sum from 1 to " + n + " = " + sum(n));
        }
    }
