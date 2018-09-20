package ejercicios;

import java.util.Scanner;

public class Palindromo{
 	
public static void main (String[] args) { 
        Scanner teclado = new Scanner(System.in); 
        String nombre, nombre1 = ""; 
        System.out.println("Ingrese un nombre"); 
        nombre = teclado.nextLine(); 
        for (int i = nombre.length() - 1; i >= 0; i--) { 
            nombre1 = nombre1 + nombre.charAt(i); 
        } 
        if (nombre.equals(nombre1)) { 
            System.out.println("La palabra es palindroma");  
        } 
        else {
            
            System.out.println("La palabra no es palindroma");
         }       
              
 
    } 
}
    