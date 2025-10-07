package com.raima.DSOOPS_L43;
import java.util.Scanner;
public class Ques2 {

        public static void main(String[] args) {
            String[] cache = new String[5];
            Scanner sc = new Scanner(System.in);
            int count = 0;

            for (int i = 0; i < cache.length; i++) {
                System.out.print("Enter search term: ");
                cache[count++] = sc.nextLine();
            }

            System.out.println("\nRecent Searches:");
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + cache[i]);
            }

            sc.close();
        }
    }

