package com.raima.DSOOPS_L47;

public class Ques3 {
    public static void selectionSortCount(int[] arr) {
        int swaps = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }

            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
                swaps++;
            }
        }

        System.out.println("Total swaps: " + swaps);
    }

    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 13, 8, 15, 25, 33, 20};

        selectionSortCount(arr);

        System.out.print("Sorted Array: ");
        for (int num : arr)
            System.out.print(num + " ");
    }
}


