package com.raima.DSOOPS_L42;

public class ques4{
    public static void main(String[] args) {
        int[][] arr = {
                {12, 45, 23},
                {7, 89, 56},
                {34, 22, 90}
        };

        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.println("Largest element in row " + (i + 1) + ": " + max);
        }
    }
}
