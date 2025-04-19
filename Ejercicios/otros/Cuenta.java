import java.util.Scanner;

public class Cuenta {
    // Atributos de la clase Cuenta
    private long numeroCuenta;
    private long dniCliente;
    private double saldoActual;
    private final double interesAnual = 0.03; // Interés fijo de 3%

    // Constructor por defecto
    public Cuenta() {
        this.numeroCuenta = generarNumeroCuenta();
        this.dniCliente = 0;
        this.saldoActual = 0.0;
    }

    // Constructor con DNI y saldo inicial
    public Cuenta(long dniCliente, double saldoInicial) {
        this.numeroCuenta = generarNumeroCuenta();
        this.dniCliente = dniCliente;
        this.saldoActual = saldoInicial;
    }

    // Método para generar un número de cuenta único
    private long generarNumeroCuenta() {
        return (long) (Math.random() * 1000000000L); // Número de cuenta de hasta 9 dígitos
    }

    // Método para actualizar el saldo aplicando el interés diario
    public void actualizarSaldo() {
        double interesDiario = interesAnual / 365;
        saldoActual += saldoActual * interesDiario;
    }

    // Método para ingresar una cantidad en la cuenta
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldoActual += cantidad;
            System.out.println("Se han ingresado " + String.format("%.2f", cantidad) + "€. Saldo actual: "
                    + String.format("%.2f", saldoActual) + "€.");
        } else {
            System.out.println("La cantidad ingresada debe ser positiva.");
        }
    }

    // Método para retirar una cantidad de la cuenta si hay saldo suficiente
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (saldoActual >= cantidad) {
                saldoActual -= cantidad;
                System.out.println("Se han retirado " + String.format("%.2f", cantidad) + "€. Saldo actual: "
                        + String.format("%.2f", saldoActual) + "€.");
            } else {
                System.out.println("Saldo insuficiente para realizar la operación.");
            }
        } else {
            System.out.println("La cantidad retirada debe ser positiva.");
        }
    }

    // Método para mostrar los datos de la cuenta
    public void mostrarDatos() {
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("DNI del cliente: " + dniCliente);
        System.out.println("Saldo actual: " + String.format("%.2f", saldoActual) + "€.");
        System.out.println("Interés anual aplicado: " + (interesAnual * 100) + "%.");
    }

    // Menú interactivo para manejar las operaciones de la cuenta
    public static void menu(Cuenta cuenta) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Operaciones ---");
            System.out.println("1. Actualizar saldo (aplicar interés diario)");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Mostrar datos de la cuenta");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    cuenta.actualizarSaldo();
                    System.out.println("Saldo actualizado con el interés diario.");
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double cantidadIngresar = sc.nextDouble();
                    cuenta.ingresar(cantidadIngresar);
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetirar = sc.nextDouble();
                    cuenta.retirar(cantidadRetirar);
                    break;
                case 4:
                    cuenta.mostrarDatos();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }

    // Método principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el DNI del cliente: ");
        long dniCliente = sc.nextLong();

        System.out.print("Ingrese el saldo inicial: ");
        double saldoInicial = sc.nextDouble();

        Cuenta cuenta = new Cuenta(dniCliente, saldoInicial);
        menu(cuenta);
    }
}
