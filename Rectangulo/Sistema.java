package Clases;

import java.util.Scanner;

public class Sistema {
    public static void main(String []args){
        
        Scanner scanner = new Scanner(System.in);
        
        Rectangulo[] rectangulos = new Rectangulo[20]; // vector

  // se solicitan los datos al usuario y crear los objetos del Rectangulo
        // luego se corren con un bucle for
        
        for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese el ancho para el rectangulo " + (i + 1) + ": ");
            int ancho = scanner.nextInt();

            System.out.println("Ingrese el largo para el rectangulo " + (i + 1) + ": ");
            int largo = scanner.nextInt();

            rectangulos[i] = new Rectangulo(ancho, largo);  // cada objeto se almacena en el arreglo rectangulos
        }
    
        int opcion;
        do {
            System.out.println("\nMenu de Opciones");
            System.out.println("1. Obtener Perimetro de un rectangulo ");
            System.out.println("2. Obtener Área de un Rectángulo ");
            System.out.println("3. Cambiar el Ancho de un rectangulo ");
            System.out.println("4. Cambiar el Largo de un rectangulo ");
            System.out.println("5. Salir ");
            System.out.print("Ingrese la opcion: ");
            
            opcion = scanner.nextInt(); // se lee la opcion

            switch (opcion) {       // menu con las opciones
                
                case 1:
                    int rectanguloIndex = leeLongitudLado(rectangulos.length, scanner);
                    
                    if (rectanguloIndex >= 0) {
                        int perimetro = rectangulos[rectanguloIndex].obtienePerimetro();
                        System.out.println("Perimetro del rectangulo: " + perimetro);
                    }
                    break;
                    
                case 2:
                    rectanguloIndex = leeLongitudLado(rectangulos.length, scanner);
                    
                    if (rectanguloIndex >= 0) {
                        int area = rectangulos[rectanguloIndex].calcularArea();
                        System.out.println("Área del rectangulo: " + area);
                    }
                    break;
                    
                case 3:
                    rectanguloIndex = leeLongitudLado(rectangulos.length, scanner);
                    
                    if (rectanguloIndex >= 0) {
                        System.out.print("Ingrese el nuevo ancho: ");
                        int nuevoAncho = scanner.nextInt();
                        rectangulos[rectanguloIndex].cambiaAncho(nuevoAncho);
                        System.out.println("Ancho del rectangulo actualizado.");
                    }
                    break;
                    
                case 4:
                    rectanguloIndex = leeLongitudLado(rectangulos.length, scanner);
                    
                    if (rectanguloIndex >= 0) {
                        System.out.print("Ingrese el nuevo largo: ");
                        int nuevoLargo = scanner.nextInt();
                        rectangulos[rectanguloIndex].cambiaLargo(nuevoLargo);
                        System.out.println("Largo del rectangulo actualizado.");
                    }
                    break;
                    
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                    
                default:
                    System.out.println("Opcion no válida. Intente nuevamente.");
            }
            
        } while (opcion != 5);
    }
    
    private static int leeLongitudLado(int cantidadRectangulos, Scanner scanner) {      // scanner es una instancia de la clase Scanner;
        
        System.out.print("Ingrese el numero de rectangulo (1-" + cantidadRectangulos + "): ");  // se pide el numero del rectangulo que deseamos saber.
        
        int rectanguloIndex = scanner.nextInt() - 1;   // se lee el numero ingresado - Se resta 1 al numero ingresado para ajustar el indice, ya que los indices en un arreglo comienzan en 0.                                        

        if (rectanguloIndex < 0 || rectanguloIndex >= cantidadRectangulos) {
            System.out.println("Número de rectangulo no válido.");
            return -1;
        }

        return rectanguloIndex; // Si el numero de rectangulo ingresado por el usuario es valido, se devuelve el valor de rectanguloIndex
    }
}