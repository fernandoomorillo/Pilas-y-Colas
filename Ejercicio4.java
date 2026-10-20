import java.util.Scanner;
import java.util.Stack;

public class Ejercicio4 {

    public static void main(String[] args) {

        //Pila para guardar los restos
        Scanner sc = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();

        System.out.print("Introduce un numero positivo: ");
        int numero = sc.nextInt();

        //Dividimos el numero entre 2 y guarda el resto
        while (numero > 0) {
            pila.push(numero % 2);
            numero = numero / 2;
        }

        System.out.print("Numero binario: ");

        //Saca el resto para tener el numero binario
        while (!pila.isEmpty()) {
            System.out.print(pila.pop());
        }
        sc.close();
    }
}