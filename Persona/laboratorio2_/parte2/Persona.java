package laboratorio2_.parte2;

import java.util.ArrayList;
import java.util.List;

public class Persona {
                            // atributos
    private String nombre;
    private String rut;
    private String direccion;
    private int edad;
    private int telefono;
    private Trabajo trabajo;
    
    private  List<Trabajo> Trabajo = new ArrayList<>(); // Relacion


    public Persona(String nombre, String rut, String direccion, int edad, int telefono, Trabajo trabajo) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.edad = edad;
        this.telefono = telefono;
        this.trabajo = trabajo;
    }
                
                // metodos
    public String getNombre() { //obtiene
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getEdad() {
        return edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public Trabajo getTrabajo() {
        return trabajo;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", rut=" + rut + ", direccion=" + direccion + ", edad=" + edad + ", telefono=" + telefono + ", trabajo=" + trabajo + ", Trabajo=" + Trabajo + '}';
    }      
}
