/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.datos;

import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String palabra;
        boolean palindromo=false;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa una palabra ");
        palabra = leer.next();
        for (int i = 0; i < palabra.length(); i++) {
            for(int j=palabra.length()-1;j>=1;j--)
                if (palabra.charAt(i) != palabra.charAt(j)) {
                   palindromo = true;
                }
            
        }
        if(palindromo==true){
            System.out.println("la palabra "+palabra+"  es palindromo");
        }else{
            System.out.println("la palabra "+palabra+" no es palindromo");
        }
    }
    
}
