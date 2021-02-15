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
public class EstructuraDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N,tem=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantos numeros desea ingresar");
        N = leer.nextInt();
        int[] vector = new int[N];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingresa un numero");
            vector[i] = leer.nextInt();
        }
        for (int i = 0; i < vector.length; i++) {
            for (int j = i; j < vector.length; j++) {
                if (vector[i] > vector[j]) {
                    tem = vector[i];

                }
            }
        }
        System.out.println("El numero mayor es: " + tem);

    }

}
