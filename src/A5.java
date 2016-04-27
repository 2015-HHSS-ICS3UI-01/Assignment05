
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class A5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        while (true) {
            // gets word from user
            System.out.println("Please enter a word to translate:");
            String word = input.nextLine();
            // if the word was "END"
            if (word.equals("END")) {
                break;
            }
            int firstvowel = 0;
            // using sBuilder
            StringBuilder sBuilder = new StringBuilder(word);
            // checks to see if word starts with a vowel
            if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u")) {
                // delete first letter
                sBuilder.deleteCharAt(firstvowel);
                // replaces first letter with 'i;
                sBuilder.insert(firstvowel, "i");
                // checks to see if word ends in a vowel
                if (word.endsWith("a") || word.endsWith("e") || word.endsWith("i") || word.endsWith("o") || word.endsWith("u") || word.endsWith("y")) {
                    System.out.println(word + " in Mattenenglisch is " + sBuilder + "hee");
                } else {
                    System.out.println(word + " in Mattenenglisch is " + sBuilder + "ee");
                }
            }
            // checks to see if word starts with a consanant
            if (!word.startsWith("a") && !word.startsWith("e") && !word.startsWith("i") && !word.startsWith("o") && !word.startsWith("u")) {
                // finds first occurring 'a', 'e', 'i', 'o', 'u', 'y'
                int firstA = sBuilder.indexOf("a");
                int firstE = sBuilder.indexOf("e");
                int firstI = sBuilder.indexOf("i");
                int firstO = sBuilder.indexOf("o");
                int firstU = sBuilder.indexOf("u");
                int firstY = sBuilder.indexOf("y");
                while (true) {
                    // if a 'y' is found and word does not start with 'y'
                    if (firstY != 0 && firstY != -1) {
                        // if word has no vowels
                        if (firstA == -1 && firstE == -1 && firstI == -1 && firstO == -1 && firstU == -1) {
                            sBuilder.deleteCharAt(firstY);
                            sBuilder.insert(firstY, "i");
                            String starting = sBuilder.substring(0, firstY);
                            sBuilder.delete(0, firstY);
                            sBuilder.append(starting);
                            break;
                        }
                        // if first 'y' is before all other vowels 
                        if (firstY < firstA || firstY < firstE || firstY < firstI || firstY < firstO || firstY < firstU) {
                            sBuilder.deleteCharAt(firstY);
                            sBuilder.insert(firstY, "i");
                            String starting = sBuilder.substring(0, firstY);
                            sBuilder.delete(0, firstY);
                            sBuilder.append(starting);
                            break;
                        }
                    }
                    // if an 'a' is found
                    if (firstA != -1) {
                        // if there are no other vowels found
                        if (firstE == -1 && firstI == -1 && firstO == -1 && firstU == -1) {
                            sBuilder.deleteCharAt(firstA);
                            sBuilder.insert(firstA, "i");
                            // grabs all letters up to first 'a'
                            String starting = sBuilder.substring(0, firstA);
                            // gets rid of everything up to first 'a'
                            sBuilder.delete(0, firstA);
                            // adds the starting to the end
                            sBuilder.append(starting);
                            break;
                        }
                        // if first 'a' is before all the other vowels
                        if (firstA < firstE || firstA < firstI || firstA < firstO || firstA < firstU) {
                            sBuilder.deleteCharAt(firstA);
                            sBuilder.insert(firstA, "i");
                            String starting = sBuilder.substring(0, firstA);
                            sBuilder.delete(0, firstA);
                            sBuilder.append(starting);
                            break;
                        }
                    }
                    if (firstE != -1) {
                        if (firstA == -1 && firstI == -1 && firstO == -1 && firstU == -1) {
                            String starting = sBuilder.substring(0, firstE);
                            sBuilder.deleteCharAt(firstE);
                            sBuilder.insert(firstE, "i");
                            sBuilder.delete(0, firstE);
                            sBuilder.append(starting);
                            break;
                        }
                        if (firstE < firstA || firstE < firstI || firstE < firstO || firstE < firstU) {
                            sBuilder.deleteCharAt(firstE);
                            sBuilder.insert(firstE, "i");
                            String starting = sBuilder.substring(0, firstE);
                            sBuilder.delete(0, firstE);
                            sBuilder.append(starting);
                            break;
                        }
                    }
                    if (firstI != -1) {
                        if (firstA == -1 && firstE == -1 && firstO == -1 && firstU == -1) {
                            String starting = sBuilder.substring(0, firstI);
                            sBuilder.delete(0, firstI);
                            sBuilder.append(starting);
                            break;
                        }
                        if (firstI < firstA || firstI < firstE || firstI < firstO || firstI < firstU) {
                            String starting = sBuilder.substring(0, firstI);
                            sBuilder.delete(0, firstI);
                            sBuilder.append(starting);
                            break;
                        }
                    }
                    if (firstO != -1) {
                        if (firstA == -1 && firstE == -1 && firstI == -1 && firstU == -1) {
                            sBuilder.deleteCharAt(firstO);
                            sBuilder.insert(firstO, "i");
                            String starting = sBuilder.substring(0, firstO);
                            sBuilder.delete(0, firstO);
                            sBuilder.append(starting);
                            break;
                        }
                        if (firstO < firstA || firstO < firstE || firstO < firstI || firstO < firstU) {
                            sBuilder.deleteCharAt(firstO);
                            sBuilder.insert(firstO, "i");
                            String starting = sBuilder.substring(0, firstO);
                            sBuilder.delete(0, firstO);
                            sBuilder.append(starting);
                            break;
                        }
                    }
                    if (firstU != -1) {
                        if (firstA == -1 && firstE == -1 && firstI == -1 && firstO == -1) {
                            sBuilder.deleteCharAt(firstU);
                            sBuilder.insert(firstU, "i");
                            String starting = sBuilder.substring(0, firstU);
                            sBuilder.delete(0, firstU);
                            sBuilder.append(starting);
                            break;
                        }
                        if (firstU < firstA || firstU < firstE || firstU < firstO || firstU < firstI) {
                            sBuilder.deleteCharAt(firstO);
                            sBuilder.insert(firstO, "i");
                            String starting = sBuilder.substring(0, firstO);
                            sBuilder.delete(0, firstO);
                            sBuilder.append(starting);
                            break;
                        }
                    }

                }
                // output the new word
                System.out.println(word + " in Mattenenglisch is " + sBuilder + "ee");
            }
        }
    }
}
