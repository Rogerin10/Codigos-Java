import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPagar = 0;
        String respuesta;

        do {
            System.out.println("¿Qué colación desea?");
            System.out.println("1- Pollo con arroz y jugo a $3,000");
            System.out.println("2- Pollo con puré y jugo a $3,400");
            System.out.println("3- Pollo con papas fritas y bebida a $4,500");
            System.out.println("4- Sandwich vegetariano (carne de soya) y bebida/jugo a $3,000");
            System.out.println("5- Completo más bebida express $1,800");
            System.out.println("6- Bowl vegetariano (atún, lechuga, papas doradas y apio) con café a $3,500");
            System.out.println("7- Carne mongoliana con arroz y bebida a $3,000");
            System.out.println("8- Carne a la olla con puré y jugo a $3,500");
            int orden = scanner.nextInt();

            System.out.println("¿Cuántos menús desea?");
            int cantidadMenu = scanner.nextInt();

            switch (orden) {
                case 1:
                    totalPagar += 3000 * cantidadMenu;
                    break;
                case 2:
                    totalPagar += 3400 * cantidadMenu;
                    break;
                case 3:
                    totalPagar += 4500 * cantidadMenu;
                    break;
                case 4:
                    totalPagar += 3000 * cantidadMenu;
                    break;
                case 5:
                    totalPagar += 1800 * cantidadMenu;
                    break;
                case 6:
                    totalPagar += 3500 * cantidadMenu;
                    break;
                case 7:
                    totalPagar += 3000 * cantidadMenu;
                    break;
                case 8:
                    totalPagar += 3500 * cantidadMenu;
                    break;
                default:
                    System.out.println("Error en la solicitud");
            }

            System.out.println("¿Desea pedir mas menus? (Sí/No)");
            respuesta = scanner.next();
        } while (respuesta.equalsIgnoreCase("Sí"));

        System.out.println("El total a pagar es: $" + totalPagar);
        scanner.close();
    }
}
