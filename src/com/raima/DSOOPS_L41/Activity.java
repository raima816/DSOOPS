package com.raima.DSOOPS_L41;
import java.util.Arrays;
public class Activity {


        public static void main(String[] args) {
            int[] arr = {10, 20, 30, 20, 40, 20, 50};
            int valueToRemove = 20;

            int count = 0;
            for (int num : arr) {
                if (num != valueToRemove) {
                    count++;
                }
            }


            int[] newArr = new int[count];
            int index = 0;

            for (int num : arr) {
                if (num != valueToRemove) {
                    newArr[index++] = num;
                }
            }

            System.out.println("Array after removing " + valueToRemove + ": " + Arrays.toString(newArr));
        }
    }

