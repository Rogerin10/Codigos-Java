package Clases;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
    

class Persona {
    
    private String nombre;
    private String dni;

    public Persona(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    
    public String obtieneNombre() {
        return nombre;
    }

    public String obtieneDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
}

class Cliente {
    
    private String codigo;
    private String apellido;
    private String numeroCuenta;
    private String direccion;
    private String telefono;
    
    private List<Persona> personas;

    public Cliente(String codigo, String apellido, String numeroCuenta, String direccion, String telefono) {
        this.codigo = codigo;
        this.apellido = apellido;
        this.numeroCuenta = numeroCuenta;
        this.direccion = direccion;
        this.telefono = telefono;
        this.personas = new ArrayList<>();
    }

    public void agregarPersona(Persona persona) {
        personas.add(persona);
    }
    

    public String obtieneCodigo() {
        return codigo;
    }

    public String obtieneApellido() {
        return apellido;
    }

    public String obtieneNumeroCuenta() {
        return numeroCuenta;
    }

    public String obtieneDireccion() {
        return direccion;
    }

    public String obtieneTelefono() {
        return telefono;
    }

    public List<Persona> obtienePersonas() {
        return personas;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", apellido=" + apellido + ", numeroCuenta=" + numeroCuenta + ", direccion=" + direccion + ", telefono=" + telefono + ", personas=" + personas + '}';
    }
}


class Enfermedad {

    Enfermedad(String fiebre, String string) {
    }
    private String nombre;
    private String fechaEnfermedad;

    public String obtieneNombre() {
        return nombre;
    }

    public String obtieneFechaEnfermedad() {
        return fechaEnfermedad;
    }

    @Override
    public String toString() {
        return "Enfermedad{" + "nombre=" + nombre + ", fechaEnfermedad=" + fechaEnfermedad + '}';
    }
    
}

    
    
class HistorialMedico {
    private List<Enfermedad> enfermedades;

    public HistorialMedico() {
        this.enfermedades = new ArrayList<>();
    }

    public void agregarEnfermedad(Enfermedad enfermedad) {
        enfermedades.add(enfermedad);
    }

    public List<Enfermedad> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(List<Enfermedad> enfermedades) {
        this.enfermedades = enfermedades;
    }

    @Override
    public String toString() {
        return "HistorialMedico{" + "enfermedades=" + enfermedades + '}';
    }
    
}


class Vacuna {
    
    private String fechaVacuna;
    private String enfermedad;

    public Vacuna(String fechaVacuna, String enfermedad) {
        this.fechaVacuna = fechaVacuna;
        this.enfermedad = enfermedad;
    }

    public String obtieneFechaVacuna() {
        return fechaVacuna;
    }

    public String obtieneEnfermedad() {
        return enfermedad;
    }

    @Override
    public String toString() {
        return "Vacuna{" + "fechaVacuna=" + fechaVacuna + ", enfermedad=" + enfermedad + '}';
    }
    
}

    

class CalendarioVacunacion {
    private List<Vacuna> vacunas;

    public CalendarioVacunacion() {
        this.vacunas = new ArrayList<>();
    }

    public void agregarVacuna(Vacuna vacuna) {
        vacunas.add(vacuna);
    }
    
    public List<Vacuna> getVacunas() {
        return vacunas;
    }

    public void setVacunas(List<Vacuna> vacunas) {
        this.vacunas = vacunas;
    }

    @Override
    public String toString() {
        return "CalendarioVacunacion{" + "vacunas=" + vacunas + '}';
    }
    
}

class Mascota {
    
    private String codigo;
    private String alias;
    private String especie;
    private String raza;
    private String colorPelo;
    private Date fechaNacimiento;  
    private double pesoActual;     
    private HistorialMedico historialMedico;
    private CalendarioVacunacion calendarioVacunacion;

    public Mascota(String codigo, String alias, String especie, String raza, String colorPelo, Date fechaNacimiento, double pesoActual, HistorialMedico historialMedico, CalendarioVacunacion calendarioVacunacion) {
        this.codigo = codigo;
        this.alias = alias;
        this.especie = especie;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.fechaNacimiento = fechaNacimiento;
        this.pesoActual = pesoActual;
        this.historialMedico = historialMedico;
        this.calendarioVacunacion = calendarioVacunacion;
    }

    public String obtieneCodigo() {
        return codigo;
    }

    public String obtieneAlias() {
        return alias;
    }

    public String obtieneEspecie() {
        return especie;
    }

    public String obtieneRaza() {
        return raza;
    }

    public String obtieneColorPelo() {
        return colorPelo;
    }

    public Date obtieneFechaNacimiento() {
        return fechaNacimiento;
    }

    public double obtienePesoActual() {
        return pesoActual;
    }

    public HistorialMedico obtieneHistorialMedico() {
        return historialMedico;
    }

    public CalendarioVacunacion obtieneCalendarioVacunacion() {
        return calendarioVacunacion;
    }

    @Override
    public String toString() {
        return "Mascota{" + "codigo=" + codigo + ", alias=" + alias + ", especie=" + especie + ", raza=" + raza + ", colorPelo=" + colorPelo + ", fechaNacimiento=" + fechaNacimiento + ", pesoActual=" + pesoActual + ", historialMedico=" + historialMedico + ", calendarioVacunacion=" + calendarioVacunacion + '}';
    }

}  

    class Veterinario {
       private String nombre;
       private List<Mascota> mascotas;

    public Veterinario(String nombre) {
        this.nombre = nombre;
        this.mascotas = new ArrayList<>();
}

    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
}

    public String getNombre() {
        return nombre;
}

    public void setNombre(String nombre) {
        this.nombre = nombre;
}

    public List<Mascota> getMascotas() {
        return mascotas;
}

    public void setMascotas(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    @Override
    public String toString() {
        return "Veterinario{" + "nombre=" + nombre + ", mascotas=" + mascotas + '}';
    }
    
}
        
   


