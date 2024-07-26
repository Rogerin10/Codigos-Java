package laboratorio2_.parte2;

import java.util.ArrayList;
import java.util.List;

public class Trabajo {
    
    private String nombre;
    private int nroHrs;
    private int sueldo;

    private  List<Persona> Persona = new ArrayList<>(); // Relacion

    public Trabajo(String nombre, int nroHrs, int sueldo) {
        this.nombre = nombre;
        this.nroHrs = nroHrs;
        this.sueldo = sueldo;
    }

    public String getNombre() { //Obtiene
        return nombre;
    }

    public int getNroHrs() {
        return nroHrs;
    }

    public int getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        return "Trabajo{" + "nombre=" + nombre + ", nroHrs=" + nroHrs + ", sueldo=" + sueldo + ", Persona=" + Persona + '}';
    } 
}
