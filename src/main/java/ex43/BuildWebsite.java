/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Caila Coates
 */
package ex43;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BuildWebsite {

    String site;
    String author;
    char js;
    char css;

    public BuildWebsite(String site, String author, char js, char css) throws IOException {
        this.site = site;
        this.author = author;
        this.js = js;
        this.css = css;

        String path = "src/main/java/ex43/";
        path = path+this.site;
        File website = new File(path);

        boolean bool = website.mkdir();
        if(bool){
            System.out.println("Created " + path);
        }else{
            System.out.printf("oh no");
        }


            File htmlFile = new File(path + "/index.html");
            BufferedWriter bw = new BufferedWriter(new FileWriter(htmlFile));
            bw.write("<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n");
            bw.write("\t<meta author=\""+author+"\">\n");
            bw.write("\t<title>"+site+"</title>\n");
            bw.write("</head>\n<body>\n\n</body>\n</html>");
            bw.close();
            System.out.println("Created " + path+ "/index.html");
            createFolder(path, js, css);

    }

    public void createFolder(String path, char js, char css){
        if(js == 'y' || js == 'Y')
        {
            File jsFolder = new File(path+"\\js");
            boolean jsCreated = jsFolder.mkdir();
            if(jsCreated)
            {
                System.out.println("Created " + jsFolder+"\\");
            }
            else
            {
                System.out.println("Js folder not created");
            }
        }
       if(css == 'y' || css == 'Y')
        {
            File cssFolder = new File(path+"\\css");
            boolean cssCreated = cssFolder.mkdir();
            if(cssCreated)
            {
                System.out.println("Created " + cssFolder+"\\");
            }
            else
            {
                System.out.println("CSS folder not created!!");
            }
        }

    }

}





