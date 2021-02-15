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
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int fac, resultado;
        System.out.println("ingrese el numero para hacerle el factorial");
        fac = leer.nextInt();
        resultado = 1;
        for (int i = fac; i > 0; i--) {
            resultado = resultado * i;
        }
        System.out.println("el factorial es " + resultado);

    }

}
