
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bettk6516
 */
public class Assigment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //improts Scanner 
        Scanner input = new Scanner(System.in);

        //loops forever 
        while (true) {
            //if the word entered is END the program ends
            //text out and user input of the desired word to be translated
            System.out.println("Enter the word you wish to translate in lower case(type END to quit the program)");

            String word = input.nextLine();
            if (word.equals("END")) {
                break;
            }

            String pLat = word;
            //if the word starts with a vowel
            if (pLat.startsWith("a")
                    || pLat.startsWith("e")
                    || pLat.startsWith("i")
                    || pLat.startsWith("o")
                    || pLat.startsWith("u")
                    || pLat.startsWith("A")
                    || pLat.startsWith("E")
                    || pLat.startsWith("I")
                    || pLat.startsWith("O")
                    || pLat.startsWith("U")) {





                //takes the rest of word with the exepltion of the first letter
                String restOfWord = pLat.substring(1);
                System.out.println("i" + restOfWord + "hee");

                System.out.println("");


            }
            //if the word doesnt start with a voewl 
            if (!pLat.startsWith("a")
                    || !pLat.startsWith("e")
                    || !pLat.startsWith("i")
                    || !pLat.startsWith("o")
                    || !pLat.startsWith("u")) {

                //grabs the location of each letter 
                int findA = pLat.indexOf("a");
                int findE = pLat.indexOf("e");
                int findI = pLat.indexOf("i");
                int findO = pLat.indexOf("o");
                int findU = pLat.indexOf("u");



                //if the voewl is not in the word, the value of that letter is set to a ungodly number
                if (findA == -1) {
                    findA = 100000000;
                }
                if (findE == -1) {
                    findE = 100000000;
                }
                if (findI == -1) {
                    findI = 100000000;
                }
                if(findO == -1){
                    findO = 100000000;
                }
                if (findU == -1) {
                    findU = 100000000;
                }


                //if 'a' is in the word,and occurs before the other voewls the word is choped there and the translate rules applyed 
                if (findA != 100000000) {
                    if (findA < findE) {
                        if (findA < findI) {
                            if (findA < findO) {
                                if (findA < findU) {

                                    String firstA = pLat.substring(0, findA);
                                    String lastA = pLat.substring(findA);

                                    
                                    pLat = lastA + firstA;
                                    replaceA = pLat.startsWith("a")
                                    
                                }
                            }
                        }
                    }


                }

                if (findE != 100000000) {
                }



            }
        System.out.println(pLat);}
    }
}
