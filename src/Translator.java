/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author malcr1272
 */
public class Translator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make scanner
       Scanner in = new Scanner(System.in);
       
       //create string for the word
       String word = "";
       
       //make while loop to ask for words to translate
       while (!word.equals("END")){
       System.out.println("Please enter a word to translate(Type END to quit the program): ");
       word = in.nextLine();
           
       if(word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u")){
       String latin  = word.replace(""+word.charAt(0), "i");
       
       if (word.endsWith("a") || word.endsWith("e") || word.endsWith("i") || word.endsWith("o") || word.endsWith("u")){
           latin = latin + "hee";
       }else{
           latin = latin + "ee";
       }
       System.out.println(word + " in Mattenenglisch is " + latin);
       
       }else{
       int length = word.length();
       for(int i = 0; i < length; i = i+ 1){
           if(word.charAt(i) == 'a' || 
              word.charAt(i) == 'e' ||
              word.charAt(i) == 'i' ||
              word.charAt(i) == 'o' ||
              word.charAt(i) == 'u'){
                      
             String vowel = word.substring(0, i);
               
           }
       }
           
       }
           
       }
    }
}
