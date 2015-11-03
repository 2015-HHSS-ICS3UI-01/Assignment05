
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pircn0556
 */
public class MattenenglishTranslator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner to get input
        Scanner input = new Scanner(System.in);

        while (true) {
            //Get user input
            System.out.println("Please enter a word to translate(Type END to quit the program):");
            String matten = input.nextLine();
            String matten2 = matten;
            
            //if user enters 'END' to quit program
            if(matten.equalsIgnoreCase("END")){
                break;
            }
            //Moving consonants until first vowel
            while (true) {
                if (matten.charAt(0) == 'a'
                        || matten.charAt(0) == 'e'
                        || matten.charAt(0) == 'i'
                        || matten.charAt(0) == 'o'
                        || matten.charAt(0) == 'u') {
                    break;
                } else {
                    String first = matten.substring(0, 1);
                    String last = matten.substring(1);
                    matten = last + first;
                }
            }

            //Adding "hee" and "ee" to ends of words that start/end with a vowel
            //Ends with vowel
            if (matten.endsWith("a")
                    || matten.endsWith("e")
                    || matten.endsWith("i")
                    || matten.endsWith("o")
                    || matten.endsWith("u")) {
                matten = matten + "hee";
            } else {
                //Starts with vowel
                matten = matten + "ee";
            }

            //changing first vowel into "i"
            if (matten.startsWith("a")) {
                matten = matten.replaceFirst("a", "i");
            } else if (matten.startsWith("e")) {
                matten = matten.replaceFirst("e", "i");
            } else if (matten.startsWith("o")) {
                matten = matten.replaceFirst("o", "i");
            } else if (matten.startsWith("u")) {
                matten = matten.replaceFirst("u", "i");
            } else if (matten.startsWith("y ")) {
                matten = matten.replaceFirst("y", "i");
            }
            
            System.out.println(matten2 + " in Mattenenglisch is " + matten);


        }
    }
}
