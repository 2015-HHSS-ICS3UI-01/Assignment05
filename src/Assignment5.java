
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rahmf8586
 */
public class Assignment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Please enter a word to translate(Type END to quit the program):");
            String word = input.nextLine();

            if (word.equals("END")) {
                break;
            }

            StringBuilder sBuilder = new StringBuilder(word);

            for (int i = 0; i < sBuilder.length(); i = i + 1) {
                if (sBuilder.charAt(i) == ('a') || sBuilder.charAt(i) == ('e') || sBuilder.charAt(i) == ('i') || sBuilder.charAt(i) == ('o') || sBuilder.charAt(i) == ('u') || (i != 0 && sBuilder.charAt(i) == ('y'))) {
                    sBuilder.replace(i, i + 1, "i");

                    String starting = sBuilder.substring(0, i);
                    sBuilder.delete(0, i);
                    sBuilder.append(starting);

                    if (i > 0) {
                        sBuilder.append("ee");
                    }

                    if (i == 0) {
                        sBuilder.replace(i, i + 1, "i");

                        if (word.endsWith("a") || word.endsWith("e") || word.endsWith("i") || word.endsWith("o") || word.endsWith("u") || word.endsWith("y")) {
                            sBuilder.append("hee");
                        } else {
                            sBuilder.append("ee");
                        }
                    }
                    break;
                }
            }
            System.out.println(sBuilder);
        }
    }
}
