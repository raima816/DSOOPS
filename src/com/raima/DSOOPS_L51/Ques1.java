package com.raima.DSOOPS_L51;
import java.util.StringTokenizer;
public class Ques1 {


        public static void main(String[] args) {
            String sentence = "Java is a powerful language";
            StringTokenizer st = new StringTokenizer(sentence, " ");
            int count = st.countTokens();

            System.out.println("Sentence: " + sentence);
            System.out.println("Number of words: " + count);
        }
    }

