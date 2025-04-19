import java.util.*;

public class Honestidad {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // creamos los arrays con el numero de empleados (en ese caso 2 )
        String[] empleados = new String[2];
        double[] sueldos = new double[2];

        // variables donde guardar el nombre y sueldo del empleado que más gana
        String nombreMayor; // Variable para los nombres
        double mayorSueldo; // Variable para los sueldos
        double sumaSueldos = 0; // Variable para la suma de los sueldos

        int i = 0;

        // se lee el primer empleado
        System.out.println("Lectura de nombres y sueldos de empleados: ");
        System.out.print("Empleado " + (i + 1) + ": ");
        empleados[i] = sc.nextLine();
        System.out.print("Sueldo: ");
        sueldos[i] = sc.nextDouble();

        // se toma el primero leido como mayor
        mayorSueldo = sueldos[i];
        nombreMayor = empleados[i];
        sumaSueldos += sueldos[i]; // se suma el sueldo

        // se leen el resto de empleados
        for (i = 1; i < empleados.length; i++) {
            sc.nextLine(); // limpiar el buffer
            System.out.print("Empleado " + (i + 1) + ": ");
            empleados[i] = sc.nextLine();
            System.out.print("Sueldo: ");
            sueldos[i] = sc.nextDouble();
            // se compara el sueldo leido con el mayor actual
            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                nombreMayor = empleados[i];
            }
            sumaSueldos += sueldos[i]; // se suma el sueldo
        }

        // Calcular el promedio
        double promedioSueldos = sumaSueldos / empleados.length;

        // Imprimir resultados
        System.out.println("Empleado con mayor sueldo: " + nombreMayor);
        System.out.println("Sueldo: " + mayorSueldo);
        System.out.println("El promedio de los sueldos es: " + promedioSueldos);
    }
}

