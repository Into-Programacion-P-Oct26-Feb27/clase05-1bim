
import java.util.Locale;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author reroes
 */
public class EjemploCondicionales1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double costoFijo = 25;
        int diaPago;
        String parroquia;
        double descuento = 5; // expresado en porcentaje. Ejemplo 5%
        String nombre;
        String apellido;
        String usuario;
        int edad;
        double valorDescuento;
        double valorCancelar;
        
        // ingresar datos
        
        System.out.println("Ingrese nombre");
        nombre = entrada.nextLine(); 
        System.out.println("Ingrese apellido");
        apellido = entrada.nextLine(); 
        System.out.println("Ingrese usuario");
        usuario = entrada.nextLine(); 
        System.out.println("Ingrese la parroquia donde vive");
        parroquia = entrada.nextLine(); 
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        System.out.println("Ingrese el día de pago: Ejemplo :1, 2, 10 ...");
        diaPago = entrada.nextInt();
        
        if((diaPago<10) && 
                (parroquia.equals("El Valle") || 
                parroquia.equals("El Sagrario"))){
            valorDescuento = (descuento*costoFijo)/100;
            valorCancelar = costoFijo - valorDescuento;
            System.out.printf("Gimnasio Fuerza Total\n"
                    + "Nombre: %s\nApellido:%s\n"
                    + "Usuario: %s\nParroquia:%s\n"
                    + "Edad: %d\nDía de Pago: %d\n"
                    + "Valor descuento: %.2f\n"
                    + "Valor a Cancelar: %.2f\n",
                    nombre, apellido, usuario, parroquia, 
                    edad,diaPago, valorDescuento, valorCancelar);
        }else{
            valorCancelar = costoFijo;
            System.out.printf("Gimnasio Fuerza Total\n"
                    + "Nombre: %s\nApellido:%s\n"
                    + "Usuario: %s\nParroquia:%s\n"
                    + "Edad: %d\nDía de Pago: %d\n"
                    + "Valor a Cancelar: %.2f\n",
                    nombre, apellido, usuario, parroquia, 
                    edad,diaPago, valorCancelar);
        }
        
        

    }
    
}
