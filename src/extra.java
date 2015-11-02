
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String pigLatin;
        String first;
        String last;
        System.out.println("Please enter a word");
        String word = in.nextLine();
        
      
        if (word.startsWith("a")
                || word.startsWith("e")
                || word.startsWith("i")
                || word.startsWith("o")
                || word.startsWith("u")) {

             String firstLetter = word.substring(0,1);
             String i = word.replace(firstLetter, "i");
             
             pigLatin = i;
        
        if(word.endsWith("a")
                ||word.endsWith("e")
                ||word.endsWith("i")
                ||word.endsWith("o")
                ||word.endsWith("u")){
            System.out.println("In pigLatin: "+ pigLatin + "hee");
            
        }if(!word.endsWith("a")
                &&!word.endsWith("e")
                &&!word.endsWith("i")
                &&!word.endsWith("o")
                &&!word.endsWith("u")){
            System.out.println("In pigLatin: "+ pigLatin + "ee");}
        
        }
        first = word.substring(0,1);
             last = word.substring(1);
            pigLatin = last + first;
            
        while(!word.startsWith("a")
                && !word.startsWith("e")
                && !word.startsWith("i")
                && !word.startsWith("o")
                && !word.startsWith("u")){
            
            
            
            if(word.equals("END")){
                System.out.println("No words? K. BYE");
                break;
            }
           
              
            
            if(!pigLatin.startsWith("a")
                    && !pigLatin.startsWith("e")
                    && !pigLatin.startsWith("o")
                    && !pigLatin.startsWith("u")
                    && !pigLatin.startsWith("i")
                    && !pigLatin.startsWith("y")){
                 first = pigLatin.substring(0,1);
             last = pigLatin.substring(1);
               pigLatin = last+ first;
              
              
              if(pigLatin.startsWith("o")
                      ||pigLatin.startsWith("a")
                      ||pigLatin.startsWith("e")
                      ||pigLatin.startsWith("u")){
                  String firstLetter = pigLatin.substring(0,1);
             pigLatin = pigLatin.replace(firstLetter, "i");
                  System.out.println("In pigLatin: " + pigLatin + "ee");
                  break;
              }
            }else{
                String firstLetter = pigLatin.substring(0,1);
             pigLatin = pigLatin.replace(firstLetter, "i");
                System.out.println("Piglatin: " +pigLatin + "ee");
                break;
            }
    }
    // ONE ERROR HOWEVER, IT SOMEHOW CONVERTS ALL VOWELS TO I'S FIX ASAP, ASK MR. LAMONT FOR FURTHER ASSISTANCE
}
}
