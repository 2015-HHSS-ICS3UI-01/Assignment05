
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
        
        System.out.println("Please enter the word to translate(Type END to quit the program): ");
        String word = input.nextLine();
        String mattenglisch;
        
        if(word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u") || word.startsWith("y")){
            mattenglisch = word + "ee";
            if(word.endsWith("a") || word.endsWith("e") || word.endsWith("i") || word.endsWith("o") || word.endsWith("u") || word.endsWith("y")){
                
            }
        } else{
            mattenglisch = word;
            while(!mattenglisch.startsWith("a") || !mattenglisch.startsWith("e") || !mattenglisch.startsWith("i") || !mattenglisch.startsWith("o") || !mattenglisch.startsWith("u")){
                String first = word.substring(0, 1);
                String last = word.substring(1);
                mattenglisch = last + first;
            }
            
        }
    }
}
