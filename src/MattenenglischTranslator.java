
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class MattenenglischTranslator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make a scanner
        Scanner input = new Scanner(System.in);
        //asks user to enter a word to be tranlated
        System.out.println("Please enter a word");
        String word = input.nextLine();

        //checks the rules
        String matte = word;
        //srtats with a vowel
        if (matte.startsWith("a")
                || matte.startsWith("e")
                || matte.startsWith("i")
                || matte.startsWith("o")
                || matte.startsWith("u")) {
            matte = matte.replaceFirst("a", "i");
            matte = matte + "ee";
        } else {
            int aFound = matte.indexOf("a");
            String first = matte.substring(0, aFound);
            String last = matte.substring(aFound);
            matte = last + first + "ee";
            matte = matte.replaceFirst("a", "i");
        }

        System.out.println("Your word translated is " + matte);



    }
}
