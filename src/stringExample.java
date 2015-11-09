
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class stringExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner to get input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a word");
        String word = input.nextLine();
        
        int numCharts = word.length();
        System.out.println("The word is " + numCharts + " long");
        if(word.equalsIgnoreCase("cat")){
            System.out.println("Meow!");
        }
        String upper = word.toUpperCase();
        String lower = word.toLowerCase();
        
        System.out.println("The word in Uppercase is " + upper);
        System.out.println("The word in Lowercase is " + lower);
        
        String leet = word.replace("e", "3");
        leet = leet.replace("a", "4");
        leet = leet.replace("l", "1");
        leet = leet.replace("s", "z");
        leet = leet.replace("o", "0");
        System.out.println("Leet speak: " + leet);
        
        String pigLatin = word;
        if(pigLatin.startsWith("a") 
                || pigLatin.startsWith("e")
                || pigLatin.startsWith("i")){
                pigLatin = pigLatin + "yay";
        }//Does not start with a vowel
        else{
            int aFound = pigLatin.indexOf("a");
            String first = pigLatin.substring(0, aFound);
            String last = pigLatin.substring(aFound);
            pigLatin = last + first + "ay";
        }
        System.out.println("In PigLatin: " + pigLatin);
    
        
    }
}
