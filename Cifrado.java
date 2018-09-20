import java.io.IOException;
import java.util.Scanner;

public class Cifrado {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String texto;
        int codigo;
        char opcion;
        //Introducir un texto.Enter a text
        do {
            System.out.print("Introduce un texto: ");
            texto = sc.nextLine();
        } while (texto.isEmpty());
        //Introducir el valor del desplazamiento.Enter the displacement value
        do {
            System.out.print("Introduce el código: ");
            codigo = sc.nextInt();
        } while (codigo < 1);
        //Introducir la operación a realizar: cifrar o descifrar.Enter the operation to perform: encrypt or decrypt
        do {
            sc.nextLine();
            System.out.print("(C) cifrar o (D) descifrar?: ");
            opcion = (char) System.in.read();
            //mientras la opcion sea C llama la funcion para codificar y 
            //si la opcion es d llama a descifrar
        } while (Character.toUpperCase(opcion) != 'C' && Character.toUpperCase(opcion) != 'D');
        if (Character.toUpperCase(opcion) == 'C') {
            System.out.println("Texto cifrado: " + cifrado(texto, codigo));
        } else {
            System.out.println("Texto descifrado: " + descifrado(texto, codigo));
        }
    }

    //método para cifrar el texto
    public static String cifrado(String texto, int codigo) {
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        //cuenta las variables del alfabeto toman un numero de caracter de "a" a "z" contiene 26 caracteres
        //account the alphabet variables take a character number from "a" to "z" contains 26 characters
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) + codigo) > 'z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
                //Si el caracter es mayuscula la bota en mayuscula
                //If the character is upper case, the upper case
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) + codigo) > 'Z') {
                    cifrado.append((char) (texto.charAt(i) + codigo - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + codigo));
                }
            }
        }
        return cifrado.toString();
    }

    //método para descifrar el texto.method to decode the text
    public static String descifrado(String texto, int codigo) {
        StringBuilder cifrado = new StringBuilder();
        codigo = codigo % 26;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) - codigo) < 'a') {
                    cifrado.append((char) (texto.charAt(i) - codigo + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - codigo));
                }
                //Mismo paso pero a la inversa las mayusculas que entran las devuelve en mayusculas.Same step but conversely capitals that enter returns them in capital letters
                //ingresa el codigo u palabra indica cuantas veces en el alfabeto la desea trasladar.enter the code or word indicates how many times in the alphabet you want to translate it
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) - codigo) < 'A') {
                    cifrado.append((char) (texto.charAt(i) - codigo + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - codigo));
                }
            }
        }
        return cifrado.toString();
    }
} //Fin cifrado finish him 