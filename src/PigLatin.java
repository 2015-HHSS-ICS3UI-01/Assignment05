

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hadik9595
 */
public class PigLatin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Generate a scanner
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a word");
        String word = in.nextLine();
   
        
        
        if (word.startsWith("a")
                || word.startsWith("e")
                || word.startsWith("i")
                || word.startsWith("o")
                || word.startsWith("u")) {

             String firstLetter = word.substring(0,1);
             String i = word.replace(firstLetter, "i");
             
            String pigLatin = i + "hee";
            System.out.println("In pigLatin: " + pigLatin);
            
        }
        
        
            
          if(word.charAt(2) == 'i' && word.charAt(2) =='a'&&word.charAt(2) == 'e'&&word.charAt(2) == 'u'&&word.charAt(2) == 'o' ){
              String first = word.substring(0,2);
            String last = word.substring(2);
            String pigLatin = last + first + "ee"; 
            System.out.println("IN Piglatin: " + pigLatin);
          
          }else{
            // This is for words that have a vowel after the first letter
            String first = word.substring(0,1);
            String last = word.substring(1);
            String firstLetter = word.substring(0,2);
            String pigLatin = word.replace(firstLetter, "i");
             pigLatin = pigLatin + first + "ee"; 
             
            
            System.out.println("Piglatin: " + pigLatin);}
            
        
            
        
            
            
                
           
    
    }
}


