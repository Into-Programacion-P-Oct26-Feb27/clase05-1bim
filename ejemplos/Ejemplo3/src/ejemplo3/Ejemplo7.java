/*
 Realizar un programa en java que permita determinar si un estudiante ha pasado 
el ciclo se ingresa el promedio del estudiante
- Un estudiante pasa el ciclo si tiene un promedio mayor o igual a 7.5 

- Si el estudiante aprueba el ciclo, presentar un mensaje como sigue, 
Estudiante aprobado con un promedio: ?
- Si el estudiante tiene una nota mayor o igual a 5 y menor o igual a 7.4 
presentar un mensaje con el siguiente texto; Estudiante en suspenso con un promedio: ? 
- Si el estudiante tiene una nota menor a 5 presentar un mensaje con el 
siguiente texto; Estudiante reprobado con un promedio: ? 
 */
package ejemplo3;

/**
 *
 * @author reroes
 */
public class Ejemplo7 {

    public static void main(String[] args) {
        // Condicionales aninados
        // >= 7.5 Aprobado
        // >= 5 and < 7.5 Suspenso
        // >= 3 and < 5 Recuperación
        // >=0 and < 3 Reprobado
        // cualquier otra nota, será nota fuera de rango
        // las notas no pueden pasar de 10.
        // Si la nota fuera de rango es negativa hay que indicarlo
        double promedio = 2.9;

        if (promedio >= 7.5) {
            System.out.printf("Estudiante aprobado con un "
                    + "promedio: %.2f\n", promedio);
        } else {
            if ((promedio >= 5) && (promedio < 7.5)) {
                System.out.printf("Estudiante en suspenso con un "
                        + "promedio: %.2f\n", promedio);
            } else {
                
                if((promedio >=3) && (promedio < 5)){
                    System.out.printf("Estudiante en recuperación con un "
                        + "promedio: %.2f\n", promedio);
                }else{
                    
                    if((promedio>=0) && (promedio<3)){
                        System.out.printf("Estudiante reprobado con un "
                        + "promedio: %.2f\n", promedio);
                    }else{
                        if(promedio<0){
                            System.out.printf("La nota %.2f está fuera de "
                                + "rango y es negativa", promedio);
                        }else{
                            System.out.printf("La nota %.2f está fuera de "
                                + "rango y es positiva", promedio);
                        }
                        
                    }
                    
                    
                }
                
            }

        }
    }

}
