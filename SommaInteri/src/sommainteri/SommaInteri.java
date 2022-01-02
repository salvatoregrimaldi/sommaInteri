/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sommainteri;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Salvatore
 */
public class SommaInteri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer a = 0;
        Integer b = 0;
        a = insertNumber(a);
        b = insertNumber(b);
        a += b;
        System.out.println("La somma è: " +a);
    }
    
    
    static private Integer insertNumber(Integer x){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter number : ");
        try {
            x = Integer.parseInt(br.readLine());
        }catch(IOException | NumberFormatException e) {
            System.out.println(e);
        }
        System.out.println("Sono Michelangelo Scrollalanza!!!");
        return x;
    }
    
}
