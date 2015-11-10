
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class A5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // New Scanner
        Scanner in = new Scanner(System.in);
        String pigLatin;
        String first;
        String last;
        System.out.println("Please enter a matten: ");
        String matten = in.nextLine();
        // Determines what vowel the word starts with 
        if (matten.startsWith("a")
                || matten.startsWith("e")
                || matten.startsWith("i")
                || matten.startsWith("o")
                || matten.startsWith("u")) {
            // Replaces the first I in the word 
            String firstLetter = matten.substring(0, 1);
            String i = matten.replace(firstLetter, "i");
            pigLatin = i;
            // Determines what vowel the word ends with 
            if (matten.endsWith("a")
                    || matten.endsWith("e")
                    || matten.endsWith("i")
                    || matten.endsWith("o")
                    || matten.endsWith("u")) {
                System.out.println("In pigLatin: " + pigLatin + "hee");
            } else {
                System.out.println("In pigLatin: " + pigLatin + "ee");
            }
        }
        // The pigLatin equation uses to rearrange the word
        first = matten.substring(0, 1);
        last = matten.substring(1);
        pigLatin = last + first;

        // Determines what vowel the word doesnt start with 
        while (!matten.startsWith("a")
                && !matten.startsWith("e")
                && !matten.startsWith("i")
                && !matten.startsWith("o")
                && !matten.startsWith("u")) {

            // Output our sentence to the user letting them know what they entered
            if (matten.equals("END")) {
                System.out.println("No mattens? Ok, Bye");
                break;
            }
            // The pigLatin equation used if the first vowel does not start with the following
            if (!pigLatin.startsWith("a")
                    && !pigLatin.startsWith("e")
                    && !pigLatin.startsWith("o")
                    && !pigLatin.startsWith("u")
                    && !pigLatin.startsWith("i")
                    && !pigLatin.startsWith("y")) {
                first = pigLatin.substring(0, 1);
                last = pigLatin.substring(1);
                pigLatin = last + first;

                // If the word starts with the following then it will replace the first i
                if (pigLatin.startsWith("o")
                        || pigLatin.startsWith("a")
                        || pigLatin.startsWith("e")
                        || pigLatin.startsWith("u")) {
                    String firstLetter = pigLatin.substring(0, 1);
                    pigLatin = pigLatin.replaceFirst(firstLetter, "i");
                    System.out.println("In pigLatin: " + pigLatin + "ee");
                    break;
                }
                // Will replace the first letter with an i 
            } else {
                String firstLetter = pigLatin.substring(0, 1);
                pigLatin = pigLatin.replaceFirst(firstLetter, "i");
                System.out.println("Piglatin: " + pigLatin + "ee");
                break;
            }
        }

    }
}
