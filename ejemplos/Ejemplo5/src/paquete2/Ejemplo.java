/*
 *  Enunciado tomado del libro Mancilla, A., Ebratt, R. y Capacho, J. (2014). 
    Diseño y construcción de algoritmos.Barranquilla Universidad del Norte.
 */

/*
    Generar una solución que lea la temperatura en grados centı́grados (◦C) y la
    convierta a grados Farenheit (◦F) y a grados Kelvin (◦K), siempre y cuando
    la temperatura dada en grados centı́grados sea positiva y menor o igual que
    cien.
    
    Formulas de ayuda: 
    De grados Farenheit a grados centı́grados: ◦F = 9/5 (◦C ) + 32
    De grados Kelvin a grados centı́grados: ◦K = ◦ C + 273.15
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo {
    
    public static void main(String[] args) {
        // Variable
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double gradosCentigrados;
        double gradosFarenheit;
        double gradosKelvin;
        
        System.out.println("Ingrese el valor de grados centı́grados");
        gradosCentigrados = entrada.nextDouble();
        
        if (gradosCentigrados > 0 && gradosCentigrados <= 100) {
            gradosFarenheit = (9/5.0) * gradosCentigrados + 32;
            gradosKelvin = gradosCentigrados + 273.15;
            
            System.out.printf("Valor en grados Farenheit %.2f\n", 
                    gradosFarenheit);
            
            System.out.printf("Valor en grados Kelvin %.2f\n", 
                    gradosKelvin);
           
        } else {
            System.out.printf("Valor %.2f en grados centígrados, está fuera"
                    + "de rango\n", gradosCentigrados);
        }
    }
}
