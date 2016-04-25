
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author singk4158
 */
public class Assignment05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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

//replace a,e,i,o,u and make it i
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
//if the word ends with a vowel add hee
      
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
             char at = newword.charAt(i);
             StringBuilder sbd = new StringBuilder(newword);
        if (at == 'a' || at == 'e' || at == 'i' || at == 'o' || at == 'u' || at == 'y') {
             int fv = newword.indexOf(i);
//find the first vowel and translate to Mattenenglisch
        if (at == 'a' || at == 'e' || at == 'i' || at == 'o' || at == 'u'||!newword.startsWith("y")) {

                 sbd.append(sbd.substring(0, i));
                 sbd.delete(0, i);
                 sbd.append("ee");
                 sbd.replace(0, 1, "i");
      System.out.println(word + "  in Mattenenglisch is " + sbd);
                         break;
                      }
                   }
               }
           }
       }
   
    }
}



    
    
     
    
    
    
    
    
    
    
    
    
    
    
    
   
    
