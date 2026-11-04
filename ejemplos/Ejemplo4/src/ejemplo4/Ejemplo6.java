/*
 Realizar un programa en java que permita presentar un mensaje de: 
acceso correcto, si el valor de la primera letra de la variable ciudad 
tiene el valor de "L"; caso contrario, presentar un mensaje de acceso incorrecto
 */
package ejemplo4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo6 {

    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese la ciudad");
        String ciudad = entrada.nextLine();

        // L    0
        // O    1
        // J    2 
        // A    3
        // 
        String inicial = ciudad.substring(0, 1); // se obtiene 
        // el primer 
        // caracter de la cadena
        // Si el valor de ciudad es 
        // "Loja" se obtiene "L"

        if ( inicial.equals("L") || inicial.equals("l")) {
            System.out.printf("%s\n", "acceso correcto");
        } else {
            System.out.printf("%s\n", "acceso incorrecto");
        }

    }
}
