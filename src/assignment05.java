
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
            //ask user to put word that want to be translated
            System.out.println("Please enter a word to translate(Type END to quit the program): ");
            String word = input.nextLine();
            String newword = word;
            //if user type END it end the loop
            if (word.equals("END")) {
                break;
            }
            //find the word that starts with vowel
            if (newword.startsWith("a") || newword.startsWith("e") || newword.startsWith("i") || newword.startsWith("o") || newword.startsWith("u")) {
                //replace a,e,i,o,u into i
                if (newword.startsWith("a")) {
                    newword = newword.replaceFirst("a", "i");
                } else if (newword.startsWith("e")) {
                    newword = newword.replaceFirst("e", "i");
                } else if (newword.startsWith("i")) {
                    newword = newword.replaceFirst("i", "i");
                } else if (newword.startsWith("o")) {
                    newword = newword.replaceFirst("o", "i");
                } else if (newword.startsWith("u")) {
                    newword = newword.replaceFirst("u", "i");
                }
                //if word end with vowel, add hee
                if (newword.endsWith("a") || newword.endsWith("e") || newword.endsWith("i") || newword.endsWith("o") || newword.endsWith("u") || newword.endsWith("y")) {
                    newword = newword + "hee";
                } else {
                    //if word doesn't end with vowel, add ee
                    newword = newword + "ee";
                }
                //show the word translated
                System.out.println(word + "  in Mattenenglisch is " + newword);
            } else {
                //search find the vowel one after the other
                for (int i = 0; i < newword.length(); i++) {
                    char v = newword.charAt(i);
                    StringBuilder sb = new StringBuilder(newword);
                    if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u' || v == 'y') {
                        int fv = newword.indexOf(i);
                        //find the first vowel and translate to Mattenenglisch
                        if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u'||!newword.startsWith("y")) {

                            sb.append(sb.substring(0, i));
                            sb.delete(0, i);
                            sb.append("ee");
                            sb.replace(0, 1, "i");
                            System.out.println(word + "  in Mattenenglisch is " + sb);
                            break;
                        }


                    }

                }


            }




        }
    }
}
