import java.util.ArrayList;
import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un numero limite: ");
        int limite = scanner.nextInt();

        // Crear una lista
        ArrayList<Integer> primos = generarPrimos(limite);

        // Imprimir la lista de nnumero primos
        System.out.println("Números primos hasta " + limite + ": " + primos);
    }

    // Método para generar nnumero primos hasta el límite
    public static ArrayList<Integer> generarPrimos(int limite) {
        ArrayList<Integer> primos = new ArrayList<>();

        for (int i = 2; i <= limite; i++) {
            if (esPrimo(i)) {
                primos.add(i); // Agregar el numero primo a la lista
            }
        }

        return primos;
    }

    // Funcion para verificar si un numero es primo

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
