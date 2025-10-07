package com.raima.DSOOPS_L51;
import java.util.StringTokenizer;
public class Ques4 {


        public static void main(String[] args) {
            String csv = "apple,banana,grape";
            StringTokenizer st = new StringTokenizer(csv, ",");

            System.out.println("Fruits list:");
            while (st.hasMoreTokens()) {
                System.out.println(st.nextToken());
            }
        }
    }


