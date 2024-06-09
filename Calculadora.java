public class Calculadora {

    // Método para sumar dos números
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método para restar dos números
    public int restar(int a, int b) {
        return a - b;
    }

    // Método para multiplicar dos números
    public int multiplicar(int a, int b) {
        return a * b;
    }

    // Método para dividir dos números
    public double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Error: División por cero");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase Calculadora
        Calculadora calc = new Calculadora();

        // Realizar algunas operaciones
        int suma = calc.sumar(10, 5);
        int resta = calc.restar(10, 5);
        int multiplicacion = calc.multiplicar(10, 5);
        double division = calc.dividir(10, 5);

        // Imprimir los resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }
}
