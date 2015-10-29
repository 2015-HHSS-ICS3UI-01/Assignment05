
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iorgs3184
 */
public class Tests {
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String:");
        String str = bf.readLine();

        char[] c = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {

            if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o'
                    || c[i] == 'u') {

                System.out.println(str.replace(c[i], '?'));

            }

        }

    
    }
}
