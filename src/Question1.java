
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author howen2217
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //scan for inputs
        int i = 0;
        while (i == 0) {
            //keep asking for new words by looping
            //get a word from user
            System.out.println("Please enter a word to translate(Type END to quit the program):");
            String word = input.nextLine();
            //get user input
            if (word.equals("end")) {
                break;
            }
            //end program if user types end
            StringBuilder sBuilder = new StringBuilder(word);
            if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u")) {
                sBuilder.insert(0, "i");
                sBuilder.deleteCharAt(1);
                //if the word starts with a vowel delete the vowel and replace it with an i
                if (word.endsWith("a") || word.endsWith("e") || word.endsWith("i") || word.endsWith("o") || word.endsWith("u") || word.endsWith("y")) {
                    sBuilder.append("hee");
                    //if the word ends with a vowel add hee at the end
                    System.out.println(word + " in Mattenenglisch is " + sBuilder);
                    //output
                } else {
                    sBuilder.append("ee");
                    System.out.println(word + " in Mattenenglisch is " + sBuilder);
                    //if the word does not end with a vowel add ee to the end
                }
            } else {
                if (word.startsWith("y")) {
                    String newword1 = word.replaceFirst("[aeiou]", "i");
                    // if words start with a y replace vowels with i
                    int vowel1 = newword1.indexOf("i");
                    String start1 = newword1.substring(0, vowel1);
                    //create a string of the start of the word up to the vowel
                    String end1 = newword1.substring(vowel1);
                    //create a string of the second half of the word
                    StringBuilder sBuilder3 = new StringBuilder(end1);
                    sBuilder3.append(start1);
                    sBuilder3.append("ee");
                    //add the start to the end and add ee
                    System.out.println(word + " in Mattenenglisch is " + sBuilder3);
                    //output word
                } else {
                    String newword = word.replaceFirst("[aeiouy]", "i");
                    int vowel = newword.indexOf("i");
                    //replace vowels including y with i
                    String start = newword.substring(0, vowel);
                    String end = newword.substring(vowel);
                    //create a string of the start and end of the word
                    StringBuilder sBuilder2 = new StringBuilder(end);
                    sBuilder2.append(start);
                    sBuilder2.append("ee");
                    //add the start to the end and add ee
                    System.out.println(word + " in Mattenenglisch is " + sBuilder2);
                    //out put word
                }
            }

        }
    }
}
