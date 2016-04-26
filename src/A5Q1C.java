
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author halll7908
 */
public class A5Q1C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean done = false;

        while (!done) {
            System.out.println("Please enter a word to translate! Type END to close the program.");
            String word = input.nextLine();

            // END Program
            if (word.equals("END")) {
                done = true;
                break;
            }

            StringBuilder sBuilder = new StringBuilder(word);

            for (int i = 0; i < sBuilder.length(); i++) {

                // Vowel Identification
                boolean replaced = false;
                if (word.startsWith("y")) {
                    if (sBuilder.charAt(i) == 'a' || sBuilder.charAt(i) == 'e' || sBuilder.charAt(i) == 'i' || sBuilder.charAt(i) == 'o' || sBuilder.charAt(i) == 'u') {
                        sBuilder.replace(i, i + 1, "i");
                        replaced = true;
                    }
                } else if (!word.startsWith("y")) {
                    if (sBuilder.charAt(i) == 'a' || sBuilder.charAt(i) == 'e' || sBuilder.charAt(i) == 'i' || sBuilder.charAt(i) == 'o' || sBuilder.charAt(i) == 'u' || sBuilder.charAt(i) == 'y') {
                        sBuilder.replace(i, i + 1, "i");
                        replaced = true;
                    }
                }

                if (replaced) {
                    // consonants append to end
                    String starting = sBuilder.substring(0, i);
                    sBuilder.append(starting);

                    // delete consonant at beginning
                    if (sBuilder.charAt(i) != 'a' || sBuilder.charAt(i) != 'e' || sBuilder.charAt(i) != 'i' || sBuilder.charAt(i) != 'o' || sBuilder.charAt(i) != 'u' || sBuilder.charAt(i) != 'y') {
                        sBuilder.delete(0, i);
                    }

                    // Words ending in Vowels
                    if (word.length() == 2 && word.endsWith("y")) {
                        System.out.println(word + " is " + sBuilder + "ee in Mattenenglisch.");
                        break;
                    } else if (word.endsWith("a") || word.endsWith("e") || word.endsWith("i") || word.endsWith("o") || word.endsWith("u")) {
                        System.out.println(word + " is " + sBuilder + "hee in Mattenenglisch.");
                        break;
                    } else {
                        System.out.println(word + " is " + sBuilder + "ee in Mattenenglisch.");
                        break;
                    }
                }
            }
        }
    }
}