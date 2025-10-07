package com.raima.DSOOPS_L43;

public class Ques1 {

        public static void main(String[] args) {

            String[][] students = {
                    {"101", "Alice"},
                    {"102", "Bob"},
                    {"103", "Charlie"}
            };

            System.out.println("ID\tName");
            for (int i = 0; i < students.length; i++) {
                System.out.println(students[i][0] + " " + students[i][1]);
            }
        }
    }


