
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word");
        String word = input.nextLine();



        String Matten = word;
//Put ee at the end if it starts with a vowel

        if (Matten.startsWith("a")
                || Matten.startsWith("o")
                || Matten.startsWith("e")
                || Matten.startsWith("u")) {
            Matten = Matten.substring(1);
            Matten = "i" + Matten;
        } else {

            while (!word.startsWith("a")
                    && !word.startsWith("e")
                    && !word.startsWith("i")
                    && !word.startsWith("o")
                    && !word.startsWith("u")) {

                if (word.equals("END")) {
                    System.out.println("No words? ");
                    break;
                }
//if word starts with a vowel
                if (!Matten.startsWith("a")
                        && !Matten.startsWith("e")
                        && !Matten.startsWith("o")
                        && !Matten.startsWith("u")
                        && !Matten.startsWith("i")
                        && !Matten.startsWith("y")) {
                    String one = Matten.substring(0, 1);
                    String second = Matten.substring(1);
                    Matten = second + one;

                    if (Matten.startsWith("o")
                            || Matten.startsWith("a")
                            || Matten.startsWith("e")
                            || Matten.startsWith("u")) {
                        String letter1 = Matten.substring(0, 1);
                        Matten = Matten.replaceFirst(letter1, "i");
                        System.out.println(" In Matten: " + Matten + "ee");
                        break;
                    }
                } else {
                    String letter1 = Matten.substring(0, 1);
                    Matten = Matten.replaceFirst(letter1, "i");
                    System.out.println("Matten: " + Matten + "ee");
                    break;
                }

            }
        }
    }
}

            
        
                

    

