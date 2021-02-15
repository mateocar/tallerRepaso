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
public class Ejercicio4 {

    public static void main(String[] args) {
        int n, m,w=0,b=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa un numero a elevar ");
        n = leer.nextInt();
        System.out.println("Ingresa a cuanto quieres elevar el numero que acabas de ingresar");
        m = leer.nextInt();
        b=n;
        for (int i =1 ; i < m; i++) {
            int k=0;
            for (int j = 0; j <n; j++) {
                k=k+b;
                 w=k;
            }
            b=w;
        }
        System.out.println("El resultado es " +b);

    }

}
