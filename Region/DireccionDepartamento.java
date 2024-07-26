package Clases;
import java.util.List;
import java.util.ArrayList;
public class DireccionDepartamento extends Direccion {
    
    // Atributos 
    
    private int numeroDepartamento;
    private Region region;
    private Direccion direccion;
    
    private  List<Direccion> Direcciones = new ArrayList<>(); // Relacion

    
    
    
    // Constructores 

    public DireccionDepartamento(int numero, String calle, String ciudad, Region region) {
        super(numero, calle, ciudad, region);
    }

    public DireccionDepartamento(int numDepto, String calle, String pobOVilla, String ciudad, Region region) {
        super(numDepto, calle, pobOVilla, ciudad, region);
    }

            // ToString()
    @Override
    public String toString() {
        return "DireccionDepartamento{" + "numeroDepartamento=" + numeroDepartamento + ", region=" + region + ", direccion=" + direccion + '}';
    }
}
