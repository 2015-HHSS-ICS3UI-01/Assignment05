
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
        // if y is a consonant, but not at the start, then a vowel will likely be before it therefore 
        // the y will not be touched also y at the end of a word is always a vowel
        
        // create a scanner to input words
        Scanner input = new Scanner(System.in);
        
        // create variable to understand if the program should stop
        boolean translate = true;
        
        // while words are continued to be translated then continue looping
        while(translate){
            
            // ask the user what word they want to translate
            System.out.print("Please enter the word to translate (Type END to quit the program): ");
            String word = input.nextLine();

            // create variable for the translated word
            String mattenglisch = "";

            // once the user enters END, including the capitals then the program will stop
            // otherwise the word entered will continue to be translated
            if(!word.equals("END")){

                // convert user input to lower case
                word = word.toLowerCase();
                
                // if the word starts with any vowel not including y then it will be treated as follows
                if(  word.startsWith("a") || word.startsWith("e") || word.startsWith("i") ||
                     word.startsWith("o") || word.startsWith("u")){

                    // create string for the first vowel which is the first letter of the word
                    String afterFirstVowel = word.substring(1);

                    // take out vowel and add "i" 
                    mattenglisch = "i" + afterFirstVowel;

                    // if the word ends with a vowel including "y" then "hee" will be added to the end of the word
                    if( word.endsWith("a") || word.endsWith("e") || word.endsWith("i") ||
                        word.endsWith("o") || word.endsWith("u") || word.endsWith("y")){
                        mattenglisch = mattenglisch + "hee";
                        
                    // if the word ends with a consonant then "ee" will be added
                    } else{
                        mattenglisch = mattenglisch + "ee";
                    }

                // the word starts with a consonant so then move all the consonants up to the first 
                // vowel (A, E, I, O, U, sometimes Y) to the end of the word, add ee and change the 
                // first vowel into "i"    NOTE: Letter "y" is treated as consonant when it's the first
                // letter in the word
                } else{

                   // Look for the first vowel in the word but skip the first character since
                   // we know the first letter is consontant (including "y" )
                   int vowelFoundAt = -1;
                   for( int index = 1; index < word.length() && vowelFoundAt == -1; index = index + 1 ) {
                       if (  word.charAt(index) == 'a' ||  word.charAt(index) == 'e' ||
                             word.charAt(index) == 'i' ||  word.charAt(index) == 'o' ||
                             word.charAt(index) == 'u' ||  word.charAt(index) == 'y'  ) {
                            // vowel has been found 
                            vowelFoundAt = index;
                        } 
                    }
                    
                   // if a vowel was found then move all consonants up to the first vowel to the end of word
                   if ( vowelFoundAt != -1 ) {
                        String consonantsBeforeVowel = word.substring(0, vowelFoundAt);
                        String restAfterVowel = word.substring(vowelFoundAt + 1);
                        
                        // put the consonant at the end of the word
                        // replace first vowel with a "i" and add "ee" to the end
                        mattenglisch = "i" + restAfterVowel + consonantsBeforeVowel + "ee";
                   } 
                   // no vowel found, no changes for translation
                   else {
                       mattenglisch = word;
                   }
                }
                
                // display the outcome
                System.out.println(word + " in mattenglisch is " + mattenglisch);
            
            // if the user enters "END" then stop the program
            }else{
                System.out.println("End Translations");
                translate = false;
            }
        }
        // close input scanner
        input.close();
    }
}
