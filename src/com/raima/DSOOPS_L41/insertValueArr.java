package com.raima.DSOOPS_L41;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int value = 99;
        int index = 2;

        int[] newArr = new int[arr.length + 1];

        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = value;
            } else {
                newArr[i] = arr[j];
                j++;
            }
        }

        System.out.println("Array after insertion: " + Arrays.toString(newArr));
    }
}
