import java.util.Scanner;

public class PangramDetector {

    // Método para verificar si una cadena es un pangrama
    public static boolean esPangrama(String cadena) {
        // Convertir la cadena a minúsculas para evitar diferencias entre mayúsculas y
        // minúsculas
        cadena = cadena.toLowerCase();

        // Inicializar un arreglo booleano para marcar la presencia de cada letra
        boolean[] letrasPresentes = new boolean[26];

        // Recorrer cada carácter de la cadena
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            // Si el carácter es una letra del alfabeto, marcarla como presente
            if (Character.isLetter(c)) {
                int indice = c - 'a'; // Calcular el índice (0 para 'a', 1 para 'b', ..., 25 para 'z')
                letrasPresentes[indice] = true;
            }
        }

        // Verificar si todas las letras del alfabeto están presentes
        for (boolean presente : letrasPresentes) {
            if (!presente) {
                return false; // Si falta alguna letra, no es un pangrama
            }
        }
        return true; // Si todas las letras están presentes, es un pangrama
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese una línea
        System.out.println("Introduce una frase o cadena para verificar si es un pangrama:");
        String cadena = scanner.nextLine();

        // Llamar al método esPangrama y mostrar el resultado
        if (esPangrama(cadena)) {
            System.out.println("La cadena es un pangrama.");
        } else {
            System.out.println("La cadena no es un pangrama.");
        }

        scanner.close();
    }
}
