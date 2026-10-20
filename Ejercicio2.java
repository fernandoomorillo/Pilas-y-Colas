import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        //Creamos la cola para guardar los nombres
        Scanner teclado = new Scanner(System.in);
        Queue<String> cola = new LinkedList<>();
        int opcion;

        //HAcemo un menu
        do {
            System.out.println("\n1. Llegada");
            System.out.println("2. Atender");
            System.out.println("3. Mostrar cola");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                // Añadimos clietnes a la cola
                case 1:
                    System.out.print("Nombre del cliente: ");
                    cola.offer(teclado.nextLine());
                    break;

                    //Vemos si hay clientes en la cola
                case 2:
                    if (!cola.isEmpty()) {
                        System.out.println("Cliente atendido: " + cola.poll());
                    } else {
                        System.out.println("La cola esta vacia.");
                    }
                    break;
                // Se muestren los clientes
                case 3:
                    System.out.println(cola);
                    break;
                //Salir
                case 4:
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 4);
        teclado.close();
    }
}