
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author yuk4142
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Please enter a word to translate(Type END to quit the program): ");
            String translate = in.nextLine();

            if (translate.equals("END")) {
                break;
            }



            StringBuilder smallestsBuilder = new StringBuilder(translate); //stringbuilder for word inputed



            // if word starts with consonant
            if (translate.startsWith("b") || translate.startsWith("c") || translate.startsWith("d") || translate.startsWith("f") || translate.startsWith("g")
                    || translate.startsWith("h") || translate.startsWith("j") || translate.startsWith("k") || translate.startsWith("l") || translate.startsWith("m")
                    || translate.startsWith("n") || translate.startsWith("p") || translate.startsWith("q") || translate.startsWith("r") || translate.startsWith("s")
                    || translate.startsWith("t") || translate.startsWith("v") || translate.startsWith("w") || translate.startsWith("x") || translate.startsWith("z") || translate.startsWith("y")) {
                //find position of first vowel
                int smallest = smallestsBuilder.indexOf("a");
                //if smallest is true and e is true, if e is smaller than a OR e is TRUE and smallest is FALSE
                if (smallest != -1 && smallestsBuilder.indexOf("e") != -1 && smallestsBuilder.indexOf("e") < smallest || smallest == -1 && smallestsBuilder.indexOf("e") != -1) {
                    //make smallest number e
                    smallest = smallestsBuilder.indexOf("e");
                    //||smallestsBuilder.indexOf("e")!= -1||smallestsBuilder.indexOf("i")!= -1||smallestsBuilder.indexOf("o")!= -1||smallestsBuilder.indexOf("u")!= -1){
                }   //if smallest is true and i is true, and i is smaller than 'smallest', OR i is true and if smallest is false
                if (smallest != -1 && smallestsBuilder.indexOf("i") != -1 && smallestsBuilder.indexOf("i") < smallest || smallestsBuilder.indexOf("i") != -1 && smallest == -1) {
                    smallest = smallestsBuilder.indexOf("i");
                }   //if smallest is true and o is true and o is smaller than smallest, OR if o is true and smallest is false
                if (smallest != -1 && smallestsBuilder.indexOf("o") != -1 && smallestsBuilder.indexOf("o") < smallest || smallestsBuilder.indexOf("o") != -1 && smallest == -1) {
                    smallest = smallestsBuilder.indexOf("o");
                }
                //if smallest is true and u is true and u is smaller than smallest, OR if u is true and smallest is false
                if (smallest != -1 && smallestsBuilder.indexOf("u") != -1 && smallestsBuilder.indexOf("u") < smallest || smallestsBuilder.indexOf("u") != -1 && smallest == -1) {
                    smallest = smallestsBuilder.indexOf("u");
                }
                //if smallest is true and y is true and y is smaller than smallest AND y is not first letter, OR if y is true and smallest is false
                if (smallest != -1 && smallestsBuilder.indexOf("y") != -1 && smallestsBuilder.indexOf("y") < smallest && smallestsBuilder.indexOf("y") != 0 || smallestsBuilder.indexOf("y") != -1 && smallest == -1) {
                    smallest = smallestsBuilder.indexOf("y");
                }
                //we now have our smallest vowel, we then have to move all consonants up to it to the end o the word, and change it into i

                String firstvowel = smallestsBuilder.substring(0, smallest); //substring for position of fist vowel
                int length = translate.length(); //variable for length
                smallestsBuilder.deleteCharAt(smallest);//delete firstvowel
                smallestsBuilder.replace(smallest, smallest, "i");//replace it with i
                smallestsBuilder.replace(length, length, firstvowel);//move consonants up to first vowelto end
                smallestsBuilder.delete(0, smallest);//delete consonants up to first vowel
                smallestsBuilder.insert(length, "ee"); // adds ee to end of word

                System.out.println(translate + " in Mattenenglisch is " + smallestsBuilder);//print out final word

            } //start of if word starts with VOWEL
            else if (translate.startsWith("a") || translate.startsWith("e") || translate.startsWith("i") || translate.startsWith("o") || translate.startsWith("u")) {//if word starts with vowel



                if (translate.endsWith("a") || translate.endsWith("e") || translate.endsWith("i") || translate.endsWith("o") || translate.endsWith("u") || translate.endsWith("y")) {// if word ends with vowel

                    smallestsBuilder.append("hee");  //add hee to end of word
                } else if (!translate.endsWith("a") || !translate.endsWith("e") || !translate.endsWith("i") || !translate.endsWith("o") || !translate.endsWith("u") || !translate.endsWith("y")) {// if word ends with consonant

                    smallestsBuilder.append("ee");  //add ee to end of word
                }



                //find smallest vowel
                int smallest = smallestsBuilder.indexOf("a");
                //if smallest is true and e is true, if e is smaller than a OR e is TRUE and smallest is FALSE
                if (smallest != -1 && smallestsBuilder.indexOf("e") != -1 && smallestsBuilder.indexOf("e") < smallest || smallest == -1 && smallestsBuilder.indexOf("e") != -1) {
                    //make smallest number e
                    smallest = smallestsBuilder.indexOf("e");
                    //||smallestsBuilder.indexOf("e")!= -1||smallestsBuilder.indexOf("i")!= -1||smallestsBuilder.indexOf("o")!= -1||smallestsBuilder.indexOf("u")!= -1){
                }   //if smallest is true and i is true, and i is smaller than 'smallest', OR i is true and if smallest is false
                if (smallest != -1 && smallestsBuilder.indexOf("i") != -1 && smallestsBuilder.indexOf("i") < smallest || smallestsBuilder.indexOf("i") != -1 && smallest == -1) {
                    smallest = smallestsBuilder.indexOf("i");
                }   //if smallest is true and o is true and o is smaller than smallest, OR if o is true and smallest is false
                if (smallest != -1 && smallestsBuilder.indexOf("o") != -1 && smallestsBuilder.indexOf("o") < smallest || smallestsBuilder.indexOf("o") != -1 && smallest == -1) {
                    smallest = smallestsBuilder.indexOf("o");
                }
                //if smallest is true and o is true and o is smaller than smallest, OR if o is true and smallest is false
                if (smallest != -1 && smallestsBuilder.indexOf("u") != -1 && smallestsBuilder.indexOf("u") < smallest || smallestsBuilder.indexOf("u") != -1 && smallest == -1) {
                    smallest = smallestsBuilder.indexOf("u");
                    //we now have first vowel
                }     //if smallest is true and y is true and y is smaller than smallest, OR if y is true and smallest is false     
                if (smallest != -1 && smallestsBuilder.indexOf("y") != -1 && smallestsBuilder.indexOf("y") < smallest || smallestsBuilder.indexOf("y") != -1 && smallest == -1) {
                    smallest = smallestsBuilder.indexOf("y");

                }

                smallestsBuilder.deleteCharAt(smallest);//delete firstvowel
                smallestsBuilder.replace(smallest, smallest, "i");//replace it with i



                System.out.println(translate + " in Mattenenglisch is " + smallestsBuilder);
            }
        }
    }
}