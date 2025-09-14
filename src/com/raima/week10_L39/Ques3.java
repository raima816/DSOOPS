package com.raima.week10_L39
import java.util.Scanner;

public class starrRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();

        // Print rectangle of stars
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (j <= cols) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
