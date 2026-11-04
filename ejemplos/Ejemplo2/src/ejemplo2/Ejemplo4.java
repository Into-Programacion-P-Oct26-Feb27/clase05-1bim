/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo4 {

    public static void main(String[] args) {
        // Condicionales compuestos
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // 10,2 / 10.2
        double promedio;
        double nota1;
        double nota2;
        double suma;
        String reporte = "";

        System.out.println("Ingrese el nota 1, por favor");
        nota1 = entrada.nextDouble();
        System.out.println("Ingrese el nota 2, por favor");
        nota2 = entrada.nextDouble();
        suma = nota1 + nota2;
        promedio = suma / 2;

        if (promedio >= 7.5) {
            reporte = String.format("%sEstudiante aprobado con un "
                    + "promedio: %.2f\n", reporte, promedio);
        } else {
            reporte = String.format("%sEstudiante reprobado con un "
                    + "promedio: %.2f\n", reporte, promedio);
        }

        System.out.printf("%s\n", reporte);
    }
}
