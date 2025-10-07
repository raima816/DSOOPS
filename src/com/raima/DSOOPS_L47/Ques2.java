package com.raima.DSOOPS_L47;

public class Ques2 {
    public static void insertionSortDesc(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;


            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 30, 20, 50, 40};
        insertionSortDesc(arr);

        System.out.print("Descending order: ");
        for (int num : arr)
            System.out.print(num + " ");
    }
}


