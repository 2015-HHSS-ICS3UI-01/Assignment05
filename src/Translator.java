
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author voigr4865
 */
public class Translator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        boolean done = false;
        String pig;
        int y;




        while (true) {
            System.out.println("type in a word that you wish to translate, Type END to quit the program");
            String english = input.nextLine();
            english.toLowerCase();
            // if end is typed in caps it will end the program
            if (english.equals("END")) {
                break;
            }



            if (english.startsWith("y")) {
                //new string builder
                StringBuilder sBuilder = new StringBuilder(english);

                for (int i = 0; i < sBuilder.length(); i++) {
                    //checks the whole word for the first vowel

                    if (sBuilder.charAt(i) == 'a' || sBuilder.charAt(i) == 'e' || sBuilder.charAt(i) == 'i' || sBuilder.charAt(i) == 'o' || sBuilder.charAt(i) == 'u') {
                        //replace (start position, up to position, replace with)
                        sBuilder.replace(i, i + 1, "i");




                        if (i != -1) {
                            //grabs all the lettets up to the first vowel
                            String starting = sBuilder.substring(0, i);
                            sBuilder.delete(0, i);
                            //adds the starting to the end
                            sBuilder.append(starting);



                            //finds out if the word entered ends with a vowel
                            if (english.endsWith("a") || english.endsWith("e") || english.endsWith("i") || english.endsWith("o") || english.endsWith("u")) {
                                //if the word ends with a vowel put hee at the end
                                System.out.println(english + " in Mattenenglish is " + sBuilder + "hee");
                                //break this part of the program
                                break;
                            }


                            //put ee at the very end off the word
                            System.out.println(english + " in Mattenenglisch is " + sBuilder + "ee");
                            //break this part of the program
                            break;

                        }
                    }
                }


            }
            if (!english.startsWith("y")) {

                StringBuilder sBuilder = new StringBuilder(english);

                for (int i = 0; i < sBuilder.length(); i++) {
                    //checks the whole word for the first vowel

                    if (sBuilder.charAt(i) == 'a' || sBuilder.charAt(i) == 'e' || sBuilder.charAt(i) == 'i' || sBuilder.charAt(i) == 'o' || sBuilder.charAt(i) == 'u' || sBuilder.charAt(i) == 'y') {
                        //replace (start position, up to position, replace with)
                        sBuilder.replace(i, i + 1, "i");




                        if (i != -1) {
                            //grabs all the lettets up to the first vowel
                            String starting = sBuilder.substring(0, i);
                            sBuilder.delete(0, i);
                            //adds the starting to the end
                            sBuilder.append(starting);



                            //finds out if the word entered ends with a vowel
                            if (english.endsWith("a") || english.endsWith("e") || english.endsWith("i") || english.endsWith("o") || english.endsWith("u")) {
                                //if the word ends with a vowel put hee at the end
                                System.out.println(english + " in Mattenenglish is " + sBuilder + "hee");
                                //break this part of the program
                                break;
                            }


                            //put ee at the very end off the word
                            System.out.println(english + " in Mattenenglisch is " + sBuilder + "ee");
                            //break this part of the program
                            break;

                        }
                    }
                }
            }
        }
    }
}
        
