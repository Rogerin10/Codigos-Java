import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nota: ");
        double nota = scanner.nextDouble();

        if (nota >= 0 && nota < 3) {
            System.out.println("Muy deficiente");
        } else if (nota >= 3 && nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("Suficiente");
        } else if (nota >= 6 && nota < 7) {
            System.out.println("Bien");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Notable");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("Sobresaliente");
        } else {
            System.out.println("La nota ingresada no es válida.");
        }

        scanner.close();
    }
}
