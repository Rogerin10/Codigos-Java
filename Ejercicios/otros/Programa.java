import java.util.Scanner;

class Fraccion {

    //
    private int numerador;
    private int denominador;

    //
    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }

    // sumar
    public Fraccion sumar(Fraccion otra) {
        int nuevoNumerador = this.numerador * otra.denominador + otra.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otra.denominador;
        return simplificar(new Fraccion(nuevoNumerador, nuevoDenominador));

    }

    // Restar
    public Fraccion restar(Fraccion otra) {
        int nuevoNumerador = this.numerador * otra.denominador - otra.numerador * this.denominador;
        int nuevoDenominador = this.denominador * otra.denominador;
        return simplificar(new Fraccion(nuevoNumerador, nuevoDenominador));
    }

    // multiplicar
    public Fraccion multiplicar(Fraccion otra) {
        int nuevoNumerador = this.numerador * otra.numerador;
        int nuevoDenominador = this.denominador * otra.denominador;
        return simplificar(new Fraccion(nuevoNumerador, nuevoDenominador));

    }

    // dividir
    public Fraccion dividir(Fraccion otra) {
        if (otra.numerador == 0) {
            throw new IllegalArgumentException("No se puede dividir entre una fracción con numerador cero.");
        }
        int nuevoNumerador = this.numerador * otra.numerador;
        int nuevoDenominador = this.denominador * otra.numerador;
        return simplificar(new Fraccion(nuevoNumerador, nuevoDenominador));
    }

    // Simplificar
    private Fraccion simplificar(Fraccion f) {
        int mcd = MCD(f.numerador, f.denominador);
        return new Fraccion(f.numerador / mcd, f.denominador / mcd);
    }

    // Método para encontrar el Máximo Común Divisor (MCD)
    private int MCD(int a, int b) {
        if (b == 0)
            return a;
        return MCD(b, a % b);
    }

    // Sobrescribir el método toString para mostrar la fracción
    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }
}

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                // Ingresar primera fracción
                System.out.println("Ingrese la primera fracción:");
                System.out.print("Numerador: ");
                int num1 = scanner.nextInt();
                System.out.print("Denominador: ");
                int den1 = scanner.nextInt();

                Fraccion fraccion1 = new Fraccion(num1, den1);

                // Ingresar segunda fracción
                System.out.println("Ingrese la segunda fracción:");
                System.out.print("Numerador: ");
                int num2 = scanner.nextInt();
                System.out.print("Denominador: ");
                int den2 = scanner.nextInt();

                Fraccion fraccion2 = new Fraccion(num2, den2);

                // Mostrar las operaciones
                System.out.println("Operaciones:");
                System.out.println("Suma: " + fraccion1.sumar(fraccion2));
                System.out.println("Resta: " + fraccion1.restar(fraccion2));
                System.out.println("Multiplicación: " + fraccion1.multiplicar(fraccion2));
                System.out.println("División: " + fraccion1.dividir(fraccion2));
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
            }

            // Preguntar si quiere continuar
            System.out.print("¿Desea realizar otra operación? (s/n): ");
            String respuesta = scanner.next().toLowerCase();
            continuar = respuesta.equals("s");
        }
        scanner.close();
    }
}