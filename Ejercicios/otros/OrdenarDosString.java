import java.util.Scanner;

public class OrdenarDosString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena1, cadena2;

        System.out.print("Introduce cadena 1: ");
        cadena1 = sc.nextLine();
        System.out.print("Introduce cadena 2: ");
        cadena2 = sc.nextLine();

        // comprobamos si cadena1 es menor que cadena2 en el orden alfabético
        if (cadena1.compareToIgnoreCase(cadena2) < 0) { // No se pueden comparar cadenas utilizando < ó >
            System.out.println(cadena1);
            System.out.println(cadena2);
        } else {
            System.out.println(cadena2);
            System.out.println(cadena1);
        }
    }
}