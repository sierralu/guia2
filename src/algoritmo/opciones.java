package algoritmo;

import java.util.Scanner;

public class opciones{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione la opcion:");
            System.out.println("1. Operaciones con matrices");
            System.out.println("2. Ordenamiento de arreglos");
            System.out.println("3. Interfaz grafica");
            System.out.println("4. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Operaciones.main(new String[0]);
                    break;
                case 2:
                    Ordenando.main(new String[0]);
                    break;
                case 3:
                    GUI.main(new String[0]);
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
