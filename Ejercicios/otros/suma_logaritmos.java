import java.util.Scanner;

public class suma_logaritmos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double X, A, B;

        System.out.println("Ingrese el valor de X: ");
        X = scanner.nextDouble();
        System.out.println("Ingrese el valor de A: ");
        A = scanner.nextDouble();
        System.out.println("Ingrese el valor de B: ");
        B = scanner.nextDouble();

        double suma_logaritmos = Math.log(A) / Math.log(X) + Math.log(B) / Math.log(X);
        System.out.println(
                "La suma de los logaritmos con base " + X + " de " + A + " y " + B + " es: " + suma_logaritmos);

    }
}
