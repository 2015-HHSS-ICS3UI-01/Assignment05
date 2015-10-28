
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
        boolean vowelY;
        
        if(mattenglisch.startsWith("y")){
            vowelY = false;
        } else{
            vowelY = true;
        }
        
        if(mattenglisch.startsWith("a") || mattenglisch.startsWith("e") || mattenglisch.startsWith("i") || mattenglisch.startsWith("o") || mattenglisch.startsWith("u")){
            String withoutFirstVowel = mattenglisch.substring(1);
            mattenglisch = mattenglisch + "i";
            if(word.endsWith("a") || word.endsWith("e") || word.endsWith("i") || word.endsWith("o") || word.endsWith("u") || word.endsWith("y")){
                mattenglisch = mattenglisch + "hee";
            } else{
                mattenglisch = mattenglisch + "ee";
            }
        } else{
            while(!mattenglisch.startsWith("a") && !mattenglisch.startsWith("e") && !mattenglisch.startsWith("i") && !mattenglisch.startsWith("o") && !mattenglisch.startsWith("u")){
                String upToVowel = mattenglisch.substring(0, 1);
                String last = mattenglisch.substring(1);
                mattenglisch = last + upToVowel;
            }
            String withoutFirstVowel = mattenglisch.substring(1);
            mattenglisch = withoutFirstVowel;
            mattenglisch = "i" + mattenglisch + "ee";
        }
            System.out.println(word + " in mattenglisch is " + mattenglisch);
    }
}
