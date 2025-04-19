import java.util.Scanner;
import java.util.Random;

public class Persona {
    private static final int PESO_BAJO = -1;
    private static final int PESO_IDEAL = 0;
    private static final int SOBREPESO = 1;
    private static final char SEXO_DEFECTO = 'H';

    private String nombre = "";
    private int edad = 0;
    private String dni;
    private char sexo = SEXO_DEFECTO;
    private double peso = 0;
    private double altura = 0;

    // Constructor por defecto
    public Persona() {
        this.dni = generaDNI();
    }

    // Constructor con nombre, edad y sexo
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = comprobarSexo(sexo);
        this.dni = generaDNI();
    }

    // Constructor con todos los atributos
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this(nombre, edad, sexo); // Llama al constructor anterior
        this.peso = peso;
        this.altura = altura;
    }

    // Método para calcular el IMC
    public int calcularIMC() {
        double imc = peso / (altura * altura);
        if (imc < 20) {
            return PESO_BAJO;
        } else if (imc <= 25) {
            return PESO_IDEAL;
        } else {
            return SOBREPESO;
        }
    }

    // Método para comprobar si es mayor de edad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    // Método privado para comprobar el sexo
    private char comprobarSexo(char sexo) {
        return (sexo == 'H' || sexo == 'M') ? sexo : SEXO_DEFECTO;
    }

    // Método privado para generar el DNI
    private String generaDNI() {
        Random random = new Random();
        int numero = random.nextInt(90000000) + 10000000; // Número aleatorio de 8 cifras
        char letra = generaLetraDNI(numero);
        return numero + String.valueOf(letra);
    }

    // Método privado para generar la letra del DNI
    private char generaLetraDNI(int numero) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        return letras.charAt(numero % 23);
    }

    // Método toString para mostrar la información del objeto
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", DNI: " + dni + ", Sexo: " + sexo +
                ", Peso: " + peso + "kg, Altura: " + altura + "m";
    }

    // Métodos set para los atributos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos por teclado para la primera persona
        System.out.println("Introduce el nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Introduce la edad:");
        int edad = scanner.nextInt();

        System.out.println("Introduce el sexo (H/M):");
        char sexo = scanner.next().toUpperCase().charAt(0);

        System.out.println("Introduce el peso (en kg):");
        double peso = scanner.nextDouble();

        System.out.println("Introduce la altura (en metros):");
        double altura = scanner.nextDouble();

        // Crear objetos Persona
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();
        persona3.setNombre("Carlos");
        persona3.setEdad(25);
        persona3.setSexo('H');
        persona3.setPeso(70);
        persona3.setAltura(1.75);

        // Comprobar estado de peso y si son mayores de edad para cada objeto
        comprobarPersona(persona1);
        comprobarPersona(persona2);
        comprobarPersona(persona3);
    }

    // Método para comprobar el peso ideal y si es mayor de edad
    public static void comprobarPersona(Persona persona) {
        int imc = persona.calcularIMC();
        String estadoPeso = switch (imc) {
            case -1 -> "por debajo de su peso ideal.";
            case 0 -> "en su peso ideal.";
            case 1 -> "con sobrepeso.";
            default -> "con un IMC no calculable.";
        };
        System.out.println(persona.toString() + " está " + estadoPeso);
        System.out.println(persona.esMayorDeEdad() ? "Es mayor de edad." : "No es mayor de edad.");
    }
}
