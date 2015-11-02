/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author whitb0039
 */
public class Translator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //make an input scanner
        Scanner in = new Scanner(System.in);

        //ask user for a word
        System.out.println("Please enter a word (type END to quit the program)");

        //the string word will be assigned to the next line
        String word = in.nextLine();

        //make the string matten equal to word
        String matten = word;

        //if the word typed is END quit the program
        if (word.equals("END")) {
            //if the word starts with any vowels
        } else if (matten.startsWith("a")
                || matten.startsWith("e")
                || matten.startsWith("i")
                || matten.startsWith("o")
                || matten.startsWith("u")) {

            //cut out the first letter from the word
            String firstLetter = matten.substring(0, 1);
            //cut off the other part of the word
            String secondPart = matten.substring(1);
            //change the first letter to an i
            firstLetter = "i";

            //if the word ends with a vowel 
            if (word.endsWith("a")
                    || matten.endsWith("e")
                    || matten.endsWith("i")
                    || matten.endsWith("o")
                    || matten.endsWith("u")
                    || matten.endsWith("y")) {
                //put "hee" at the end of the word
                matten = firstLetter + secondPart + "hee";
            } else {
                //otherwise put "ee" at the end of thw word
                matten = firstLetter + secondPart + "ee";
            }

            //if the word does not start with a vowel
        } else {
            //find the first vowel and replace it with an i
            matten = matten.replaceFirst("[aeiouy]", "i");

            //set an integer value for where the letter i is in the word
            int iFound = matten.indexOf("i");

            //take the part of the word up until the first i
            String firstPart = matten.substring(0, iFound);
            //take the part of the word after the i
            String lastPart = matten.substring(iFound);

            //switch the two parts of the word with each other
            matten = lastPart + firstPart;

            //if the finished word ends in a vowel add "hee"
            if (matten.endsWith("[aeiouy]")) {
                matten = lastPart + firstPart + "hee";
                //if it ends in a constanent add "ee"
            } else {
                matten = lastPart + firstPart + "ee";
            }
        }
        //if the word is no "END" display the word
        if (!matten.equals("END")) {
            System.out.println(matten);
        }
    }
}
