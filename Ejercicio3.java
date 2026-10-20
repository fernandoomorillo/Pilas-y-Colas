import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Stack<Character> pila = new Stack<>();
        Queue<Character> cola = new LinkedList<>();

        System.out.print("Introduce una palabra o frase: ");
        String texto = teclado.nextLine();

        // Normalizar el texto
        texto = texto.toLowerCase().replace(" ", "");

        // Introducir los caracteres en la pila y en la cola
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);

            pila.push(caracter);
            cola.offer(caracter);
        }

        boolean palindromo = true;

        // Comparar los caracteres de ambas estructuras
        while (!pila.isEmpty() && !cola.isEmpty()) {

            char caracterPila = pila.pop();
            char caracterCola = cola.poll();

            if (caracterPila != caracterCola) {
                palindromo = false;
                break;
            }
        }

        if (palindromo) {
            System.out.println("El texto es palindromo.");
        } else {
            System.out.println("El texto no es palindromo.");
        }

        teclado.close();
    }
}
