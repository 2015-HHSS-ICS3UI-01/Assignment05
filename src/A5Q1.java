
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //add a new scanner and integers
        Scanner input = new Scanner(System.in);
        while(true){
        int A = 0;
        int B = 0;
        
        //enter a word
        System.out.println("Please enter a word.");
        String word = input.nextLine();
        
        //end the translator
        if(word.equalsIgnoreCase("end")){
            System.out.println("Translator is turning off.");
            break;
        }
        
        //changes the words to all lower case
        word.toLowerCase();
        String trans = word;
        
        //checks if the word starts with a vowel
        if(!word.startsWith("a") && !word.startsWith("e") && !word.startsWith("i") && !word.startsWith("o") && !word.startsWith("u")){
            B = B + 1;
            
        //moves the first letter to the end of the word
            trans = trans + trans.substring(0, 1);
            A = trans.length();
            trans = trans.substring(1, A);
            
             // if the word has a y that is not at the start
            if(word.contains("y") && !word.startsWith("y")){
                trans = trans + trans.substring(0, 1);
                A = trans.length();
                trans = trans.substring(1, A);
            }
        }
        
         //check the word once more
        A = trans.length();
        trans = trans.substring(1, A);
        
        //adds 'i' to the front of the word
        trans = "i" + trans;
        
        //adds 'ee' or 'hee' to the end
        if (!trans.endsWith("h") && B == 0){
            trans = trans + "hee";
            }  else {
            trans = trans + "ee";
        }
        
        System.out.println(trans);
            }  

        }
    }

