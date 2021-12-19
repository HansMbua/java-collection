package com.company;

import java.util.*;

public class Main {
    //(Duplicate Elimination) Write a program that reads in a series of first names and eliminates
    //duplicates by storing them in a Set . Allow the user to search for a first name.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a sentence : ");
        String sentence = "";
           sentence = input.nextLine();

         EliminatesDuplicates eliminatesDuplicates = new EliminatesDuplicates();
         eliminatesDuplicates.addWords(sentence);
         eliminatesDuplicates.printWords();



    }



}
