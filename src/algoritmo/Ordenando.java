package algoritmo;


import algoritmo.Ordenamiento;
import java.util.Arrays;

public class Ordenando extends Ordenamiento {
    public static void main(String[] args) {
        int[] tamanios = {100, 500, 1000, 5000, 10000};

        System.out.println("Tamano del arreglo\tBurbuja\t\tInsercion\tSeleccion\tMergesort");
        for (int n : tamanios) {
            double[] arr = generarArregloAleatorio(n);
            double[] arrCopia;

            // Burbuja
            arrCopia = Arrays.copyOf(arr, arr.length);
            long startTime = System.nanoTime();
            Ordenamiento.burbuja(arrCopia);
            long endTime = System.nanoTime();
            long durationBurbuja = (endTime - startTime) / 1000000;

            // Inserción
            arrCopia = Arrays.copyOf(arr, arr.length);
            startTime = System.nanoTime();
            Ordenamiento.insercion(arrCopia);
            endTime = System.nanoTime();
            long durationInsercion = (endTime - startTime) / 1000000;

            // Selección
            arrCopia = Arrays.copyOf(arr, arr.length);
            startTime = System.nanoTime();
            Ordenamiento.seleccion(arrCopia);
            endTime = System.nanoTime();
            long durationSeleccion = (endTime - startTime) / 1000000;

            // Mergesort
            arrCopia = Arrays.copyOf(arr, arr.length);
            startTime = System.nanoTime();
            Ordenamiento.mergesort(arrCopia, 0, arrCopia.length - 1);
            endTime = System.nanoTime();
            long durationMergesort = (endTime - startTime) / 1000000;

            System.out.printf("%d\t\t\t\t%d ms\t\t%d ms\t\t%d ms\t\t%d ms%n",
                    n, durationBurbuja, durationInsercion, durationSeleccion, durationMergesort);
        }
    }
    
    public static double[] generarArregloAleatorio(int n) {
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Math.random();
        }
        return arr;
    }
}
