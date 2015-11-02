
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mitrm7692
 */
public class MattenänglischTranslator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner to get input
        Scanner input = new Scanner(System.in);
        //Get user input
        System.out.println("Please enter a word(Type END to quit the program):");
        //String word is on the next line
        String word = input.nextLine();
        //String matten is equal to word
        String matten = word;
        //if END is typed it skips the whole program and if END is not typed programs starts
        if (word.equals("END")) {
            //starts with a vowel
        } else if (matten.startsWith("a")
                || matten.startsWith("e")
                || matten.startsWith("i")
                || matten.startsWith("o")
                || matten.startsWith("u")) {
            //Remove first letter from word and put it to the end of the word
            String letter1 = matten.substring(0, 1);
            //Other part of word after first letter is removed
            String nextLetters = matten.substring(1);
            //New first letter is "i"
            letter1 = "i";
            //If word ends with a vowel
            if (matten.endsWith("a")
                    || matten.endsWith("e")
                    || matten.endsWith("i")
                    || matten.endsWith("o")
                    || matten.endsWith("u")) {
                //If the word ends in a vowel add hee to the end
                matten = letter1 + nextLetters + "hee";
            } else {
                //If the word does not end in a vowel add ee to the end
                matten = letter1 + nextLetters + "ee";
            }
            //If program starts with a vowel
        } else {
            //Keeps loop going is word starts with a vowel
            while (true) {
                //Remove first letter from word and put it to the end of the word
                String first = matten.substring(0, 1);
                //Other part of word after first letter is removed
                String last = matten.substring(1);
                //Matten word is word after first letter is moved plus the first letter
                matten = last + first;
                //If word starts with a vowel
                if (matten.startsWith("a")
                        || matten.startsWith("e")
                        || matten.startsWith("i")
                        || matten.startsWith("o")
                        || matten.startsWith("u")
                        || matten.startsWith("y")) {
                    //Remove first letter from word and put it to the end of the word
                    String letter1 = matten.substring(0, 1);
                    //Other part of word after first letter is removed
                    String nextLetters = matten.substring(1);
                    //New first letter is "i"
                    letter1 = "i";
                    //matten word ends with ee is it starts with a vowel
                    matten = letter1 + nextLetters + "ee";
                    //End loop
                    break;
                }
            }
        }
        //If END is typed in do not translate it
        if (!matten.equals("END")) //Scanner outputs word translated in matten
        {
            System.out.println("In Mattenänglisch: " + matten);
        }
        //finish with scanner
        input.close();
    }
}
