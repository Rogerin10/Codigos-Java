
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {
    static List<String> clientes = new ArrayList<String>();
    static List<String> vehiculos = new ArrayList<String>();

    public static void main(String[] args) {
        String usuario = "", password = "";
        String nombre, apellido, rut, correo;
        int telefono;
        String marcaVehiculo, modelo, Vehiculo_Con_mayor_ventas, marca, Modelo;
        boolean continuarEjecucion = true;

        System.out.println("Bienvenido al Sistema");
        System.out.println("---Servirep---");

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Inicie sesión:");
            usuario = scanner.nextLine();
            System.out.println("Ingrese Contraseña:");
            password = scanner.nextLine();

            if (usuario.equals("Usuario") && password.equals("contraseña")) {
                System.out.println("Inicio de sesión");
                break;
            } else {
                System.out.println("Usuario o contraseña incorrectos. Intente nuevamente.");
            }
        } while (true);

        while (continuarEjecucion) {
            System.out.println("¿Qué desea realizar?");
            System.out.println("1. Ingresar información");
            System.out.println("2. Ver datos");
            System.out.println("3. Salir");
            int opcionRealizar = Integer.parseInt(scanner.nextLine());

            switch (opcionRealizar) {
                case 1:
                    ingresarInformacion();
                    break;
                case 2:
                    verDatos();
                    break;
                case 3:
                    System.out.println("Finalizando...");
                    continuarEjecucion = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }

    static void ingresarInformacion() {
        boolean continuarIngresando = true;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("¿Qué información desea ingresar?");
            System.out.println("1. Clientes");
            System.out.println("2. Vehículos");
            System.out.println("3. Salir");
            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    ingresarClientes();
                    break;
                case 2:
                    ingresarVehiculos();
                    break;
                case 3:
                    System.out.println("Volviendo al menú principal.");
                    continuarIngresando = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (continuarIngresando);
    }

    static void ingresarClientes() {
        boolean continuarIngresando = true;
        Scanner scanner = new Scanner(System.in);

        while (continuarIngresando) {
            System.out.println("Ingrese nombre del Cliente:");
            String nombre = scanner.nextLine();

            System.out.println("Ingrese Apellido del Cliente:");
            String apellido = scanner.nextLine();

            System.out.println("Correo:");
            String correo = scanner.nextLine();

            System.out.println("Ingrese telefono:");
            int telefono = Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese Rut:");
            String rut = scanner.nextLine();

            String nuevoCliente = nombre + " " + apellido + ", " + correo + ", " + telefono + ", " + rut + ". ";
            clientes.add(nuevoCliente);

            System.out
                    .println("Información ingresada: " + nombre + " " + apellido + " " + correo + " " + telefono + ".");

            System.out.println("¿Desea ingresar otra información de cliente? (S/N):");
            String respuesta = scanner.nextLine();

            if (!respuesta.toLowerCase().equals("s")) {
                continuarIngresando = false;
            }
        }
    }

    static void ingresarVehiculos() {
        boolean continuarIngresando = true;
        Scanner scanner = new Scanner(System.in);

        while (continuarIngresando) {
            System.out.println("Ingrese Marca del Vehiculo:");
            String marca = scanner.nextLine();

            System.out.println("Ingrese Modelo del Vehiculo:");
            String modelo = scanner.nextLine();

            System.out.println("Ingrese color del vehiculo ");
            String color = scanner.nextLine();

            System.out.println("Ingrese patente del vehiculo ");
            String patente = scanner.nextLine();

            String nuevoVehiculo = marca + ", " + modelo + " " + patente + " " + color + ". ";
            vehiculos.add(nuevoVehiculo);

            System.out.println("Datos ingresados: " + marca + ", " + modelo + ", " + patente + ", " + color + ".");

            System.out.println("¿Desea ingresar otro vehículo? (S/N):");
            String respuesta = scanner.nextLine();

            if (!respuesta.toLowerCase().equals("s")) {
                continuarIngresando = false;
            }
        }
    }

    static void mostrarDatos(List<String> datos) {
        if (datos.size() == 0) {
            System.out.println("No hay datos para mostrar.");
        } else {
            System.out.println("Datos:");
            for (int i = 0; i < datos.size(); i++) {
                System.out.println((i + 1) + ". " + datos.get(i));
            }
        }
    }

    static void verDatos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Qué datos deseas ver?");
        System.out.println("1. Datos de Clientes");
        System.out.println("2. Datos de Vehículos");
        System.out.println("3. Datos del Vehículo con mayor número de ventas");
        System.out.println("4. Volver al menú principal");

        int opcion = Integer.parseInt(scanner.nextLine());

        switch (opcion) {
            case 1:
                System.out.println("Datos de Clientes:");
                mostrarDatos(clientes);
                break;
            case 2:
                System.out.println("Datos de Vehículos:");
                mostrarDatos(vehiculos);
                break;
            case 3:
                System.out.println("Toyota Yaris");
                break;
            case 4:
                System.out.println("Volviendo al menú principal.");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}