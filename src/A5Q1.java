
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moraj0721
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word");
        String word = input.nextLine();



        String Mattenenglisch = word;
//Put ee at the end if it starts with a vowel

        if (Mattenenglisch.startsWith("a")
                || Mattenenglisch.startsWith("o")
                || Mattenenglisch.startsWith("e")
                || Mattenenglisch.startsWith("u")) {
            Mattenenglisch = Mattenenglisch.substring(1);
            Mattenenglisch = "i" + Mattenenglisch;
        } else {

            while (!word.startsWith("a")
                    && !word.startsWith("e")
                    && !word.startsWith("i")
                    && !word.startsWith("o")
                    && !word.startsWith("u")) {

                if (word.equals("END")) {
                    System.out.println("No words? C ya latr alligator.");
                    break;
                }
//if word starts with a vowel
                if (!Mattenenglisch.startsWith("a")
                        && !Mattenenglisch.startsWith("e")
                        && !Mattenenglisch.startsWith("o")
                        && !Mattenenglisch.startsWith("u")
                        && !Mattenenglisch.startsWith("i")
                        && !Mattenenglisch.startsWith("y")) {
                    String first = Mattenenglisch.substring(0, 1);
                    String last = Mattenenglisch.substring(1);
                    Mattenenglisch = last + first;

                    if (Mattenenglisch.startsWith("o")
                            || Mattenenglisch.startsWith("a")
                            || Mattenenglisch.startsWith("e")
                            || Mattenenglisch.startsWith("u")) {
                        String firstLetter = Mattenenglisch.substring(0, 1);
                        Mattenenglisch = Mattenenglisch.replaceFirst(firstLetter, "i");
                        System.out.println("In Mattenenglisch: " + Mattenenglisch + "ee");
                        break;
                    }
                } else {
                    String firstLetter = Mattenenglisch.substring(0, 1);
                    Mattenenglisch = Mattenenglisch.replaceFirst(firstLetter, "i");
                    System.out.println("Mattenenglisch: " + Mattenenglisch + "ee");
                    break;
                }

            }
        }
    }
}
