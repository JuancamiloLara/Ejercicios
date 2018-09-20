package alejandra;
 import java.util.Scanner;
 public class Fibonacci{
    public static void main(String[] args) {
        // se lee la variable.the variable is read
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos numeros desea: ");
        int n = sc.nextInt();
        //se almacena el resultado.the result is stored
        // si numero1 a = 0 y numero b es igual a 1 y d igual a 1.if number1 a = 0 and number b equals 1 and d equals 1
        int a = 0, b = 1, c, d = 1;
        System.out.print(a + "\t" + b);
        // se hace la suma.the sum is made
        for(int i = 2 ; i <= n ; i++) {
         //si indice es igual a = 2 , indice menor o igual a numero indice se suma.if index is equal to = 2, index less than or equal to index number is added
            c = a + b;
            System.out.print(c + "\t");
           //si c toma el valor de la suma de a + b, a = b y b = c, d toma el valor de c.if c takes the value of the sum of a + b, a = b and b = c, d takes the value of c.
            d += c;
            a = b;
            b = c;
            
        }
        System.out.println("\nLa sumatoria es:" +  d);
    }
    
}
