

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
        
        
       
        
        while(word.charAt(1) != 'i' || word.charAt(1) !='a'||word.charAt(1) != 'e'||word.charAt(1) != 'u'||word.charAt(1) != 'o' ){
            
            String first = word.substring(0,1);
            String last = word.substring(1);
            String pigLatin = last + first; 
            
            System.out.println("Piglatin: " + pigLatin);
        }
         if (word.startsWith("a")
                || pigLatin.startsWith("e")
                || pigLatin.startsWith("i")
                || pigLatin.startsWith("o")
                || pigLatin.startsWith("u")) {

            pigLatin = pigLatin + "hee";
            System.out.println("In pigLatin: " + pigLatin);
        } 
           

            System.out.println("In pigLatin: " + pigLatin);
        if(word.charAt(1) != 'i'){
            String first = 
    }
        
        
       
}
}