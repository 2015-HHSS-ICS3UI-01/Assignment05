
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
            word.indexOf('a');
            int a = input.nextInt();
            word.indexOf('e');
            int e = input.nextInt();
            word.indexOf('i');
            int i = input.nextInt();
            word.indexOf('o');
            int o = input.nextInt();
            word.indexOf('u');
            int u = input.nextInt();

            //for loop??
            if (word.charAt(1) == ('a')
                    || word.charAt(1) == ('e')
                    || word.charAt(1) == ('i')
                    || word.charAt(1) == ('o')
                    || word.charAt(1) == ('u')) {
                String one = word.substring(1);
            } else if(word.charAt(2) == ('a')
                    || word.charAt(2) == ('e')
                    || word.charAt(2) == ('i')
                    || word.charAt(2) == ('o')
                    || word.charAt(2) == ('u')) {
                String two = word.substring(2);
            } else if(word.charAt(3) == ('a')
                    || word.charAt(3) == ('e')
                    || word.charAt(3) == ('i')
                    || word.charAt(3) == ('o')
                    || word.charAt(3) == ('u')) {
                String three = word.substring(2);
            } 
        } mattenenglisch = "i" + word + "ee";
        System.out.println(word + " in mattenenglisch is " + mattenenglisch);


    }
}
