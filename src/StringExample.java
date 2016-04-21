
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class StringExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        // Get a word from the user
        System.out.println("Please enter a word.");
        String word = input.nextLine();

        // Output the length of the word
        System.out.println("Your word is " + word.length() + " characters long.");
        if (word.startsWith("L")) {
            System.out.println("Your word begins with an L.");
        } else {
            System.out.println("Your word does not begin an L.");
        }


        // Change all 'a' to '@'
        String newWord = word.replace("a", "@");
        System.out.println(newWord);

        //using StringBuilder
        StringBuilder sBuilder = new StringBuilder(word);
        // Find the first occurring 'a'
        int firstA = sBuilder.indexOf("a");
        // If an 'a' is found
        if (firstA != -1) {
            // Remove the 'a'
            sBuilder.deleteCharAt(firstA);
            // put an @ symbol in its place
            sBuilder.insert(firstA, "@");
        }

        // Replace all 's' with 5
        // Go through every character of the word
        for (int i = 0; i < sBuilder.length(); i++) {
            if (sBuilder.charAt(i) == 's') {
                // Replace(start position, up to position, replace with '5'
                sBuilder.replace(i, i + 1, "5");
            }
        }

        // Look for a lowercase L
        int firstL = sBuilder.indexOf("l");
        // Found an L
        if (firstL != -1) {
            // Grabs all the letters up until the first L
            String starting = sBuilder.substring(0, firstL);
            // Gets rid of everything up until the L
            sBuilder.delete(0, firstL);
            // adds the starting to the end
            sBuilder.append(starting);
        }

        //Extra
        //[A-Z]+/d

        // Output the new word
        System.out.println(sBuilder);

    }
}
