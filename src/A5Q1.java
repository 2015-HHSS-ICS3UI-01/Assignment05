
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
            //Ask user to input the word wished to be translated
            System.out.println("Please enter a word you wish to translate in matten English.");
            String word = input.nextLine();
            StringBuilder sBuilder = new StringBuilder(word);

            //Saving the vowels
            if (word.startsWith("a")
                    || word.startsWith("e")
                    || word.startsWith("i")
                    || word.startsWith("o")
                    || word.startsWith("u")
                    || word.startsWith("y")) {
                sBuilder.deleteCharAt(0);
                sBuilder.insert(0, "i");

                // Replace every vowel with 'hee' at end
                if (word.endsWith("a")
                        || word.endsWith("e")
                        || word.endsWith("i")
                        || word.endsWith("o")
                        || word.endsWith("u")
                        || word.endsWith("y")) {
                    sBuilder.append("hee");
                } else {
                    sBuilder.append("ee");
                }
            } else {

                // Go through each letter of the input
                for (int i = 0; i < sBuilder.length(); i++) {
                    if (sBuilder.charAt(i) == 'a'
                            || sBuilder.charAt(i) == 'e'
                            || sBuilder.charAt(i) == 'i'
                            || sBuilder.charAt(i) == 'o'
                            || sBuilder.charAt(i) == 'u'
                            || sBuilder.charAt(i) == 'y') {
                        // Replace(start position, up to position, replace with 'i'
                        sBuilder.replace(i, i + 1, "i");
                        break;
                    }
                }

                // DELETE VOWEL AFTER FIRST AND MOVE TO THE END AS "EE"
                for (int i = 0; i < sBuilder.length(); i++) {
                    if (sBuilder.charAt(i) == 'a'
                            || sBuilder.charAt(i) == 'e'
                            || sBuilder.charAt(i) == 'i'
                            || sBuilder.charAt(i) == 'o'
                            || sBuilder.charAt(i) == 'u'
                            || sBuilder.charAt(i) == 'y') {
                        // Replace(start position, up to position, replace with 'i'
                        sBuilder.append("ee");
                        sBuilder.deleteCharAt(i);
                        break;
                    }
                }


                for (int i = 0; i < sBuilder.length(); i++) {
                    if (sBuilder.charAt(i) == 'a'
                            || sBuilder.charAt(i) == 'e'
                            || sBuilder.charAt(i) == 'i'
                            || sBuilder.charAt(i) == 'o'
                            || sBuilder.charAt(i) == 'u'
                            || sBuilder.charAt(i) == 'y') {
                        //      
                    } else {
                        sBuilder.append(sBuilder.charAt(i));
                        sBuilder.deleteCharAt(i);
                        break;
                    }
                }

                // Look for a lowercase vowel
                int first = sBuilder.indexOf("a" + "e" + "i" + "o" + 'u' + 'y');
                // Found a vowel
                if (first != -1) {
                    // Grabs all the letters up until the first vowel
                    String starting = sBuilder.substring(0, first);
                    // Gets rid of everything up until the end
                    sBuilder.delete(0, first);
                    // adds the starting to the end
                    sBuilder.append(starting);
                }
            }
            System.out.println(sBuilder);
        }
    }
}
