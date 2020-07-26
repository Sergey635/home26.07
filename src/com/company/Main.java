package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
     String text = new String(Files.readAllBytes(Paths.get("C:\\Users\\38050\\Desktop\\Harry.txt")));

     text = text.replaceAll("[^A-Za-z ]", "");
        String [] words = text.split(" ");

      /*  System.out.println(text.substring(0, 200));*/


        String distinctString = "";
        for (int i = 0; i < words.length; i++) {
            if (!distinctString.contains(words[i])){
                distinctString += " " + words[i];
            }
        }
        System.out.println(distinctString.substring(0, 200));


        String[] distincts = distinctString.split(" ");
        System.out.println(distincts.length);

        int counter = 0;
        String wordToFind = words[0];


        for (int i = 0; i < words.length; i++) {
            if (words[i].toLowerCase().equals(wordToFind.toLowerCase())) {
                counter++;
            }
        }
            System.out.println("----------------------------------------------------");
            System.out.println("Слово "+ wordToFind + " зустрічається " + counter + " раз");


    }
}
