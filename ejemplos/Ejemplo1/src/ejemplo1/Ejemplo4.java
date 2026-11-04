/*
 * Realizar un programa en java que permita determinar
 * si un estudiante ha pasado el ciclo
 * se ingresa el promedio del estudiante
 * - Un estudiante pasa el ciclo si tiene un promedio
 * mayor o igual a 7.5. Si el estudiante aprueba el ciclo, presentar
 * un mensaje como sigue: Estudiante aprobado con un promedio: 8.1
 */
package ejemplo1;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejemplo4 {

    public static void main(String[] args) {
        // Condicionales simples
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double promedio;
        System.out.println("Ingrese la nota necesaria");
        promedio = entrada.nextDouble();
        
        entrada.nextLine();
        
        String nombreEstudiante;
        System.out.println("Ingrese nombre de estudiante");
        nombreEstudiante = entrada.nextLine();

        if (promedio >= 7.5 && promedio <=10) { // Falso
            System.out.printf("Estudiante %s aprobado con un "
                    + "promedio: %.2f\n",nombreEstudiante,
                    promedio);
        } // -------------
    }

}
