
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //make scanner
        
        Scanner input = new Scanner (System.in);
        
        //tell user to enter a word for translating
        
        System.out.println("Please enter a word.");
        
        //store the word in a string
        
        String word = input.nextLine();
        
        //if the word starts with a vowel
        
        if (word.startsWith("a")
                
                || word.startsWith("e")
                || word.startsWith("i")
                || word.startsWith("o")
                || word.startsWith("u")){
            
            String firstLetter = word.substring(0,1);
            
            String i = word.replace(firstLetter, "i");
            
            word = i;
                
                if (word.endsWith("a")
                        
                        || word.endsWith("e")
                        || word.endsWith("i")
                        || word.endsWith("o")
                        || word.endsWith("u")){
                    
                    word = word + "hee";
                    
                    System.out.println(word);
                    
                }else{ word = word + "ee";
                
                    System.out.println(word);
                }
        }else{ while  (!word.startsWith("a") 
                
                || !word.startsWith("e")
                || !word.startsWith("i")
                || !word.startsWith("o")
                || !word.startsWith("u")){
            
            String firstConsonant = word.substring(0,1);
            
            String last = word.substring(1);
            
            word = last + firstConsonant;
            
            System.out.println(word);
            
                if (word.startsWith("a")
                
                || word.startsWith("e")
                || word.startsWith("i")
                || word.startsWith("o")
                || word.startsWith("u")){
                    break;
                }
        }
            
            
            
            
      
                
                    }
                
            }}
            
            
        
    
            
            
            
  