package com.raima.DSOOPS_L41;
class sumOfArr {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25}; // Example array
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i]; // add each element to sum
        }

        System.out.println("Sum of all elements in the array: " + sum);
    }
}
