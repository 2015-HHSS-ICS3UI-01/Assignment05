
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramli8368
 */
public class Translator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
      Scanner in = new Scanner(System.in);

        System.out.println("Please enter a word to translate(TYPE END TO END PROGRAM)");
        String word = in.nextLine();
        
        String pigLatin = word.replace("a", "i");
        
        if(word.charAt(0) != 'i' && word.charAt(0) != 'y' && word.charAt(0) != 'a' && word.charAt(0) != 'e' && word.charAt(0) != 'u'){
        String first = word.substring(0,1); 
        String last = word.substring(1);
       
        }        
        
        if(pigLatin.startsWith("a")
            || pigLatin.startsWith("y")
            || pigLatin.startsWith("e")
            || pigLatin.startsWith("i")
            || pigLatin.startsWith("o")
            || pigLatin.startsWith("u")){
         
            
            
        pigLatin = pigLatin + "hee";
        
            System.out.println("In Piglatin: " + pigLatin);   
        }
            
          
           
        } 
            
    }
        
       




