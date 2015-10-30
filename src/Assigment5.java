
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bettk6516
 */
public class Assigment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //improts Scanner 
        Scanner input = new Scanner(System.in);
       //text out and user input of the desired word to be translated
        System.out.println("Enter the word you wish to translate(type END to quit the program)");
        String word = input.nextLine();
        //loops forever 
        while(true){
       //if the word entered is END the program ends
            if(word.equals("END") ){
        break;
    }
        
            String pLat = word;
            //if the word starts with a vowel
         if(pLat.startsWith("a") 
                 || pLat.startsWith("e") 
                 || pLat.startsWith("i") 
                 || pLat.startsWith("o")
                 || pLat.startsWith("u")){
           
            
        String firstV = pLat.substring(0);
        String restOfWord = pLat.substring(1);
             System.out.println(firstV);
             
         
        
             
         }
         
        }           
    }
}
