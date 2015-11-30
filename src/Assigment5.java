
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
                int findY = pLat.indexOf("y");
                //if the voewl is not in the word, the value of that letter is set to a higher  number then possible for a word
                if (findA == -1) {
                    findA = 100000000;
                }
                if (findE == -1) {
                    findE = 100000000;
                }
                if (findI == -1) {
                    findI = 100000000;
                }
                if (findO == -1) {
                    findO = 100000000;
                }
                if (findU == -1) {
                    findU = 100000000;
                }

                //if y is not a vowel it is set to 0
                int yIsV = 0;
                if (findY >= 1) {
                    //if y is a vowel, then it is translated with y as the vowel
                    yIsV = 1;

                    String firstY = pLat.substring(0, findY);
                    String lastY = pLat.substring(findY);
                    pLat = firstY + lastY;
                }

                //if 'a' is in the word,and occurs before the other voewls the word is choped there and the translate rules applyed 
                //if y is the vowel then it will not 
                if (yIsV == 0) {
                    if (findA != 100000000) {
                        if (findA < findE) {
                            if (findA < findI) {
                                if (findA < findO) {
                                    if (findA < findU) {

                                        String firstA = pLat.substring(0, findA);
                                        String lastA = pLat.substring(findA);

                                        pLat = lastA + firstA;
                                        pLat = pLat.replaceFirst("a", "i");
                                        System.out.println("your word is");
                                        System.out.println(pLat);

                                    }
                                }
                            }
                        }

                    }
                }
                //as long as y is not a vowel and e is the translation is applyed for e
                if (yIsV == 0) {
                    if (findE != 100000000) {
                        if (findE < findA) {
                            if (findE < findI) {
                                if (findE < findO) {

                                    if (findE < findU) {

                                        String firstE = pLat.substring(0, findE);
                                        String lastE = pLat.substring(findE);
                                        pLat = lastE + firstE;
                                        pLat = pLat.replaceFirst("e", "i");
                                        System.out.println("your word is ");
                                        System.out.println(pLat);

                                    }
                                }
                            }
                        }
                    }
                }
                //so long as y is not a vowel and i is the translation is applyed for i
                if (yIsV == 0) {
                    if (findI != 100000000) {
                        if (findI < findA) {
                            if (findI < findE) {
                                if (findI < findO) {
                                    if (findI < findU) {

                                        String firstI = pLat.substring(0, findI);
                                        String lastI = pLat.substring(findI);
                                        pLat = lastI + firstI;
                                        System.out.println("your word is ");
                                        System.out.println(pLat);

                                    }
                                }
                            }
                        }
                    }
                }
                //as long as y is not the vowel and o is the translation is applyed for 0
                if (yIsV == 0) {
                    if (findO != 100000000) {
                        if (findO < findA) {
                            if (findO < findE) {
                                if (findO < findI) {
                                    if (findO < findU) {

                                        String firstO = pLat.substring(0, findO);
                                        String lastO = pLat.substring(findO);
                                        pLat = lastO = firstO;
                                        pLat = pLat.replaceFirst("0", "i");
                                        System.out.println("your word is ");
                                        System.out.println("pLat");
                                    }
                                }
                            }
                        }
                    }
                }
                //if y is not the vowel and u is then the translation is appyed for u
                if (yIsV == 0) {
                    if (findU != 100000000) {
                        if (findU < findA) {
                            if (findU < findE) {
                                if (findU < findI) {
                                    if (findU < findO) {

                                        String firstU = pLat.substring(0, findU);
                                        String lastU = pLat.substring(findU);
                                        pLat = lastU + firstU;
                                        pLat = pLat.replaceFirst("u", "i");
                                        System.out.println("your word is ");
                                        System.out.println(pLat);
                                    }
                                }
                            }
                        }
                    }

                }
            }
        }
    }
}
