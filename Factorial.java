import java.io.*;
import java.util.Scanner;
public class Factorial {
//Indicamos el numero que deseamos sacar el factorial.We indicate the number that we want to take the factorial
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Ingrese numero: ");
      int n = sc.nextInt();
      int factorial = 1;
      //mientras numero sea diferente a 0 .while number is different from 0
      while(n != 0){
          factorial *= n ;
          n --;
        //se sigue multiplicando por el numero factorial asta que llegue a cero,it continues multiplying by the factorial number until it reaches zero

      }
      System.out.print("El factorial es : " + factorial);
    }
    
}
