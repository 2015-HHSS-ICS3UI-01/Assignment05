
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kangh4484
 */
public class assignment05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter a word to translate(Type END to quit the program): ");
            String word = input.nextLine();
            if (word.equals("END")) {
                break;
            }
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
                }
                if (word.endsWith("a") || word.endsWith("e") || word.endsWith("i") || word.endsWith("o") || word.endsWith("u") || word.endsWith("y")) {
                    word = word + "hee";
                } else {
                    word = word + "ee";
                }
            }else {
                
            }


            System.out.println(word);

        }
    }
}
