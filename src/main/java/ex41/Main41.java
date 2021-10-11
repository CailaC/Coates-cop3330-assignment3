/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Caila Coates
 */
package ex41;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

public class Main41 {

    //Calls readList
    public static void main(String[] args) throws FileNotFoundException {
        readList();

    }

    //create a function that reads in the file names and puts them into an array
    public static void readList() throws FileNotFoundException {

        //initializes variable that determines how many names are in the list
        int nameCount = 0 ;

        //creates unsorted array
        ArrayList<String> unsortedList = new ArrayList<>();

        //reads in file and adds the text in to a list of names
        try {
            BufferedReader fileInput = new BufferedReader(new FileReader("src/main/java/ex41/exercise41_input.txt"));
            String s;
            while ((s = fileInput.readLine()) != null) {
                unsortedList.add(s);
                nameCount++;
            }
            fileInput.close();
        } catch (Exception ex) {
            return;
        }

        //takes unsorted list and sorts it
        sortListAlphabetically(unsortedList.toArray(new String[nameCount]), nameCount);
    }

    //Takes in unsorted list and sorts the list alphabetically then prints it
    public static void sortListAlphabetically(String sortedList[], int arraySize){
        //sorts list alphabetically
        Arrays.sort(sortedList);

        //Prints output
        System.out.println("Total of " + arraySize + " names");
        System.out.println("------------------");

        for(int i = 0; i < arraySize; i++){
            System.out.println(sortedList[i]);
        }

    }


}

