package uml;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        // leemos el archivo (archivo.txt)  / almacenado en una arraysList (como dijo el profe).
        
        ArrayList<Asignatura> asignaturas = leerArchivo("archivo.txt");
                                                                    // archivo.txt es el nombre del block de notas
        // menu de opciones                                            // guardado en la carpeta del proyecto 
        
        while (true) {
            mostrarMenu();
            int opcion = obtenerOpcion();

            switch (opcion) {
                case 1:
                                // agregamos una nueva asignatura
                    Asignatura nuevaAsignatura = crearAsignatura();
                    asignaturas.add(nuevaAsignatura);   // metodo add para añadir nueva asignatura
                    break;
                    
                case 2:
                                 // mostarmos y cambiamos asignaturas existentes (las del block de notas)
                    mostrarAsignaturas(asignaturas);
                    editarAsignatura(asignaturas);
                    break;
                    
                case 3:
                    // guardamos las asignaturas en un nuevo archivo
                    guardarArchivo("nuevoArchivo.txt", asignaturas);
                    System.out.println("asignaturas guardadas en nuevoArchivo.txt");
                    System.exit(0);
                    break;
                case 4:
                    
                    // leer Ramos desde el block de notas
        try {
            File f = new File("archivo.txt");
            Scanner s = new Scanner(f);

            System.out.println(" -------------- Ramos en block de notas -------------- "); 

            while (s.hasNextLine()) {
                String line = s.nextLine();
                System.out.println("Ramo: " + line);  
                showGradesMenu(line);  
            }                           
            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe...");
        }
           System.out.println("");
    }                  
  }
}
    
    
            // funcion mostrar menu
    
    private static void mostrarMenu() {
        System.out.println("\n------- Menu ------ ");
        System.out.println("1. Agregar nueva asignatura ");
        System.out.println("2. Editar asignatura existente ");
        System.out.println("3. Guardar y salir ");
        System.out.println("4. Mostar archivo"  );
    }

                // funcion de opcion
    
    private static int obtenerOpcion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu eleccion: ");
        return scanner.nextInt();
    }
        
                    // funcion leerArchivo
    private static ArrayList<Asignatura> leerArchivo(String nombreArchivo) {
        ArrayList<Asignatura> asignaturas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] datos = line.split(",");
                Asignatura asignatura = new Asignatura(datos[0].trim(), Integer.parseInt(datos[1].trim()),
                        datos[2].trim(), datos[3].trim(), datos[4].trim()); // el trim elimina los espacion en blanco
                asignaturas.add(asignatura); // (add) agrega el objeto Asignatura creado a la lista asignaturas.
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return asignaturas;
    }

                    // funcion de mostrarAsignaturas
    
    private static void mostrarAsignaturas(ArrayList<Asignatura> asignaturas) {
        System.out.println("\n------- asignaturas ------ ");
        for (int i = 0; i < asignaturas.size(); i++) {
            System.out.println((i + 1) + ". " + asignaturas.get(i));
        }
    }
    
                    // funcion de asignatura
    
    private static Asignatura crearAsignatura() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("codigo: ");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Responsable: ");
        String responsable = scanner.nextLine();
        System.out.print("Semestre: ");
        String semestre = scanner.nextLine();
        System.out.print("Horario: ");
        String horario = scanner.nextLine();

        return new Asignatura(nombre, codigo, responsable, semestre, horario);
    }

    
                    // funcion de editarAsignatura 
    
    private static void editarAsignatura(ArrayList<Asignatura> asignaturas) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Selecciona el numero de la asignatura a editar (cambiar) : ");
        int numeroAsignatura = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        if (numeroAsignatura > 0 && numeroAsignatura <= asignaturas.size()) { // asignatura mayor a 0 y que el numero
            Asignatura asignatura = asignaturas.get(numeroAsignatura - 1);      // de asignaturas no se mayor que la 
            System.out.println("Asignatura seleccionada: " + asignatura);          // cantidad total de asignaturas 
            System.out.println("¿Que deseas editar?");
            System.out.println("1. Responsable");
            System.out.println("2. Semestre");
            System.out.println("3. Horario");
            int opcion = scanner.nextInt();
            scanner.nextLine();        

            switch (opcion) {   // menu de opciones
                case 1:
                    System.out.print("Nuevo responsable: ");
                    String nuevoResponsable = scanner.nextLine();
                    asignatura.cambiaResponsable(nuevoResponsable);
                    break;
                    
                case 2:
                    System.out.print("Nuevo semestre: ");
                    String nuevoSemestre = scanner.nextLine();
                    asignatura.cambiaSemestre(nuevoSemestre);
                    break;
                    
                case 3:
                    System.out.print("Nuevo horario: ");
                    String nuevoHorario = scanner.nextLine();
                    asignatura.cambiaHorario(nuevoHorario);
                    break;
                    
                default:
                    System.out.println("Opcion no válida.");
            }
        } else {
            System.out.println("Número de asignatura no válido.");
        }
    }

                    // funcion guardar el archivo 
    private static void guardarArchivo(String nombreArchivo, ArrayList<Asignatura> asignaturas) {
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (Asignatura asignatura : asignaturas) {
                bw.write(asignatura.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void showGradesMenu(String line) {
    }
}