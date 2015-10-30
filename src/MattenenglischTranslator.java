
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class MattenenglischTranslator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program that will translate english words into mattenglisch words
        // it will first ask what word in which the user wants to translate
        // and then displays the answer
        
        // the vowel y will be treated as long as it is not the first letter (consonants) than it is a vowel
        
        // create a scanner to input words
        Scanner input = new Scanner(System.in);
        
        // create variable to understand if the program should stop
        boolean translate = true;
        
        // while words are continued to be translated then continue looping
        while(translate){
            // ask the user what word they want to translate
            System.out.print("Please enter the word to translate (Type END to quit the program): ");
            String word = input.nextLine();

            // create variable to change from the word into the mattenglisch language
            String mattenglisch = word;

            // once the user enters END, including the capitals then the program will stop
            // otherwise the word entered will continue to be translated
            if(!mattenglisch.equals("END")){

                // if the word starts with any vowel not including y then it will be treated as follows
                if(mattenglisch.startsWith("a") || mattenglisch.startsWith("e") || mattenglisch.startsWith("i") || mattenglisch.startsWith("o") || mattenglisch.startsWith("u")){

                    // create string for the first vowel which is the first letter of the word
                    String firstVowel = mattenglisch.substring(1);

                    // take out vowel and add "i" 
                    mattenglisch = "i" + firstVowel;

                    // if the word ends with a vowel including "y" then "hee" will be added to the end of the word
                    if(word.endsWith("a") || word.endsWith("e") || word.endsWith("i") || word.endsWith("o") || word.endsWith("u") || word.endsWith("y")){
                        mattenglisch = mattenglisch + "hee";

                    // if the word ends with a constinant then "ee" will be added
                    } else{
                        mattenglisch = mattenglisch + "ee";
                    }

                // if the word starts with a constinant then it will do as follows
                } else{

                    // cut off first letter and put it at the end since it is already known it is not a vowel
                    // create variables for the first letter of the word and the rest of the word
                    String firstLetter = mattenglisch.substring(0, 1);
                    String restOfWord = mattenglisch.substring(1);
                    // put the first letter now at the end of the word
                    mattenglisch = restOfWord + firstLetter;

                    // while there is no vowel at the start of the word than do as follows
                    while(!mattenglisch.startsWith("a") && !mattenglisch.startsWith("e") && !mattenglisch.startsWith("i") && !mattenglisch.startsWith("o") && !mattenglisch.startsWith("u") && !mattenglisch.startsWith("y")){

                        // create variables for the consonants at the start of the word and the rest of the word without the consonant
                        String consonants = mattenglisch.substring(0, 1);
                        String withoutConsonant = mattenglisch.substring(1);
                        // put the consonant at the end of the word
                        mattenglisch = withoutConsonant + consonants;
                    }
                    
                    // create variable for the word without the first vowel
                    String withoutFirstVowel = mattenglisch.substring(1);
                    // replace first vowel with a "i" and add "ee" to the end
                    mattenglisch = "i" + withoutFirstVowel + "ee";
                }
                    // display the outcome
                    System.out.println(word + " in mattenglisch is " + mattenglisch);
            
            // if the user enters "END" then stop the program
            }else{
                System.out.println("End Translations");
                translate = false;
            }
        }
        input.close();
    }
}
