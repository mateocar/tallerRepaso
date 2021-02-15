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
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, m, res = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa dos numeros a multiplicar");
        n = leer.nextInt();
        m = leer.nextInt();
        for (int i = 0; i < m; i++) {
            
            res = n+res;
        }
        System.out.println("El resultado es: " + res);
    }

}
