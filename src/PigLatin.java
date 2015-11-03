
import java.util.regex.Pattern;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class PigLatin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner generated
        Scanner in = new Scanner(System.in);
        // Strings defining pigLatin and chunks of words
        String pigLatin;
        String first;
        String last;
        //asks human for a word
        System.out.println("Please enter a word");
        String word = in.nextLine();

        // Checks word if vowel
        if (word.startsWith("a")
                || word.startsWith("e")
                || word.startsWith("i")
                || word.startsWith("o")
                || word.startsWith("u")) {
            //converts first letter (vowel) to a "i"
            String firstLetter = word.substring(0, 1);
            String i = word.replace(firstLetter, "i");
            pigLatin = i;
            //if it ends with a vowel.. add "hee" if not add "ee"
            if (word.endsWith("a")
                    || word.endsWith("e")
                    || word.endsWith("i")
                    || word.endsWith("o")
                    || word.endsWith("u")) {
                System.out.println("In pigLatin: " + pigLatin + "hee");

            } else {
                System.out.println("In pigLatin: " + pigLatin + "ee");
            }
        }//  chops first letter of word and creates it to piglatin
        first = word.substring(0, 1);
        last = word.substring(1);
        pigLatin = last + first;
        //If word doesn't begin with vowel
        while (!word.startsWith("a")
                && !word.startsWith("e")
                && !word.startsWith("i")
                && !word.startsWith("o")
                && !word.startsWith("u")) {
            //If human inputs END, the program is exterminated with a sincere sad message
            if (word.equals("END")) {
                System.out.println("No words? K. BYE");
                break;
            }
            // If piglatin doesn't start with a after being manipulated. 
            if (!pigLatin.startsWith("a")
                    && !pigLatin.startsWith("e")
                    && !pigLatin.startsWith("o")
                    && !pigLatin.startsWith("u")
                    && !pigLatin.startsWith("i")
                    && !pigLatin.startsWith("y")) {
                // Keeps chopping up letters until it does
                first = pigLatin.substring(0, 1);
                last = pigLatin.substring(1);
                pigLatin = last + first;
                // If piglatin ends up starting with vowel
                if (pigLatin.startsWith("o")
                        || pigLatin.startsWith("a")
                        || pigLatin.startsWith("e")
                        || pigLatin.startsWith("u")) {
                    // It replaces the vowel into an "i" and prints the results
                    String firstLetter = pigLatin.substring(0, 1);
                    pigLatin = pigLatin.replaceFirst(firstLetter, "i");
                    System.out.println("In pigLatin: " + pigLatin + "ee");
                    break;
                }//This is for backups since the if loop above is connected to a bigger if, this one isn't.
            } else {
                String firstLetter = pigLatin.substring(0, 1);
                pigLatin = pigLatin.replaceFirst(firstLetter, "i");
                System.out.println("Piglatin: " + pigLatin + "ee");
                break;
            }
        }
        in.close();
    }
}
