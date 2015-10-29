
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
        String word = input.nextLine();
        String mattenenglisch = word;

        //to end the program
        String end = "END";
        if (mattenenglisch.equalsIgnoreCase(end)) {
        }
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
            //add an i at the beginning 
            String last = mattenenglisch.substring(1);
            mattenenglisch = "i" + last + "hee";
        } //if word starts with but doesnt end with a vowel
        else if (mattenenglisch.startsWith("a")
                || mattenenglisch.startsWith("e")
                || mattenenglisch.startsWith("i")
                || mattenenglisch.startsWith("o")
                || mattenenglisch.startsWith("u")) {
            //add an i at the beginning
            String lastNo2 = mattenenglisch.substring(1);
            mattenenglisch = "i" + lastNo2 + "ee";
        } else {
            String first3 = mattenenglisch.substring(0, 1);
            String lastNo3 = mattenenglisch.substring(1);
            mattenenglisch = "i" + lastNo3 + first3 + "ee";
        }
        System.out.println(word + " in mattenenglisch is " + mattenenglisch);


    }
}
