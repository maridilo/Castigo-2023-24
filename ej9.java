import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar las dimensiones del vector
        System.out.print("Ingrese la dimensión de los vectores: ");
        int dimension = scanner.nextInt();

        // Crear los vectores
        int[] vector1 = new int[dimension];
        int[] vector2 = new int[dimension];

        // Solicitar los elementos del primer vector
        System.out.println("Ingrese los elementos del primer vector:");
        leerVector(scanner, vector1);

        // Solicitar los elementos del segundo vector
        System.out.println("Ingrese los elementos del segundo vector:");
        leerVector(scanner, vector2);

        // Calcular el producto escalar
        int productoEscalar = calcularProductoEscalar(vector1, vector2);

        // Imprimir el resultado
        System.out.println("El producto escalar es: " + productoEscalar);
    }

    // Función para leer los elementos de un vector desde el teclado
    public static void leerVector(Scanner scanner, int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }
    }

    // Función para calcular el producto escalar de dos vectores
    public static int calcularProductoEscalar(int[] vector1, int[] vector2) {
        int productoEscalar = 0;
        for (int i = 0; i < vector1.length; i++) {
            productoEscalar += vector1[i] * vector2[i];
        }
        return productoEscalar;
    }
}
