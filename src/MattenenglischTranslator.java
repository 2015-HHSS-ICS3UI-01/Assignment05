
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


        while (true) {
            //asks user to enter a word to be tranlated
            System.out.print("Please enter a word to translate(Type END to quit the program): ");
            String word = input.nextLine();


            //checks the rules
            String matten = word;
            //translator stops if end is typed
            if (matten.equalsIgnoreCase("end")) {
                break;
            }
            //starts with a vowel
            if (matten.startsWith("a")
                    || matten.startsWith("e")
                    || matten.startsWith("i")
                    || matten.startsWith("o")
                    || matten.startsWith("u")) {
                //replaces the vowel with i unless its a y
                if (matten.startsWith("a")) {
                    matten = matten.replaceFirst("a", "i");
                }
                if (matten.startsWith("e")) {
                    matten = matten.replaceFirst("e", "i");
                }
                if (matten.startsWith("i")) {
                    matten = matten.replaceFirst("i", "i");
                }
                if (matten.startsWith("o")) {
                    matten = matten.replaceFirst("o", "i");
                }
                if (matten.startsWith("u")) {
                    matten = matten.replaceFirst("u", "i");
                }
                //if a vowel is found at the end of a word then "hee" is added
                if (matten.endsWith("a") || matten.endsWith("e") || matten.endsWith("i")
                        || matten.endsWith("o") || matten.endsWith("u") || matten.endsWith("y")) {
                    matten = matten + "hee";
                }//adds "ee" if doesn't end with vowel 
                else {
                    matten = matten + "ee";
                }
            }//if doesnt start with vowel 
            else {//checks which position vowel is in      
                for (int i = 0; i < matten.length(); i++) {
                    char vowel = matten.charAt(i);
                    //looks for vowels in a word   
                    if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o'
                            || vowel == 'u' || vowel == 'y') {
                        //takes first part until vowel and moves it to back
                        int vFound = matten.indexOf(vowel);
                        String first = matten.substring(0, vFound);
                        String last = matten.substring(vFound);
                        matten = last + first + "ee";
                        //replaces first vowel to an "i"
                        if (matten.startsWith("a")) {
                            matten = matten.replaceFirst("a", "i");
                        }
                        if (matten.startsWith("e")) {
                            matten = matten.replaceFirst("e", "i");
                        }
                        if (matten.startsWith("i")) {
                            matten = matten.replaceFirst("i", "i");
                        }
                        if (matten.startsWith("o")) {
                            matten = matten.replaceFirst("o", "i");
                        }
                        if (matten.startsWith("u")) {
                            matten = matten.replaceFirst("u", "i");
                        }
                        if (matten.startsWith("y")) {
                            matten = matten.replaceFirst("y", "i");
                        }
                        //stops checking for vowels
                        break;
                    }
                }
            }
            //tells user their word in mattenenglish
            System.out.println(word + " in Mattenenglisch is " + matten);
        }
    }
}
