package com.company;

import java.util.*;

public class EliminatesDuplicates {

   private List<String> list;
   private Set<String> set;


   private String[] words;
    public EliminatesDuplicates(){
        list = new ArrayList<>();

    }


    public void addNcumbers() {
        //gets  an array of numbers
        // add the numbers to list
        // call the duplicate method and pass the list of numbers

    }

    public void addWords(String sentence) {
        //gets  an array of words
        String[] word = sentence.split(" ");
        // add the words to list
        list = Arrays.asList(word);
        // call the duplicate method and pass the list of words
        Duplicates(list);
    }

    public void printWords() {
        //calls the duplicate method and prints the list of nun-duplicates words
        System.out.println("duplicates words are : "+set);
        System.out.println("nun-duplicates words are : ");

      for (String word: set){
          System.out.printf(" %s ",word);
      }
    }

    public void printNumbers() {
    }
    //set gets a set of words eliminate duplicates
    private void Duplicates(Collection<String> sentence){

//   passing words into set to eliminate duplicates
        set = new HashSet<>(sentence);

    }
}
