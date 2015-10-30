

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

             

            pigLatin = word + "hee";
            System.out.println("In pigLatin: " + pigLatin);
            
        }
        
        
        if(word.charAt(0) != 'i' && word.charAt(0) !='a'&&word.charAt(0) != 'e'&&word.charAt(0) != 'u'&&word.charAt(0) != 'o' ){
            
            String first = word.substring(0,1);
            String last = word.substring(1);
            
              pigLatin = last + first + "ee"; 
            
            System.out.println("Piglatin: " + pigLatin);}
    
    }
}


