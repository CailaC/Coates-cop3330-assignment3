package ex43;

import java.io.*;
import java.util.Scanner;
import java.lang.*;

public class Main43 {
    public static void main(String[] args) throws IOException {
        Scanner userInput = new Scanner(System.in);

        System.out.printf("Site name: ");
        String site = userInput.nextLine();

        System.out.printf("Author: ");
        String author = userInput.nextLine();

        System.out.printf("Do you want a folder for JavaScript? ");
        char javaScriptAnswer = userInput.next().charAt(0);

        System.out.printf("Do you want a folder for CSS? ");
        char cssAnswer = userInput.next().charAt(0);

        BuildWebsite web1 = new BuildWebsite(site, author, javaScriptAnswer, cssAnswer);

    }
}