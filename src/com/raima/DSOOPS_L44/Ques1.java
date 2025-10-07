package com.raima.DSOOPS_L44;

public class Ques1 {

        public static void countdown(int n) {
            if (n == 0)  // base case
                return;
            System.out.println(n);
            countdown(n - 1);
        }

        public static void main(String[] args) {
            countdown(5);
        }
    }


