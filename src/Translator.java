
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pintm1551
 */
public class Translator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here                             
        Scanner input = new Scanner(System.in);
        String eng;
        String wrd = "ee";
        int x = 0;
        System.out.println("Please enter a word to translate(Type end to quit the program):");
        eng = input.nextLine();
        eng = eng.toLowerCase();
        while (eng != "end") {
            String pig = eng;
            while (!pig.endsWith("ee")) {
                while (!pig.startsWith("a") && !pig.startsWith("e") && !pig.startsWith("i") && !pig.startsWith("o") && !pig.startsWith("u") && !pig.startsWith("y")) {
                    wrd = pig.substring(0,1) + wrd;
                }
                pig = pig + "ee";
            }
            System.out.println(eng + " in Mattenenglisch is " + pig);
            System.out.println("Please enter a word to translate(Type END to quit the program):");
            eng = input.nextLine();
        }
    }
}
