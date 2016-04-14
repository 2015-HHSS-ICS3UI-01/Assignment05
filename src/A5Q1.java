
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
        System.out.println("Please enter a word to translate in matten English.");
        String word = input.nextLine();
        //Saving the vowels
        if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u") || word.startsWith("y")) {
            word = word.replaceFirst("a", "i");
            if (word.startsWith("e")) {
                word = word.replaceFirst("e", "i");
            } else {
                word = word.replace("e", "i");
            }
            word = word.replace("i", "i");
            word = word.replace("o", "i");
            word = word.replace("u", "i");
            word = word.replace("y", "i");
        }
        System.out.println("Your word translated is " + word);

        //if(word.contains("a") || word.contains("e") || word.contains("a") || word.contains("a") || word.contains("a") || word.contains("a"))
    }
}
