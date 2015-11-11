
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moore3607
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //made a new scanner called "input"
        Scanner input = new Scanner(System.in);
        //this program will constantly loop until broken
        while (true) {
            //makes the progrom print "Please enter a word" on the screen     
            System.out.println("Please enter a word");
            //takes the word that the uder inputed and labels it as "word"
            String word = input.nextLine();
            //if the word is end, the program ends
            if (word.equalsIgnoreCase("END")) {
                //breaks out of the while loop
                break;
            }
            //if the word starts with a,e,i,o,u or ends with y, then the following
            //commands will be executed
            if (word.startsWith("a")
                    || (word.startsWith("e")
                    || (word.startsWith("i")
                    || (word.startsWith("o")
                    || (word.startsWith("u")
                    || (word.endsWith("y"))))))) {
                //if the word starts with i, the following commands will be executed 
                if (word.startsWith("i")) {
                    //if the word ends with a,e,i,o,u, or y, the following commands will be executed
                    if (word.endsWith("a")
                            || (word.endsWith("e")
                            || (word.endsWith("i")
                            || (word.endsWith("o")
                            || (word.endsWith("u")
                            || (word.endsWith("y"))))))) {
                        //makes the program print "In Mattenenglisch: " + word + "hee" on the screen
                        System.out.println("In Mattenenglisch: " + word + "hee");
                        //if the word doesn't end with a,e,i,o,u, or y, 
                        //then the following command will be executed
                    } else {
                        //makes the program print "In Mattenenglisch: " + word + "ee" on the screen
                        System.out.println("In Mattenenglisch: " + word + "ee");
                    }

                }
                //if the word starts with a, then that a will be replaced with an i
                if (word.startsWith("a")) {
                    word = word.replaceFirst("a", "i");
                    //if the word ends with a,e,i,o,u, or y, the following commands will be executed
                    if (word.endsWith("a")
                            || (word.endsWith("e")
                            || (word.endsWith("i")
                            || (word.endsWith("o")
                            || (word.endsWith("u")
                            || (word.endsWith("y"))))))) {
                        //makes the program print "In Mattenenglisch: " + word + "ee" on the screen
                        System.out.println("In Mattenenglisch: " + word + "hee");
                        //if the word doesn't end with a,e,i,o,u, or y, 
                        //then the following command will be executed
                    } else {
                        //makes the program print "In Mattenenglisch: " + word + "ee" on the screen
                        System.out.println("In Mattenenglisch: " + word + "ee");
                    }
                }
                //if the word starts with e, then that e will be replaced with an i
                if (word.startsWith("e")) {
                    word = word.replaceFirst("e", "i");
                    //if the word ends with a,e,i,o,u, or y, the following commands will be executed
                    if (word.endsWith("a")
                            || (word.endsWith("e")
                            || (word.endsWith("i")
                            || (word.endsWith("o")
                            || (word.endsWith("u")
                            || (word.endsWith("y"))))))) {
                        //makes the program print "In Mattenenglisch: " + word + "ee" on the screen
                        System.out.println("In Mattenenglisch: " + word + "hee");
                        //if the word doesn't end with a,e,i,o,u, or y, 
                        //then the following command will be executed
                    } else {
                        //makes the program print "In Mattenenglisch: " + word + "ee" on the screen
                        System.out.println("In Mattenenglisch: " + word + "ee");
                    }

                }
                //if the word starts with o, then that o will be replaced with an i
                if (word.startsWith("o")) {
                    word = word.replaceFirst("o", "i");
                    //if the word ends with a,e,i,o,u, or y, the following commands will be executed
                    if (word.endsWith("a")
                            || (word.endsWith("e")
                            || (word.endsWith("i")
                            || (word.endsWith("o")
                            || (word.endsWith("u")
                            || (word.endsWith("y"))))))) {
                        //makes the program print "In Mattenenglisch: " + word + "ee" on the screen       
                        System.out.println("In Mattenenglisch: " + word + "hee");
                        //if the word doesn't end with a,e,i,o,u, or y, 
                        //then the following command will be executed
                    } else {
                        //makes the program print "In Mattenenglisch: " + word + "ee" on the screen
                        System.out.println("In Mattenenglisch: " + word + "ee");
                    }
                }
                //if the word starts with u, then that u will be replaced with an i
                if (word.startsWith("u")) {
                    word = word.replaceFirst("u", "i");
                    //if the word ends with a,e,i,o,u, or y, the following commands will be executed
                    if (word.endsWith("a")
                            || (word.endsWith("e")
                            || (word.endsWith("i")
                            || (word.endsWith("o")
                            || (word.endsWith("u")
                            || (word.endsWith("y"))))))) {
                        //makes the program print "In Mattenenglisch: " + word + "ee" on the screen
                        System.out.println("In Mattenenglisch: " + word + "hee");
                        //if the word doesn't end with a,e,i,o,u, or y, 
                        //then the following command will be executed
                    } else {
                        //makes the program print "In Mattenenglisch: " + word + "ee" on the screen
                        System.out.println("In Mattenenglisch: " + word + "ee");
                    }
                }
                //created a variable called "yFound" that calculates where the first y is in the word
                int yFound = word.indexOf("y");
                //created two variables called sixthfirst and sixthlast and made them blank for now
                String sixthfirst = "";
                String sixthlast = "";
                //if "yFound" is less than or equal to -1, then sixthfirst and sixthlast will be the word 
                if (yFound <= -1) {
                    sixthfirst = word;
                    sixthlast = word;
                    //if yFound isn't less than or equal to -1, then sixthfirst will be equal to 
                    //everything before the y, and sixthlast will be equal to everything after    
                } else {
                    sixthfirst = word.substring(0, yFound);
                    sixthlast = word.substring(yFound);
                }

                //if the word ends with y, then a new string is created called matten and
                //is equal to sixthfirst + sixthlast
                if (word.endsWith("y")) {
                    String matten = sixthlast + sixthfirst;
                    //the first y in the string "matten" is replaced with an i        
                    matten = matten.replaceFirst("y", "i");
                    //makes the program print "In Mattenenglisch: " + word + "ee" on the screen        
                    System.out.println("In Mattenenglisch: " + matten + "ee");

                }

                //if word doesn't begin with an a,e,i,o,u or end with a y, then the following commands
                //will be executed 
            } else {
                //created a variable called aFound that calculates where a is in the word 
                int aFound = word.indexOf("a");

                //created two variables called first and last and made them blank for now
                String first = "";
                String last = "";
                //if "aFound" is less than or equal to -1, then first and last will be the word
                if (aFound <= -1) {
                    first = word;
                    last = word;
                    //if aFound isn't less than or equal to -1, then first will be equal to 
                    //everything before the a, and last will be equal to everything after    
                } else {
                    first = word.substring(0, aFound);
                    last = word.substring(aFound);

                }
                //created a variable called eFound that calculates where e is in the word
                int eFound = word.indexOf("e");
                //created two variables called secondfirst and secondlast and made them blank for now
                String secondfirst = "";
                String secondlast = "";
                //if "eFound" is less than or equal to -1, then secondfirst and secondlast will be the word
                if (eFound <= -1) {
                    secondfirst = word;
                    secondlast = word;
                    //if eFound isn't less than or equal to -1, then secondfirst will be equal to 
                    //everything before the e, and secondlast will be equal to everything after    
                } else {
                    secondfirst = word.substring(0, eFound);
                    secondlast = word.substring(eFound);
                }
                //created a variable called iFound that calculates where i is in the word
                int iFound = word.indexOf("i");
                //created two variables called thirdfirst and thirdlast and made them blank for now
                String thirdfirst = "";
                String thirdlast = "";
                //if "iFound" is less than or equal to -1, then thirdfirst and thirdlast will be the word
                if (iFound <= -1) {
                    thirdfirst = word;
                    thirdlast = word;
                    //if iFound isn't less than or equal to -1, then thirdfirst will be equal to 
                    //everything before the i, and thirdlast will be equal to everything after    
                } else {
                    thirdfirst = word.substring(0, iFound);
                    thirdlast = word.substring(iFound);
                }
                //created a variable called oFound that calculates where o is in the word
                int oFound = word.indexOf("o");
                //created two variables called fourthfirst and fourthlast and made them blank for now
                String fourthfirst = "";
                String fourthlast = "";
                //if "oFound" is less than or equal to -1, then fourthfirst and fourthlast will be the word
                if (oFound <= -1) {
                    fourthfirst = word;
                    fourthlast = word;
                    //if oFound isn't less than or equal to -1, then fourthfirst will be equal to 
                    //everything before the o, and fourthlast will be equal to everything after    
                } else {
                    fourthfirst = word.substring(0, oFound);
                    fourthlast = word.substring(oFound);
                }
                //created a variable called uFound that calculates where u is in the word
                int uFound = word.indexOf("u");
                //created two variables called fifthfirst and fifthlast and made them blank for now
                String fifthfirst = "";
                String fifthlast = "";
                //if "uFound" is less than or equal to -1, then fifthfirst and fifthlast will be the word
                if (uFound <= -1) {
                    fifthfirst = word;
                    fifthlast = word;
                    //if uFound isn't less than or equal to -1, then fifthfirst will be equal to 
                    //everything before the o, and fifthlast will be equal to everything after    
                } else {
                    fifthfirst = word.substring(0, uFound);
                    fifthlast = word.substring(uFound);
                }
                //created a variable called yFound that calculates where y is in the word
                int yFound = word.indexOf("y");
                //created two variables called sixthfirst and sixthlast and made them blank for now
                String sixthfirst = "";
                String sixthlast = "";
                //if "yFound" is less than or equal to -1, then sixthfirst and sixthlast will be the word
                if (yFound <= -1) {
                    sixthfirst = word;
                    sixthlast = word;
                    //if yFound isn't less than or equal to -1, then sixthfirst will be equal to 
                    //everything before the o, and sixthlast will be equal to everything after    
                } else {
                    sixthfirst = word.substring(0, yFound);
                    sixthlast = word.substring(yFound);
                }


                //if aFound is equal to -1, it then equals 1000
                if (aFound == -1) {
                    aFound = 1000;
                }
                //if eFound is equal to -1, it then equals 1000
                if (eFound == -1) {
                    eFound = 1000;
                }
                //if iFound is equal to -1, it then equals 1000
                if (iFound == -1) {
                    iFound = 1000;
                }
                //if oFound is equal to -1, it then equals 1000
                if (oFound == -1) {
                    oFound = 1000;
                }
                //if uFound is equal to -1, it then equals 1000
                if (uFound == -1) {
                    uFound = 1000;
                }
                //if yFound is equal to -1, it then equals 1000
                if (yFound == -1) {
                    yFound = 1000;
                }

                //if aFound is then than all other ""Founds, and is more than -1, than the following commands will happen
                if (aFound < eFound) {
                    if (aFound < iFound) {
                        if (aFound < oFound) {
                            if (aFound < uFound) {
                                if (aFound > -1) {
                                    //created a new variable called "matten" and made it equal to last + first                    
                                    String matten = last + first;
                                    //replaces the first a in "matten" with an i                    
                                    matten = matten.replaceFirst("a", "i");
                                    //makes the program print "In Mattenenglisch: " + matten + "ee" on the screen
                                    System.out.println("In Mattenenglisch: " + matten + "ee");
                                }

                            }
                        }
                    }

                }

                //if eFound is then than all other ""Founds, and is more than -1, than the following commands will happen
                if (eFound < aFound) {
                    if (eFound < iFound) {
                        if (eFound < oFound) {
                            if (eFound < uFound) {
                                if (eFound > -1) {
                                    //created a new variable called "matten" and made it equal to secondlast + secondfirst
                                    String matten = secondlast + secondfirst;
                                    //replaces the first e in "matten" with an i
                                    matten = matten.replaceFirst("e", "i");
                                    //makes the program print "In Mattenenglisch: " + matten + "ee" on the screen
                                    System.out.println("In Mattenenglisch: " + matten + "ee");
                                }

                            }
                        }
                    }

                }
                //if iFound is then than all other ""Founds, and is more than -1, than the following commands will happen
                if (iFound < aFound) {
                    if (iFound < eFound) {
                        if (iFound < oFound) {
                            if (iFound < uFound) {
                                if (iFound > -1) {
                                    //created a new variable called "matten" and made it equal to thirdlast + thirdfirst
                                    String matten = thirdlast + thirdfirst;
                                    //makes the program print "In Mattenenglisch: " + matten + "ee" on the screen
                                    System.out.println("In Mattenenglisch: " + matten + "ee");
                                }

                            }
                        }
                    }

                }
                //if oFound is then than all other ""Founds, and is more than -1, than the following commands will happen
                if (oFound < aFound) {
                    if (oFound < eFound) {
                        if (oFound < iFound) {
                            if (oFound < uFound) {
                                if (oFound > -1) {
                                    //created a new variable called "matten" and made it equal to fourthlast + fourthfirst
                                    String matten = fourthlast + fourthfirst;
                                    //replaces the first o in "matten" with an i
                                    matten = matten.replaceFirst("o", "i");
                                    //makes the program print "In Mattenenglisch: " + matten + "ee" on the screen
                                    System.out.println("In Mattenenglisch: " + matten + "ee");
                                }

                            }
                        }
                    }

                }
                //if uFound is then than all other ""Founds, and is more than -1, than the following commands will happen
                if (uFound < aFound) {
                    if (uFound < eFound) {
                        if (uFound < iFound) {
                            if (uFound < oFound) {
                                if (uFound > -1) {
                                    //created a new variable called "matten" and made it equal to fifthlast + fifthfirst
                                    String matten = fifthlast + fifthfirst;
                                    //replaces the first o in "matten" with an i
                                    matten = matten.replaceFirst("u", "i");
                                    //makes the program print "In Mattenenglisch: " + matten + "ee" on the screen
                                    System.out.println("In Mattenenglisch: " + matten + "ee");
                                }

                            }
                        }
                    }

                }
                //if all ""Founds except yFound equal 1000, and yFounf equals -1, 
                //then the following commands will be executed
                if (aFound == 1000) {
                    if (eFound == 1000) {
                        if (iFound == 1000) {
                            if (oFound == 1000) {
                                if (uFound == 1000) {
                                    if (yFound > -1) {
                                        //created a new variable called "matten" and made it equal to sixthlast + sixthfirst
                                        String matten = sixthlast + sixthfirst;
                                        //replaces the first y in "matten" with an i
                                        matten = matten.replaceFirst("y", "i");
                                        //makes the program print "In Mattenenglisch: " + matten + "ee" on the screen
                                        System.out.println("In Mattenenglisch: " + matten + "ee");
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
