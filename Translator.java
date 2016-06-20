/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package translator;

import java.util.Scanner;

/**
 *
 * @author godie2014
 */
public class Translator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //me stands for mattenenglish
        Scanner input = new Scanner(System.in);

 while (true){
        
        //tell the user to enter word to be translated
        
        System.out.println("Please enter a word to translate (type END to quit program)");
        
        //put the word into a string, me means mattenenglish
        
        String me = input.nextLine();
        
        if (me.equals("end")){
            break;
        
        //word starts with a vowel
        
        }else if (me.startsWith("a")
                
                || me.startsWith("e")
                || me.startsWith("i")
                || me.startsWith("o")
                || me.startsWith("u")){
            
            String firstL = me.substring(0,1);
            
            String i = me.replaceFirst(firstL, "i");
            
            me = i;
                
                if (me.endsWith("a")
                        
                        || me.endsWith("e")
                        || me.endsWith("i")
                        || me.endsWith("o")
                        || me.endsWith("u")){
                    
                    me = me + "hee";
                    
                    System.out.println(me);
                    
                }else{ me = me + "ee";
                
                    System.out.println(me);
                }
                
        // word starts with a consonant
                
        }else{ while  (!me.startsWith("a") 
                
                || !me.startsWith("e")
                || !me.startsWith("i")
                || !me.startsWith("o")
                || !me.startsWith("u")
                || !me.startsWith("y")){
            
            String firstC= me.substring(0,1);
            
            String last = me.substring(1);
            
            me = last + firstC;
            
                if (me.startsWith("a")
                
                || me.startsWith("e")
                || me.startsWith("i")
                || me.startsWith("o")
                || me.startsWith("u")
                || me.startsWith("y")){
                
                String firstV= me.substring(0,1);
                
                String i = me.replaceFirst(firstV, "i");
                
                me = i;
                
                    
                        if (me.endsWith("a")
                        
                        || me.endsWith("e")
                        || me.endsWith("i")
                        || me.endsWith("o")
                        || me.endsWith("u")){
                    
                    me = me + "hee";
                    
                    System.out.println(me);
                    
                    break;
                    
                }else{ me = me + "ee";
                
                    System.out.println(me);
                    
                    break;
                
                
                
                    
                            
                        }
                    }
                }
            }
        }
    }
}               
    
    


       
