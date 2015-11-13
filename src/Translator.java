 
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alled7036
 */
public class Translator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make scanner
        Scanner input = new Scanner(System.in);
        
        //make string
       
        
        String word = input.nextLine();
        
        //Length of word
        int length = word.length();
        
        String newWord  = word.replaceFirst("e", "i");
        newWord  = newWord.replaceFirst("a", "i");
        newWord  = newWord.replaceFirst("y", "i");
        newWord  = newWord.replaceFirst("u", "i");
        newWord  = newWord.replaceFirst("i", "i");
        newWord  = newWord.replaceFirst("o", "i");
        System.out.println("Your new word is " + newWord + "ee");
        
        //PigLatin
        String piglatin = newWord;
        
        for(int i = 0; i < length; i++){
            if(piglatin.charAt(i) == 'e' || piglatin.charAt (i) == 'a'|| piglatin.charAt (i) == 'i' || piglatin.charAt(i) == 'o'||piglatin.charAt(i) == 'u'|| piglatin.charAt(i) =='y'  ){
              String first = piglatin.substring(0, i);
              String last = piglatin.substring(i);
              piglatin = last + first + "ee";
             break;
            }
        }
        System.out.println("The word in piglatin is " + piglatin);
       
        
        
    }
}
