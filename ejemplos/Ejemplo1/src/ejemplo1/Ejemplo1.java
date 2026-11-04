/*
 * Realizar un programa en java que permita determinar
 * si un estudiante ha pasado el ciclo
 * se ingresa el promedio del estudiante
 * - Un estudiante pasa el ciclo si tiene un promedio
 * mayor o igual a 7.5. Si el estudiante aprueba el ciclo, presentar
 * un mensaje como sigue: Estudiante aprobado con un promedio: 8.1
 */
package ejemplo1;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Ejemplo1 {

    public static void main(String[] args) {
        // Condicionales simplesmain
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double limiteNotas = 6.9;
               
        System.out.println("Ingrese un valor para analizar");
        double promedio = entrada.nextDouble();
        
        
        if (promedio >= limiteNotas) {
            System.out.printf("Estudiante aprobado con un "
                    + "promedio: %.2f\n", promedio);
        }
            
        if (promedio == limiteNotas) {
            System.out.printf("Estudiante aprobado con un "
                    + "promedio: %.2f\n", promedio);
        }

        if (promedio < limiteNotas) {
            System.out.printf("Estudiante aprobado con un "
                    + "promedio: %.2f\n", promedio);
        }
    }

}
