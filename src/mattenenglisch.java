
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stahc1596
 */
public class mattenenglisch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        //The user can translate as many words as they like until the enter end.
        while (true){
        System.out.println("Enter a word to be translated: ");
        String word = input.nextLine();
        String mattenenglisch = word;
        
        //This is the if statement that ends the code if end if entered
        if (mattenenglisch.equalsIgnoreCase("END")){
            break;}
        
        //The code that translates the word if it starts with a vowel.
        if (mattenenglisch.startsWith("a")
                ||mattenenglisch.startsWith("e")
                ||mattenenglisch.startsWith("i")
                ||mattenenglisch.startsWith("o")
                ||mattenenglisch.startsWith("u")){
            
            //This code replaces the first word with an i.
            if (mattenenglisch.startsWith("a")){
                mattenenglisch = mattenenglisch.replaceFirst("a", "i");
            }else if (mattenenglisch.startsWith("e")){
                mattenenglisch = mattenenglisch.replaceFirst("e", "i");
            }else if (mattenenglisch.startsWith("o")){
                mattenenglisch = mattenenglisch.replaceFirst("o", "i");
            }else if (mattenenglisch.startsWith("u")){
                mattenenglisch = mattenenglisch.replaceFirst("u", "i");}
            
            //The code that adds hee to the end of the word if the word ends in a vowel.
            if (mattenenglisch.endsWith("a")
                    ||mattenenglisch.endsWith("e")
                    ||mattenenglisch.endsWith("i")
                    ||mattenenglisch.endsWith("o")
                    ||mattenenglisch.endsWith("u")
                    ||mattenenglisch.endsWith("y")){
                mattenenglisch = mattenenglisch + "hee";
       
                //Otherwise two e's are added to the end of the word.
            }else{
                mattenenglisch = mattenenglisch + "ee";
            
                //If the word doesn't begin with a vowel, then this code activates.
                //The first step is finding the first vowel in the word.
            }}else{
            int findA = mattenenglisch.indexOf("a");
            int findE = mattenenglisch.indexOf("e");
            int findI = mattenenglisch.indexOf("i");
            int findO = mattenenglisch.indexOf("o");
            int findU = mattenenglisch.indexOf("u");
            int findY = mattenenglisch.indexOf("y");
            
            //This code rearranges the integer of the vowels that aren't present in the word
            if (findA == -1){
                findA = 1000000000;
            }if (findE == -1){
                findE = 1000000000;
            }if (findI == -1){
                findI = 1000000000;
            }if (findO == -1){
                findO = 1000000000;
            }if (findU == -1){
                findU = 1000000000;
            }if (findY == -1){
                findY = 1000000000;
            }
            
            //This code seperates the word in between the vowel and the letter to the left of it.
            if (findA < findE&&findA < findI&&findA < findO&&findA < findU){
                String first = mattenenglisch.substring(0, findA);
                String last = mattenenglisch.substring(findA);
                mattenenglisch = last + first + "ee";
                mattenenglisch = mattenenglisch.replaceFirst("a", "i");
            }else if (findE < findA&&findE < findI&&findE < findO&&findE < findU){
                String first = mattenenglisch.substring(0, findE);
                String last = mattenenglisch.substring(findE);
                mattenenglisch = last + first + "ee";
                mattenenglisch = mattenenglisch.replaceFirst("e", "i");
            }else if (findI < findA&&findI < findE&&findI < findO&&findI < findU){
                String first = mattenenglisch.substring(0, findI);
                String last = mattenenglisch.substring(findI);
                mattenenglisch = mattenenglisch = last + first + "ee";
            }else if (findO < findA&&findO < findE&&findO < findI&&findO < findU){
                String first = mattenenglisch.substring(0, findO);
                String last = mattenenglisch.substring(findO);
                mattenenglisch = last + first + "ee";
                mattenenglisch = mattenenglisch.replaceFirst("o", "i");
            }else if (findU < findA&&findU < findE&&findU < findI&&findU < findO){
                String first = mattenenglisch.substring(0, findU);
                String last = mattenenglisch.substring(findU);
                mattenenglisch = last + first + "ee";
                mattenenglisch = mattenenglisch.replaceFirst("u", "i");
            }else if (findA == 1000000000 && findE == 1000000000 && findI == 1000000000 && findO == 1000000000 && findU == 1000000000){
                String first = mattenenglisch.substring(0, findY);
                String last = mattenenglisch.substring(findY);
                mattenenglisch = last + first + "ee";
                mattenenglisch = mattenenglisch.replaceFirst("y", "i");
            }
            
        }
        
        //The word and the word in mattenenglisch are then spit out to the user.
        System.out.println(word + " is translated into " + mattenenglisch);}
        System.out.println("Goodbye");
    }
}
