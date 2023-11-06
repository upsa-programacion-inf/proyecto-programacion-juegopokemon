
package model;
import java.util.Scanner;

public class Model {
        
    public String leerCadena(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce una cadena: ");
        String cadena = scan.nextLine();
        System.out.println("Has introducido: " + cadena);
        scan.close(); 
        return cadena;
    }
    
        
    public int leerInt(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = scan.nextInt();
        System.out.println("Has introducido: " + numero);
        return numero;
    }
    public float leerFloat(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = scan.nextInt();
        System.out.println("Has introducido: " + numero);
        return numero;
    }
    
public boolean siOno(){
     Scanner scan = new Scanner(System.in);
     System.out.print("¿Deseas continuar? (s/n): ");
        String respuesta = scan.nextLine();

        if (respuesta.equalsIgnoreCase("s")) {
            System.out.println("Has elegido continuar.");
            return true;
        } else if (respuesta.equalsIgnoreCase("n")) {
            System.out.println("Has elegido no continuar.");
            return false;
        } else {
            System.out.println("Respuesta no válida. Debes ingresar 's' o 'n'.");
            return siOno();
        }
       
}

}