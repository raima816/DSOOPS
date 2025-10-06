package com.raima.DSOOPS_L46;
import java.util.*;
public class sumOfArray {
    public static int sum(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) total += arr[i];
        return total;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sum(arr));
    }
}