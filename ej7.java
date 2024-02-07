
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        List<Integer> factoresPrimos = descomponerEnFactoresPrimos(numero);

        System.out.print("Los factores primos de " + numero + " son: ");
        for (int factor : factoresPrimos) {
            System.out.print(factor + " ");
        }
    }

    public static List<Integer> descomponerEnFactoresPrimos(int numero) {
        List<Integer> factoresPrimos = new ArrayList<>();

        for (int i = 2; i <= numero; i++) {
            while (numero % i == 0) {
                factoresPrimos.add(i);
                numero /= i;
            }
        }

        return factoresPrimos;
    }
}
