/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author malcr1272
 */
public class Translator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make scanner
        Scanner in = new Scanner(System.in);

        //create string for the word
        String word = "";

        //make while loop to ask for words to translate
        while (!word.equals("END")) {
            System.out.println("Please enter a word to translate(Type END to quit the program): ");
            word = in.nextLine();
        //make statement for if word starts with a vowel
            if (word.startsWith("a") 
                    || word.startsWith("e") 
                    || word.startsWith("i") 
                    || word.startsWith("o") 
                    || word.startsWith("u")) {
                String latinvowel = word.replace("" + word.charAt(0), "i");

                //make statement for if word ends with a vowel
                if (word.endsWith("a") 
                        || word.endsWith("e") 
                        || word.endsWith("i") 
                        || word.endsWith("o") 
                        || word.endsWith("u") 
                        || word.endsWith("y")) {
                    latinvowel = latinvowel + "hee";
                } else {
                    latinvowel = latinvowel + "ee";
                }
                System.out.println(word + " in Mattenenglisch is " + latinvowel);
                
            //create loop to count up to the first vowel in the word
            } else {
                int length = word.length();
                for (int i = 0; i < length; i = i + 1) {
                    if        ((word.charAt(i) == 'a')
                            ||(word.charAt(i) == 'e')
                            ||(word.charAt(i) == 'i')
                            ||(word.charAt(i) == 'o')
                            ||(word.charAt(i) == 'u')
                            ||(word.charAt(i) == 'y')) {
                        
                        //create strings for before the vowel and after the vowel
                        String beforevowel = word.substring(0, i);
                        String aftervowel = word.substring(i+1);
                       

                        aftervowel = ("i" + aftervowel + beforevowel + "ee");
                        
                        //output final sentance
                        System.out.println(word + " in Mattenenglisch is " + aftervowel);
                        break;
                    }
                }
            }
        }
    }
}
