
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
        // create a scanner to input words
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the word to translate (Type END to quit the program): ");
        String word = input.nextLine();
        String mattenglisch = word;
        
        if(!mattenglisch.equals("END")){
            
            if(mattenglisch.startsWith("a") || mattenglisch.startsWith("e") || mattenglisch.startsWith("i") || mattenglisch.startsWith("o") || mattenglisch.startsWith("u")){
                String withoutFirstVowel = mattenglisch.substring(1);
                mattenglisch = "i" + withoutFirstVowel;
                
                if(word.endsWith("a") || word.endsWith("e") || word.endsWith("i") || word.endsWith("o") || word.endsWith("u") || word.endsWith("y")){
                    mattenglisch = mattenglisch + "hee";
                } else{
                    mattenglisch = mattenglisch + "ee";
                }
                
            } else{
                String firstLetter = mattenglisch.substring(0, 1);
                String restOfWord = mattenglisch.substring(1);
                mattenglisch = restOfWord + firstLetter;
                
                while(!mattenglisch.startsWith("a") && !mattenglisch.startsWith("e") && !mattenglisch.startsWith("i") && !mattenglisch.startsWith("o") && !mattenglisch.startsWith("u") && !mattenglisch.startsWith("y")){
                    String nonVowel = mattenglisch.substring(0, 1);
                    String withoutConstinent = mattenglisch.substring(1);
                    mattenglisch = withoutConstinent + nonVowel;
                }
                
                String withoutFirstVowel = mattenglisch.substring(1);
                mattenglisch = withoutFirstVowel;
                mattenglisch = "i" + mattenglisch + "ee";
            }
                System.out.println(word + " in mattenglisch is " + mattenglisch);
        }
    }
}
