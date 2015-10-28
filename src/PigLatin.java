
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
        String pigLatin = in.nextLine();

        if (pigLatin.startsWith("a") || pigLatin.startsWith("e") || pigLatin.startsWith("i") || pigLatin.startsWith("o") || pigLatin.startsWith("u")) {

            pigLatin = pigLatin + "hee";
            System.out.println("In pigLatin: " + pigLatin);
        } else {
            int aFound = pigLatin.indexOf("a");
            String first = pigLatin.substring(0, aFound);
            
            pigLatin = pigLatin + first + "ee";
            
            

            System.out.println("In pigLatin: " + pigLatin);
        }
    }
}
