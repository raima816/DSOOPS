package com.raima.DSOOPS_L42;

public class Ques3 {


    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        for (int col = 0; col < 4; col++) {
            int sum = 0;
            for (int row = 0; row < 4; row++) {
                sum += arr[row][col];
            }
            System.out.println("Sum of column " + (col + 1) + ": " + sum);
        }
    }
}
