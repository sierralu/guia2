package algoritmo;

import java.util.Scanner;

public class Operaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamano de las matrices (filas columnas):");
        int filas = scanner.nextInt();
        int columnas = scanner.nextInt();

        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];

        System.out.println("Ingrese los elementos de la primera matriz:");
        llenarMatriz(matriz1, scanner);
        System.out.println("La primera matriz es:");
        imprimirMatriz(matriz1);

        System.out.println("Ingrese los elementos de la segunda matriz:");
        llenarMatriz(matriz2, scanner);
        System.out.println("La segunda matriz es:");
        imprimirMatriz(matriz2);

        
        System.out.println("Seleccione la operacion a realizar:");
        System.out.println("1. Suma de matrices");
        System.out.println("2. Producto de matrices");
        System.out.println("3. Producto de un escalar con una matriz");
        System.out.println("4. Traspuesta de una matriz");
        int opcion = scanner.nextInt();

        
        switch (opcion) {
            case 1:
                int[][] suma = Algoritmo.sumaMatrices(matriz1, matriz2);
                System.out.println("La suma de las matrices es:");
                imprimirMatriz(suma);
                break;
            case 2:
                int[][] producto = Algoritmo.productoMatrices(matriz1, matriz2);
                System.out.println("El producto de las matrices es:");
                imprimirMatriz(producto);
                break;
            case 3:
                System.out.println("Ingrese el escalar:");
                int escalar = scanner.nextInt();
                int[][] productoEscalar = Algoritmo.productoEscalarMatriz(matriz1, escalar);
                System.out.println("El producto del escalar con la primera matriz es:");
                imprimirMatriz(productoEscalar);
                break;
            case 4:
                int[][] traspuesta = Algoritmo.traspuestaMatriz(matriz1);
                System.out.println("La traspuesta de la primera matriz es:");
                imprimirMatriz(traspuesta);
                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }

    private static void llenarMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    private static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}



