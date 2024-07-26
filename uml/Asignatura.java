package uml;
                // UML de asignatura
public class Asignatura {
    
    // Atributos
    
    private String Nombre;
    private int Codigo;
    private String Responsable;
    private String Semestre;
    private String horario;
    
    
    // Constructor

    public Asignatura(String Nombre, int Codigo, String Responsable, String Semestre, String horario) {
        this.Nombre = Nombre;
        this.Codigo = Codigo;
        this.Responsable = Responsable;
        this.Semestre = Semestre;
        this.horario = horario;
    }

        // Metodos
    
    public String obtieneNombre() {
        return Nombre;
    }

    public int obtieneCodigo() {
        return Codigo;
    }

    public String obtieneResponsable() {
        return Responsable;
    }

    public String obtieneSemestre() {
        return Semestre;
    }

    public String obtieneHorario() {
        return horario;
    }

    public void cambiaResponsable(String Responsable) {
        this.Responsable = Responsable;
    }

    public void cambiaSemestre(String Semestre) {
        this.Semestre = Semestre;
    }

    public void cambiaHorario(String horario) {
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "Nombre=" + Nombre + ", Codigo=" + Codigo + ", Responsable=" + Responsable + ", Semestre=" + Semestre + ", horario=" + horario + '}';
    }    

}
