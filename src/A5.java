
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
        
    while () {
        //to end the program
        String end = "END";
        if (mattenenglisch.equalsIgnoreCase(end)) {
            break;
        }
        //mattenenglisch
        //if word starts with a vowel
        //if word starts and ends with a vowel
        if (mattenenglisch.startsWith("a")
                || mattenenglisch.startsWith("e")
                || mattenenglisch.startsWith("i")
                || mattenenglisch.startsWith("o")
                || mattenenglisch.startsWith("u")) {
            if (mattenenglisch.endsWith("a")
                    || mattenenglisch.endsWith("e")
                    || mattenenglisch.endsWith("i")
                    || mattenenglisch.endsWith("o")
                    || mattenenglisch.endsWith("u")) {
                //add an i at the beginning 
                String last = mattenenglisch.substring(1);
                mattenenglisch = "i" + last + "hee";
            } //if word starts with but doesnt end with a vowel
            if (mattenenglisch.endsWith("b")
                    || mattenenglisch.endsWith("c")
                    || mattenenglisch.endsWith("d")
                    || mattenenglisch.endsWith("f")
                    || mattenenglisch.endsWith("g")
                    || mattenenglisch.endsWith("h")
                    || mattenenglisch.endsWith("j")
                    || mattenenglisch.endsWith("k")
                    || mattenenglisch.endsWith("l")
                    || mattenenglisch.endsWith("m")
                    || mattenenglisch.endsWith("n")
                    || mattenenglisch.endsWith("p")
                    || mattenenglisch.endsWith("q")
                    || mattenenglisch.endsWith("r")
                    || mattenenglisch.endsWith("s")
                    || mattenenglisch.endsWith("t")
                    || mattenenglisch.endsWith("v")
                    || mattenenglisch.endsWith("w")
                    || mattenenglisch.endsWith("x")
                    || mattenenglisch.endsWith("y")
                    || mattenenglisch.endsWith("z")) {
                //add an i at the beginning
                String lastNo2 = mattenenglisch.substring(1);
                mattenenglisch = "i" + lastNo2 + "ee";
            }

        } else { // if word starts with a consonant move all the consonants up to the first vowel to the end of the word, add ee and change the first vowel into i.
            String consonant = word;

            if (consonant.charAt(1) == ('a')
                    || consonant.charAt(1) == ('e')
                    || consonant.charAt(1) == ('i')
                    || consonant.charAt(1) == ('o')
                    || consonant.charAt(1) == ('u')) {
                String first = consonant.substring(0, 1);
                String last = consonant.substring(2);
                mattenenglisch = "i" + last + first + "ee";
            } else if (consonant.charAt(2) == ('a')
                    || consonant.charAt(2) == ('e')
                    || consonant.charAt(2) == ('i')
                    || consonant.charAt(2) == ('o')
                    || consonant.charAt(2) == ('u')) {
                String first = consonant.substring(0, 2);
                String last = consonant.substring(3);
                mattenenglisch = "i" + last + first + "ee";
            } else if (consonant.charAt(3) == ('a')
                    || consonant.charAt(3) == ('e')
                    || consonant.charAt(3) == ('i')
                    || consonant.charAt(3) == ('o')
                    || consonant.charAt(3) == ('u')) {
                String first = consonant.substring(0, 3);
                String last = consonant.substring(4);
                mattenenglisch = "i" + last + first + "ee";
            } else if (consonant.charAt(4) == ('a')
                    || consonant.charAt(4) == ('e')
                    || consonant.charAt(4) == ('i')
                    || consonant.charAt(4) == ('o')
                    || consonant.charAt(4) == ('u')) {
                String first = consonant.substring(0, 4);
                String last = consonant.substring(5);
                mattenenglisch = "i" + last + first + "ee";
            }
        }
        System.out.println(word + " in mattenenglisch is " + mattenenglisch);
    }
    }
}
