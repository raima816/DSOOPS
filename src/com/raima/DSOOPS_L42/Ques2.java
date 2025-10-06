package com.raima.DSOOPS_L42;

public class Ques2{


    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        System.out.println("First row:");
        for (int j = 0; j < arr[0].length; j++) {
            System.out.print(arr[0][j] + " ");
        }

        System.out.println("\nLast row:");
        for (int j = 0; j < arr[arr.length - 1].length; j++) {
            System.out.print(arr[arr.length - 1][j] + " ");
        }
    }
}

