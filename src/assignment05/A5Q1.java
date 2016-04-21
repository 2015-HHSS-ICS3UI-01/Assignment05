/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment05;

import java.util.Scanner;

/**
 *
 * @author fostp4040
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        boolean end=false;
        
        
        while(!end){
            System.out.print("please enter a word to translate(type END to quit the program).");
            String word=input.nextLine();
            StringBuilder sBuilder=new StringBuilder(word);
            int firstVowel=sBuilder.indexOf("a,e,i,o,u,y");
            
            for(firstVowel=0;firstVowel<sBuilder.length();firstVowel++){
                if(sBuilder.charAt(firstVowel)=='a'){
                    sBuilder.replace(firstVowel,firstVowel+1,"i");
                    String starting= sBuilder.substring(0,firstVowel);
                    if(word.endsWith("a")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("e")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("i")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("o")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("u")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("y")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else 
                    sBuilder.delete(0,firstVowel);
                    sBuilder.append(starting+"ee");
                    break;
                    
                }else if(sBuilder.charAt(firstVowel)=='e'){
                    sBuilder.replace(firstVowel,firstVowel+1,"i");
                    String starting= sBuilder.substring(0,firstVowel);
                    if(word.endsWith("a")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("e")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("i")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("o")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("u")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("y")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else 
                    sBuilder.delete(0,firstVowel);
                    sBuilder.append(starting+"ee");
                    break;
                }else if(sBuilder.charAt(firstVowel)=='i'){
                    sBuilder.replace(firstVowel,firstVowel+1,"i");
                    String starting= sBuilder.substring(0,firstVowel);
                    if(word.endsWith("a")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("e")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("i")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("o")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("u")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("y")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else 
                    sBuilder.delete(0,firstVowel);
                    sBuilder.append(starting+"ee");
                    break;
                }else if(sBuilder.charAt(firstVowel)=='o'){
                    sBuilder.replace(firstVowel,firstVowel+1,"i");
                    String starting= sBuilder.substring(0,firstVowel);
                    if(word.endsWith("a")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("e")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("i")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("o")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("u")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("y")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else 
                    sBuilder.delete(0,firstVowel);
                    sBuilder.append(starting+"ee");
                    break;
                }else if(sBuilder.charAt(firstVowel)=='u'){
                    sBuilder.replace(firstVowel,firstVowel+1,"i");
                    String starting= sBuilder.substring(0,firstVowel);
                    if(word.endsWith("a")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("e")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("i")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("o")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("u")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("y")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else 
                    sBuilder.delete(0,firstVowel);
                    sBuilder.append(starting+"ee");
                    break;
                }else if(sBuilder.charAt(firstVowel)=='y'&&firstVowel<0){
                    sBuilder.replace(firstVowel,firstVowel+1,"i");
                    String starting= sBuilder.substring(0,firstVowel);
                    if(word.endsWith("a")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("e")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("i")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("o")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("u")&&firstVowel==0){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else if(word.endsWith("y")){
                        sBuilder.delete(0,firstVowel);
                        sBuilder.append(starting+"hee");
                        break;
                    }else 
                    sBuilder.delete(0,firstVowel);
                    sBuilder.append(starting+"ee");
                    break;
                }
            }
            System.out.println(word+" in Mattenenglisch is "+sBuilder);
            if("END".equals(word)){
                end=true;
            }
        }
    }
}
