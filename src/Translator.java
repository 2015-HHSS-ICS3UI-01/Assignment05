
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RARES
 */
public class Translator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Make a new scanner to allow the user to input words
        Scanner input = new Scanner(System.in);
        //Ask user to input a modern english word to translate to Matten English
        System.out.println("Please enter the word you wish to translate to Matten English");
        //Make a string to store the Matten English word 
        String MtEng = input.nextLine();
        //Make a string to store initial word
        String word = MtEng;

        //if the word typed is end, terminate the program 
        if (word.equals("end")) {
            //if the word starts with the vowels, a,e,i,o, or u 
        } else if (MtEng.startsWith("a")
                || MtEng.startsWith("e")
                || MtEng.startsWith("i")
                || MtEng.startsWith("o")
                || MtEng.startsWith("u")) {

            //take off the first letter 
            String firstLetter = MtEng.substring(0, 1);
            //cut off the second part of the word
            String secondPart = MtEng.substring(1);
            //replace the first letter with an 'i' 
            firstLetter = "i";

            //if the word ends with the vowels, a,e,i,o, or u
            if (word.endsWith("a")
                    || MtEng.endsWith("e")
                    || MtEng.endsWith("i")
                    || MtEng.endsWith("o")
                    || MtEng.endsWith("u")
                    || MtEng.endsWith("y")) {
                //if the word ens with a vowel sound, add "hee" to the end
                MtEng = firstLetter + secondPart + "hee";
            } else {
                //if the word begins with a vowel sound, add "ee" at the end of thw word 
                MtEng = firstLetter + secondPart + "ee";
            }

            //In the case where the word does not begin with a vowel
        } else {
            //Look for the first letter and replace it with an 'i'
            MtEng = MtEng.replaceFirst("[aeiouy]", "i");

            //set an int value for cases where 'i' is in the word
            int look4i = MtEng.indexOf("i");

            //chop the word up (take the word) until the first 'i' 
            String firstPart = MtEng.substring(0, look4i);
            //chop the word up (take the word) after the 'i' 
            String lastPart = MtEng.substring(look4i);

            //interchange the first part with the second
            MtEng = lastPart + firstPart;

            //if the newly translated word ends in a vowel, add "hee" 
            if (MtEng.endsWith("[aeiouy]")) {
                MtEng = lastPart + firstPart + "hee";
                //if the newly translated word ends in a constanent, add "ee" 
            } else {
                MtEng = lastPart + firstPart + "ee";
            }
        }
        System.out.println(word + " in matten english is " + MtEng);
    }

}
