import java.util.Scanner;
import java.util.Random;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int intento = 0; // Variable para almacenar el intento del usuario
        int contadorIntentos = 0; // Variable para contar los intentos realizados

        System.out.println("Adivina el número entre 1 y 100:");

        // Bucle para que el usuario intente adivinar el número
        while (intento != numeroSecreto) {
            System.out.print("Ingresa tu intento: ");
            intento = scanner.nextInt(); // Leer el intento del usuario
            contadorIntentos++; // Incrementar el contador de intentos

            if (intento < numeroSecreto) {
                System.out.println("Demasiado bajo. Intenta nuevamente.");
            } else if (intento > numeroSecreto) {
                System.out.println("Demasiado alto. Intenta nuevamente.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en " + contadorIntentos + " intentos.");
            }
        }

        scanner.close();
    }
}
