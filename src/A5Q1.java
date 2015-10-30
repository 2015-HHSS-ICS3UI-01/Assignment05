
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
        
        while (true){
        
        //tell user to enter a word for translating
        
        System.out.println("Please enter a word.");
        
        //store the word in a string
        
        String word = input.nextLine();
        
        if (word.equals("end")){
            break;
        
        //if the word starts with a vowel
        
        }else if (word.startsWith("a")
                
                || word.startsWith("e")
                || word.startsWith("i")
                || word.startsWith("o")
                || word.startsWith("u")){
            
            String firstLetter = word.substring(0,1);
            
            String i = word.replaceFirst(firstLetter, "i");
            
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
                
        // if the word starts with a consonant
                
        }else{ while  (!word.startsWith("a") 
                
                || !word.startsWith("e")
                || !word.startsWith("i")
                || !word.startsWith("o")
                || !word.startsWith("u")
                || !word.startsWith("y")){
            
            String firstConsonant = word.substring(0,1);
            
            String last = word.substring(1);
            
            word = last + firstConsonant;
            
                if (word.startsWith("a")
                
                || word.startsWith("e")
                || word.startsWith("i")
                || word.startsWith("o")
                || word.startsWith("u")
                || word.startsWith("y")){
                
                String firstVowel = word.substring(0,1);
                
                String i = word.replaceFirst(firstVowel, "i");
                
                word = i;
                
                    
                        if (word.endsWith("a")
                        
                        || word.endsWith("e")
                        || word.endsWith("i")
                        || word.endsWith("o")
                        || word.endsWith("u")){
                    
                    word = word + "hee";
                    
                    System.out.println(word);
                    
                    break;
                    
                }else{ word = word + "ee";
                
                    System.out.println(word);
                    
                    break;
                
                
                
                    
                            
                        }
                    }
                }
            }
        }
    }
}               
       
            
            
        
    
            
            
            
  