/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Caila Coates
 */
package ex46;

import java.util.*;
import java.io.*;

public class Main46 {


        public static void main(String args[]) throws FileNotFoundException {

            countAmountOfWords();

        }

    public static void countAmountOfWords() throws FileNotFoundException {
        // assign a file pointer to input file
        Scanner inputFile =new Scanner(new File("src/main/java/ex46/exercise46_input.txt"));
        Map<String,Integer> wordMap = new TreeMap<String,Integer>();

        // read values from file and add them into map in order to count how many times the word appears
        while(inputFile.hasNext()) {
            String str=inputFile.next();
            if(wordMap.containsKey(str))
                wordMap.put(str,wordMap.get(str)+1);
            else
                wordMap.put(str,1);
        }

        // print the key (the word)
        for(String key:wordMap.keySet()) {
            System.out.printf("%-10s",key+":");
            //loops for how many times the word appears and prints an *
            for(int i = wordMap.get(key); i>0;i--)
                System.out.print("*");
        }

    }

}





