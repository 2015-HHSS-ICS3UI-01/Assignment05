
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

        //Ask user to input the word wished to be translated
        System.out.println("Please enter a word to translate.");
        String word = input.nextLine();
        //Saving the vowels
        int a = word.indexOf("a");
        int e = word.indexOf("e");
        int i = word.indexOf("i");
        int o = word.indexOf("o");
        int u = word.indexOf("u");
        int y = word.indexOf("y");

        // Change all 'a' to '@'
        String newWord = word.replace("a", "ee");
        System.out.println(newWord);

        //using StringBuilder
        StringBuilder sBuilder = new StringBuilder(word);
        // Find the first occurring 'a'
        int firstVowel = sBuilder.indexOf("a");
        // If an 'a' is found
        if (firstVowel != -1) {
            // Remove the 'a'
            sBuilder.deleteCharAt(firstVowel);
            // put an @ symbol in its place
            sBuilder.insert(firstVowel, "ee");
            sBuilder.append(word);
        }
        int firstL = sBuilder.indexOf("a");
        // Found an L
        if (firstL != -1) {
            // Grabs all the letters up until the first L
            String starting = sBuilder.substring(0, firstL);
            // Gets rid of everything up until the L
            sBuilder.delete(0, firstL);
            // adds the starting to the end
            sBuilder.append(starting);
        }
    }
}
