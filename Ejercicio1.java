import java.util.Scanner;
import java.util.Stack;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Lee lo que escribinos
        // La pila almacena el texto
        Scanner teclado = new Scanner(System.in);
        Stack<Character> pila = new Stack<>();

        System.out.print("Introduce un texto: ");
        String texto = teclado.nextLine();

        // Los caracteres del texto pasan a la pila
        for (int i = 0; i < texto.length(); i++) {
            pila.push(texto.charAt(i));
        }

        //Los caracteres de la pila los extrae y sale la frase al reves
        while (!pila.isEmpty()) {
            System.out.print(pila.pop());
        }

        teclado.close();
    }
}