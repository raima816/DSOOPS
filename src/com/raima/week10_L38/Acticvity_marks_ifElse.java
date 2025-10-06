package com.raima.week10_L38;
import java.util.Scanner;

public class Acticvity_marks_ifElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter marks (0-100): ");
        int marks = input.nextInt();


        if (marks >= 90) {
            System.out.println("Excellent");
        } else if (marks >= 75) {
            System.out.println("Good");
        } else if (marks >= 50) {
            System.out.println("Average");
        } else if (marks >= 0) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid Marks");

        }
    }
}