
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Type a word and I will put it into Mattenenglisch.");
        Scanner input = new Scanner(System.in);
        String word = input.next();
        if(word.startsWith("a") ||
                word.startsWith("e") ||
                word.startsWith("i") ||
                word.startsWith("o") ||
                word.startsWith("u")){
            if(word.endsWith("a") ||
                    word.endsWith("e") ||
                    word.endsWith("i") ||
                    word.endsWith("o") ||
                    word.endsWith("u") ||
                    word.endsWith("y")){
                String newWord = "i" + word.substring(1) + "hee";
                System.out.println("Your transated word is: " + newWord);
            }else{
                String newWord = "i" + word.substring(1) + "ee";
                System.out.println("Your transated word is: " + newWord);
            }
        }else{
            
        }
    }
}
