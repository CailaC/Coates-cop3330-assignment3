/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Caila Coates
 */
package ex42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main42 {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.printf("%-17s%-17s%-17s\n", "Last", "First", "Salary");
        System.out.println("----------------------------------------");
        formTable();


    }

    public static void formTable() throws FileNotFoundException {
        //Creates an array of strings for each line
        File file = new File("src/main/java/ex42/exercise42_input.txt");
        Scanner input = new Scanner(file);

        String line;
        while ((line = input.nextLine()) != null) {
            String[] personInfo = line.split(",");
            System.out.printf("%-17s%-17s%-17s\n", personInfo[0], personInfo[1], personInfo[2]);

        }

    }
}



