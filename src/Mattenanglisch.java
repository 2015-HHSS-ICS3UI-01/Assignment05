
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agott2059
 */
public class Mattenanglisch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        //loop
        while (true) {
            System.out.println("Enter word to translate: ");
            String english = input.nextLine();
            //if input is END, then stop the program
            if (english.contains("END")) {
                break;
            }


            Scanner words = new Scanner(english);

            String output = "";
            while (words.hasNext()) {
                String newword = words.next();

                //if the word starts with a vowel
                if (newword.startsWith("a") || newword.startsWith("e") || newword.startsWith("i") || newword.startsWith("o") || newword.startsWith("u")) {
                    //store the first letter
                    char first = newword.charAt(0);
                    //remove first letter
                    newword = newword.substring(1);
                    //add i to the beginning
                    newword = "i" + newword;
                    //if the word ends with a vowel
                    if (newword.endsWith("a") || newword.endsWith("e") || newword.endsWith("i") || newword.endsWith("o") || newword.endsWith("u") || newword.endsWith("y")) {
                        //end with hee
                        newword = newword + "hee";
                    } //end with ee
                    else {
                        newword = newword + "ee";
                    }



                } else //word starts with consonant
                {
                    //store first letter
                    char first = newword.charAt(0);
                    //remove first letter
                    newword = newword.substring(1);
                    //remove every consonant at the beginning
                    while (newword.startsWith("b") || newword.startsWith("c") || newword.startsWith("d") || newword.startsWith("f") || newword.startsWith("g") || newword.startsWith("h") || newword.startsWith("j") || newword.startsWith("k") || newword.startsWith("l") || newword.startsWith("m") || newword.startsWith("n") || newword.startsWith("p") || newword.startsWith("q") || newword.startsWith("r") || newword.startsWith("s") || newword.startsWith("t") || newword.startsWith("v") || newword.startsWith("w") || newword.startsWith("x") || newword.startsWith("z") || newword.startsWith("Y")) {
                        //while(english.startsWith("a")==false || english.startsWith("e")==false  || english.startsWith("i")==false  || english.startsWith("o")==false  || english.startsWith("u")==false  || english.startsWith("y")==false  ){
                        newword = newword.substring(1);
                    }
                    //remove first letter
                    newword = newword.substring(1);
                    //add i to the beginning and then add the first letter and ee to the end

                    newword = "i" + newword + first + "ee";
                }

                output = newword + " ";
            }

            //print out the new word
            System.out.println(english + " in Mattenanglisch is: " + output);


        }
    }
}
