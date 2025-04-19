import java.util.Scanner;

public class DiasDelMes {

    public static void main(String[] args) {

        int mes, año, numDias = 0;
        mes = leerEntero("Introduce el mes: ");
        año = leerEntero("Introduce el año: ");

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDias = 30;
                break;
            case 2:
                if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
                    numDias = 29;
                } else {
                    numDias = 28;
                }
                break;
            default:
                System.out.println("\nEl mes " + mes + " es incorrecto.");
                break;
        }

        if (numDias != 0) {
            System.out.println("\nEl mes " + mes + " del año " + año + " tiene " + numDias + " días.");
        }
    }

    private static int leerEntero(String s) {
        Scanner sc = new Scanner(System.in);
        System.out.print(s);
        return sc.nextInt();
    }
}