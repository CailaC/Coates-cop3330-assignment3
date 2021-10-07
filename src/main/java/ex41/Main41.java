package ex41;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.*;

public class Main41 {
   /* public static void main(String[] args) throws FileNotFoundException {

        File file = new File(
                "C:\\Users\\caila\\OneDrive\\Desktop\\University of Central Florida\\Fall21\\exercise41_input.txt");
        Scanner input = new Scanner(file);

        System.out.println(input.nextLine());



    } */

   public static void main(String[] args) {
        try {
            BufferedReader fileInput = new BufferedReader(
                    new FileReader("src/main/java/ex41/exercise41_input.txt"));
            String s;
            while ((s = fileInput.readLine()) != null) {
                System.out.println(s);
            }
            fileInput.close();
        } catch (Exception ex) {
            return;
        }
    }


}






    //create a function that takes in a list of names
//createList will read file and create the list from there
    //public static void readList() throws IOException {


  //  }



//create a class that takes in the list of names and sorts them alphabetically
    //main will call function sort


