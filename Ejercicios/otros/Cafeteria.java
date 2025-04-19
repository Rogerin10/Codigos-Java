import java.util.Scanner;
import java.util.Date;

public class Cafeteria {
    public static void main(String[] args) {
        System.out.println("Cafeteria");
        System.out.println("-------------- Menu del día --------------");
        System.out.println("1. Gohan --> $4000 ");
        System.out.println("2. Completo --> $2000 ");
        System.out.println("3. Ensalada --> $3000 ");
        System.out.println("4. Cafe --> $500 ");

        // Capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, seleccione el plato que desea (1, 2 o 3): ");
        int opcion = scanner.nextInt();

        double total = 0.0;
        String plato = "";

        switch (opcion) {
            case 1:
                plato = "Gohan";
                total = 4000;
                break;
            case 2:
                plato = "Completo";
                total = 2000;
                break;
            case 3:
                plato = "Ensalada";
                total = 3000;
                break;
            case 4:
                plato = "Cafe";
                total = 500;
                break;
            default:
                System.out.println("Opción inválida");
                return;
        }
        Date date = new Date(); // objeto fecha

        System.out.println("Plato seleccionado: " + plato);
        System.out.println("Total a pagar: $" + total);
        System.out.println("Fecha de la compra: " + date);

    }
}
