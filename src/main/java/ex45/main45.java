/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Caila Coates
 */
package ex45;

import java.io.*;
import java.util.Scanner;


public class main45 {

    public static void main(String[] args) throws IOException {

        promptUser();
    }

    public static void promptUser() throws IOException {

        Scanner userInput = new Scanner(System.in);

        System.out.print("\nEnter the name of Output File : ");

        String outputfile = userInput.next();

        readAndWriteFile(outputfile);

    }

    public static void readAndWriteFile (String outputFileName) throws IOException {
        File file = new File("src/main/java/ex45/exercise45_input.txt");
        Scanner fileInput = new Scanner(file);

        FileWriter writer = new FileWriter("src/main/java/ex45/" + outputFileName);


        // try and finally block to handle exception

        try {

            // using while loop read file

            while (fileInput.hasNext()) {

                // read whole line

                String user = fileInput.nextLine();

                // replace utilize by use

                user = user.replaceAll("utilize", "use");

                // and write into outputfile

                writer.write(user);

                writer.write("\n");


            }
        } finally {
            fileInput.close();
        }

        // and close the writer file

        writer.close();


    }
}