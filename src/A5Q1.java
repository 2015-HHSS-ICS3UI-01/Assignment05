
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        while (true) {
            // Ask user to input the word wished to be translated
            System.out.println("Please enter a word you wish to translate in Mattenenglish(Type END to quit the program).");
            String word = input.nextLine();
            StringBuilder sBuilder = new StringBuilder(word);
            // If the user inputs 'END', then the translator ends
            if (word.equals("END")) {
                break;
            }
            // Delete the very first letter and add it to the end
            int first = 1;
            // Delete first letter than add to the end!
            if (first != -1) {
                // Grabs all the letters up until the first L
                String starting = sBuilder.substring(0, first);
                // Gets rid of everything up until the L
                sBuilder.delete(0, first);
                // adds the starting to the end
                sBuilder.append(starting);
            }

            // Changing the starting vowel into an 'i'
            if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u")) {

                if (word.startsWith("a")) {
                    word = word.replaceFirst("a", "i");
                } else if (word.startsWith("e")) {
                    word = word.replaceFirst("e", "i");
                } else if (word.startsWith("i")) {
                    word = word.replaceFirst("i", "i");
                } else if (word.startsWith("o")) {
                    word = word.replaceFirst("o", "i");
                } else if (word.startsWith("u")) {
                    word = word.replaceFirst("u", "i");
                } else if (!word.startsWith("y")) {
                    sBuilder.append("ee");
                    sBuilder.replace(0, 1, "i");

                }

                if (word.endsWith("a") || word.endsWith("e") || word.endsWith("i") || word.endsWith("o") || word.endsWith("u") || word.endsWith("y")) {
                    word = word + "hee";
                } else {
                    word = word + "ee";
                }
                System.out.println("Your word in Mattenenglish is " + word + ".");
            } else {

                // ADD 'Y' THIRD RULE! Fix up with rhythm!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                // Go through each letter of the input (NEEDED?) 
                for (int i = 0; i < sBuilder.length(); i++) {
                    if (sBuilder.charAt(i) == 'a'
                            || sBuilder.charAt(i) == 'e'
                            || sBuilder.charAt(i) == 'i'
                            || sBuilder.charAt(i) == 'o'
                            || sBuilder.charAt(i) == 'u'
                            || sBuilder.charAt(i) == 'y') {
                        // Replace vowel with an 'i'
                        sBuilder.replace(i, i + 1, "i");
                        sBuilder.append("ee");
                        break;
                    }
                }

                // Look for a lowercase vowel || DON'T THINK YOU NEED THIS!
                int first1 = sBuilder.indexOf("a" + "e" + "i" + "o" + 'u' + 'y');
                // Found a vowel
                if (first1 != -1) {
                    // Grabs all the letters up until the first vowel
                    String starting = sBuilder.substring(0, first1);
                    // Gets rid of everything up until the end
                    sBuilder.delete(0, first1);
                    // adds the starting to the end
                    sBuilder.append(starting);
                }
                System.out.println("Your word in Mattenenglish is " + sBuilder + ".");
            }
        }
    }
}
