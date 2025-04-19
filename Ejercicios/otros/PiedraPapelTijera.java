import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {

    public static String jugarPiedraPapelTijera(String jugador, String computadora) {
        if (jugador.equals(computadora)) {
            return "Empate";
        }

        if (jugador.equals("piedra")) {
            if (computadora.equals("papel")) {
                return "Computadora gana";
            } else {
                return "Jugador gana";
            }
        }

        if (jugador.equals("papel")) {
            if (computadora.equals("tijera")) {
                return "Computadora gana";
            } else {
                return "Jugador gana";
            }
        }

        if (jugador.equals("tijera")) {
            if (computadora.equals("piedra")) {
                return "Computadora gana";
            } else {
                return "Jugador gana";
            }
        }

        return "Opción inválida";
    }

    public static void main(String[] args) {
        System.out.println("Bienvenido a Piedra, Papel o Tijera!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elige: piedra, papel o tijera: ");
        String jugador = scanner.nextLine().toLowerCase();
        String[] opciones = {"piedra", "papel", "tijera"};
        Random random = new Random();
        String computadora = opciones[random.nextInt(opciones.length)];
        String resultado = jugarPiedraPapelTijera(jugador, computadora);
        System.out.println("Jugador elige " + jugador);
        System.out.println("Computadora elige " + computadora);
        System.out.println(resultado);
        scanner.close();
    }
}

