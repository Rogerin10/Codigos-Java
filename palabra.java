import java.util.*;

public class palabra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una palabra: ");
        String cadena_texto = sc.nextLine().toLowerCase(); // Ignoramos mayusculas y minusculas

        String reverso = "";

        // Concatenamos desde el último índice hasta el primero para obtener la palabra
        // invertida
        for (int i = cadena_texto.length() - 1; i >= 0; --i) {
            reverso = reverso + cadena_texto.charAt(i);
        }

        // Comparamos la palabra original con su reverso para determinar si es un
        // palíndromo
        if (cadena_texto.equals(reverso)) {
            System.out.println(cadena_texto + " es palindromo");
        } else {
            System.out.println(cadena_texto + " no es palindromo");
        }
    }
}
