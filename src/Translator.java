
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farrb0382
 */
public class Translator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in); // creating the scanner

        while (true) { // creating the while loop

            System.out.println("Please enter a word to translate (type END to end to quit the program)."); // telling the user what to do
            String eng = input.nextLine(); // getting the user to input the word they want to translate
            eng.toLowerCase();  // getting the user to input the word and put it into lowercase

            if (eng.equals("END")) { // if the user inputs "END" the program will end
                break; //the program stops if "END" is entered
            }

            if (eng.startsWith("y")) { // if "y" is the first letter in the word it will be treated as a vowel and all of the following will be done 

                StringBuilder sbuilder = new StringBuilder(eng); // making the string to change the word

                for (int i = 0; i < sbuilder.length(); i++) { // making the integer so we can modify the word the user entered 
                    if (sbuilder.charAt(i) == 'a' || sbuilder.charAt(i) == 'e' || sbuilder.charAt(i) == 'i' || sbuilder.charAt(i) == 'o' || sbuilder.charAt(i) == 'u') { // the vowels that we need to find to modify the word
                        sbuilder.replace(i, i + 1, "i"); // replacing the first appearing vowel with the letter i

                        int firstI = sbuilder.indexOf("i"); // finding the first i (otherwise known as the first vowel)
                        if (firstI != -1) { // if there is a i in the word do the following 
                            String starting = sbuilder.substring(0, firstI); // getting the letters up to the first i
                            sbuilder.delete(0, firstI); // deleting everything before the first i (otherwise known as first vowel)
                            sbuilder.append(starting); // pinning everything that was deleted to the end of the word
                        }

                        if (eng.endsWith("a") || eng.endsWith("e") || eng.endsWith("i") || eng.endsWith("o") || eng.endsWith("u")) { // if english ends with any of these vowels the following will be done 
                            System.out.println("Your word in Mattenenglisch is " + sbuilder + "hee"); // adding "hee" onto the end of any word that ends in a vowel
                            break;
                        }
                        System.out.println("Your word in Mattenenglisch is " + sbuilder + "ee"); // emmiting the word translated and adding the "ee" on the end 
                        break; // breaking the instructions so that the system out doesn't emit numerous translations
                    }
                }
            }
            if (!eng.startsWith("y")) { // if eng doesnt start with a "y" do the following 
                StringBuilder sbuilder = new StringBuilder(eng); // creating another string builder 
                for (int i = 0; i < sbuilder.length(); i++) { // making the integer so we can modify the word the user entered 
                    if (sbuilder.charAt(i) == 'a' || sbuilder.charAt(i) == 'e' || sbuilder.charAt(i) == 'i' || sbuilder.charAt(i) == 'o' || sbuilder.charAt(i) == 'u') { // the vowels that we need to find to modify the word
                        sbuilder.replace(i, i + 1, "i"); // replacing the first appearing vowel with the letter i

                        int firstI = sbuilder.indexOf("i"); // finding the first i (otherwise known as the first vowel)
                        if (firstI != -1) { // if there is a i in the word do the following 
                            String starting = sbuilder.substring(0, firstI); // getting the letters up to the first i
                            sbuilder.delete(0, firstI); // deleting everything before the first i (otherwise known as first vowel)
                            sbuilder.append(starting); // pinning everything that was deleted to the end of the word
                        }

                        if (eng.endsWith("a") || eng.endsWith("e") || eng.endsWith("i") || eng.endsWith("o") || eng.endsWith("u")) { // if the words ends with these vowels do the following 
                            System.out.println("Your word in Mattenenglisch is " + sbuilder + "hee"); // add "hee" if the word ends with the vowels stated above
                            break;
                        }
                        System.out.println("Your word in Mattenenglisch is " + sbuilder + "ee"); // emmiting the word translated and adding the "ee" on the end 
                        break; // breaking the loop
                    }
                }
            }
        }
    }
}
