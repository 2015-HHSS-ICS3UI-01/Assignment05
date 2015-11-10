
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dawsr2694
 */
public class MattenenglishTranslator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        //Create Scanner
        Scanner input = new Scanner(System.in);
        while (true) {

            //Get user input
            System.out.println("Please enter a word to be translated: (Type END to quit the program) ");
            String word = input.nextLine();
            String translation = word;
            if (word.equals("END")) {
                break;
            }
            //Apply translation

            //Add i to the beginning of the word if it begins with a vowel
            if (translation.startsWith("a")
                    || translation.startsWith("e")
                    || translation.startsWith("i")
                    || translation.startsWith("o")
                    || translation.startsWith("u")) {
                translation = translation.substring(1);
                translation = "i" + translation;

                //add hee to the end of a word if it ends with a vowel, else add ee
                if (translation.endsWith("a")
                        || translation.endsWith("e")
                        || translation.endsWith("i")
                        || translation.endsWith("o")
                        || translation.endsWith("u")) {
                    translation = translation + "hee";
                } else {
                    translation = translation + "ee";
                }

                //Consonant translation
                //if word starts with consonnt, move all consonants up to first vowel
            } else {
                //Find length of word
                int length = translation.length();

                //for loop to search each letter for a vowel
                for (int i = 0; i < length; i++) {
                    if (translation.charAt(i) == 'a'
                            || translation.charAt(i) == 'e'
                            || translation.charAt(i) == 'i'
                            || translation.charAt(i) == 'o'
                            || translation.charAt(i) == 'u'
                            || translation.charAt(i) == 'y') {

                        //once vowel is found, move beginning half of word to after the vowel
                        String part1 = translation.substring(0, i);
                        String part2 = translation.substring(i);
                        translation = part2 + part1;
                        //change first letter (vowel) to an i
                        translation = translation.substring(1);
                        translation = "i" + translation;
                        //Add ee to end of word
                        translation = translation + "ee";
                        break;
                    }
                }
            }
            //Tell user the translation
            System.out.println(word + " in mattenenglish is " + translation);
        }
    }
}
