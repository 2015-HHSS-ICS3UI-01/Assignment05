
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author watsk8668
 */
public class A5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // input scanner
        Scanner input = new Scanner(System.in);

        //get the user input
        System.out.println("Please enter a word to translate(type END to quit the program): ");
        String mattenenglisch = input.nextLine();

        //mattenenglisch
        //if word starts with a vowel
        //if word starts and ends with a vowel
        if (mattenenglisch.startsWith("a")
                || mattenenglisch.startsWith("e")
                || mattenenglisch.startsWith("i")
                || mattenenglisch.startsWith("o")
                || mattenenglisch.startsWith("u")
                && mattenenglisch.endsWith("a")
                || mattenenglisch.endsWith("e")
                || mattenenglisch.endsWith("i")
                || mattenenglisch.endsWith("o")
                || mattenenglisch.endsWith("u")) {
            mattenenglisch = mattenenglisch + "hee";
            //add an i at the beginning
            
        } //if word doesnt end with a vowel
        else {
            mattenenglisch = mattenenglisch + "ee";
            //add an i at the beginning
            
        }
        System.out.println("in mattenenglisch is: " + mattenenglisch);


    }
}
