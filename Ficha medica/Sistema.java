package Clases;

import java.util.Date; // importamos la libreria fecha 

public class Sistema {
    public static void main(String[] args) {
                
        Persona persona1 = new Persona("Juan", "12345678A");
        Persona persona2 = new Persona("Maria", "98765432B");

        // creacion de clientes y agregar personas
        
        Cliente cliente1 = new Cliente("A001", "Fuentes", "777", "Calle Arauco", "+569 89781678");
        cliente1.agregarPersona(persona1);
        cliente1.agregarPersona(persona2);

        // crear historial medico
        
        HistorialMedico historialMedico1 = new HistorialMedico();
        historialMedico1.agregarEnfermedad(new Enfermedad("Fiebre", "2023-01-15"));
        historialMedico1.agregarEnfermedad(new Enfermedad("Dolor de estómago", "2023-03-20"));

        // calendario de vacunacion y vacunas 
        
        CalendarioVacunacion calendarioVacunacion1 = new CalendarioVacunacion();
        calendarioVacunacion1.agregarVacuna(new Vacuna("23-11-2023", "Vacuna1"));
        calendarioVacunacion1.agregarVacuna(new Vacuna("26-11-2023", "Vacuna2"));

        
        Mascota mascota1 = new Mascota("M001", "tomb", "Perro", "Labrador", "Negro", new Date(), 10.5, historialMedico1, calendarioVacunacion1);
        

        Veterinario veterinario1 = new Veterinario("Dr.Simmi");
        veterinario1.agregarMascota(mascota1);

                     // imprimir
                     
        System.out.println("Informacion del cliente:");
        System.out.println(cliente1);
        System.out.println("");

        System.out.println("\nInformacion de la mascota:");
        System.out.println(mascota1.toString() + "\n " + calendarioVacunacion1);
        System.out.println("");

        System.out.println("\nInformacion del veterinario:");
        System.out.println(veterinario1.toString() + "\n " +  historialMedico1);
        System.out.println("");
    }
}
