
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lalim9800
 */
public class Assignment05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create new scanner 
        Scanner input = new Scanner(System.in);
        //ask user to enter a word they would like to translate 
        System.out.println("Please enter a word to translate to matten english ");
         //create a a string to store the users word 
        String matten = input.nextLine();
        
        
        

     //if the word starts with a vowel ,delete the first letter, add a i to the start 
        if (matten.startsWith("a")
                || matten.startsWith("e")
                || matten.startsWith("i")
                || matten.startsWith("o")
                || matten.startsWith("u")
                || matten.startsWith("y")) {
           //selecte everthing except the sirt letter and store it in the same variable 
            matten = matten.substring(1);

            //if the word ends in a vowel add the i to the start and hee to the end of the word 
            if (matten.endsWith("a")
                    || matten.endsWith("e")
                    || matten.endsWith("i")
                    || matten.endsWith("o")
                    || matten.endsWith("u")
                    || matten.endsWith("y")) {
                //if the word ends wiht vowel add i to start and hee to the end of the word 
                System.out.println("your word in matten english is " +"i" + matten + "hee");
            } else {
                //other wise only add i to the start and ee to the end 
                System.out.println("your word in matten english is " + "i" + matten + "ee");
            }
        
        }else{
            
        
       //reprat until flase 
        while (true) {
            //store the first letter in a varible 
            String first = matten.substring(0, 1);
            //store therest of the word in a varible 
            String last = matten.substring(1);


          //if the word does not start with a vowel move it to the end , repeat untill vowel is found 
            if (!matten.startsWith("a")
                    && !matten.startsWith("e")
                    && !matten.startsWith("i")
                    && !matten.startsWith("o")
                    && !matten.startsWith("u")
                    && !matten.startsWith("y")) {

                // allow same variable to eqaul the last + the first part of the word 
                matten = last + first;
            } else {
                //break, stop loop
                break;
            }

        }
        //print word ,adding i to the begining and ee to the end of the word 
        System.out.println("your word in matten english is " + "i" + matten + "ee");
        
        }


















    }
}
