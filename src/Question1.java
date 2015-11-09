
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //create scanner for input
        Scanner input = new Scanner(System.in);
        
        //tell user to type a word
        System.out.println("Please enter a word");
        String mattenglisch = input.nextLine();
        
        //translate word
        //if word starts with a vowel
        if(mattenglisch.startsWith("a")){
            mattenglisch = mattenglisch.replaceFirst("a", "i");
            if(mattenglisch.endsWith("a")
                    | mattenglisch.endsWith("e")
                    | mattenglisch.endsWith("i")
                    | mattenglisch.endsWith("o")
                    | mattenglisch.endsWith("u")){
                mattenglisch = mattenglisch + "hee";
            }else{
                mattenglisch = mattenglisch + "ee";
            }System.out.println("In Mattenglisch: " + mattenglisch);
        }if(mattenglisch.startsWith("e")){
            mattenglisch = mattenglisch.replaceFirst("e", "i");
            if(mattenglisch.endsWith("a")
                    | mattenglisch.endsWith("e")
                    | mattenglisch.endsWith("i")
                    | mattenglisch.endsWith("o")
                    | mattenglisch.endsWith("u")){
                mattenglisch = mattenglisch + "hee";
            }else{
                mattenglisch = mattenglisch + "ee";
            }System.out.println("In Mattenglisch: " + mattenglisch);
        }if(mattenglisch.startsWith("i")){
            if(mattenglisch.endsWith("a")
                    | mattenglisch.endsWith("e")
                    | mattenglisch.endsWith("i")
                    | mattenglisch.endsWith("o")
                    | mattenglisch.endsWith("u")){
                mattenglisch = mattenglisch + "hee";
            }else{
                mattenglisch = mattenglisch + "ee";
            }System.out.println("In Mattenglisch: " + mattenglisch);
        }if(mattenglisch.startsWith("o")){
            mattenglisch = mattenglisch.replaceFirst("o", "i");
            if(mattenglisch.endsWith("a")
                    | mattenglisch.endsWith("e")
                    | mattenglisch.endsWith("i")
                    | mattenglisch.endsWith("o")
                    | mattenglisch.endsWith("u")){
                mattenglisch = mattenglisch + "hee";
            }else{
                mattenglisch = mattenglisch + "ee";
            }System.out.println("In Mattenglisch: " + mattenglisch);
        }if(mattenglisch.startsWith("u")){
            mattenglisch = mattenglisch.replaceFirst("u", "i");
            if(mattenglisch.endsWith("a")
                    | mattenglisch.endsWith("e")
                    | mattenglisch.endsWith("i")
                    | mattenglisch.endsWith("o")
                    | mattenglisch.endsWith("u")){
                mattenglisch = mattenglisch + "hee";
            }else{
                mattenglisch = mattenglisch + "ee";
            }System.out.println("In Mattenglisch: " + mattenglisch);
        }//if word starts with a consonant
        else{int aFound = mattenglisch.indexOf("a");
        int eFound = mattenglisch.indexOf("e");
        int oFound = mattenglisch.indexOf("o");
        int uFound = mattenglisch.indexOf("u");
            int position = mattenglisch.length();
            if(aFound >= 0  && aFound < position){
                position = aFound;
            }
            if(eFound >= 0 && eFound < position){
                position = eFound;
            }
            int iFound = mattenglisch.indexOf("i");
            if(iFound >= 0 && eFound < position){
                position = iFound;
            }
            if(oFound >= 0 && oFound < position){
                position = oFound;
            }
            if(uFound >= 0 && uFound < position){
                position = uFound;
            }
            String first = mattenglisch.substring(0, position);
            String last = mattenglisch.substring(position);
            mattenglisch = last + first + "ee";
           
            if(mattenglisch.startsWith("a")){
            mattenglisch = mattenglisch.replaceFirst("a", "i");
           
        }if(mattenglisch.startsWith("e")){
            mattenglisch = mattenglisch.replaceFirst("e", "i");
            
        }if(mattenglisch.startsWith("o")){
            mattenglisch = mattenglisch.replaceFirst("o", "i");
           
        }if(mattenglisch.startsWith("u")){
            mattenglisch = mattenglisch.replaceFirst("u", "i");
           
            System.out.println("In Mattenglisch: " + mattenglisch);
        }
        }//tell user what word is in mattenglisch   
        System.out.println("In Mattenglisch: " + mattenglisch); 
            
       
            
        }
        
    
}
