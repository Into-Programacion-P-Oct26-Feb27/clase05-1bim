/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ingresar un número por teclado, determinar si es par o impar
        // Un número es para si al dividirlo para dos su residuo es cero.

        Scanner entrada = new Scanner(System.in);
        int numeroIngresado;
        String mensajeUno = "Número Par";
        String mensajeDos = "Número Impar";

        System.out.println("Ingrese el número a evaluar");
        numeroIngresado = entrada.nextInt();

        if (numeroIngresado % 2 == 0) {
            System.out.printf("Resultado %s\n", mensajeUno);
        } else {
            System.out.printf("Resultado %s\n", mensajeDos);
        }

    }

}
