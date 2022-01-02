/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sommainteri;

import java.io.BufferedReader;
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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first number : ");
        try {
            a = Integer.parseInt(br.readLine());
        }catch(Exception e) {
            System.out.println(e);
        }
        System.out.print("Enter second number : ");
        try {
        b = Integer.parseInt(br.readLine());
        }catch(Exception e) {
            System.out.println(e);
        }
        a += b;
        System.out.println("La somma è: " +a);
    }
    
}
