package Clases;

public class Direccion {
    
    // Atributos 
    
    private int numero;
    private String calle;
    private String villaOPoblacion;
    private String ciudad;
    
    // Relacion
    private Region region;
    
    // Constructor

    public Direccion(int numero, String calle, String ciudad, Region region) {
        this.numero = numero;
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
    }

    public Direccion(int numero, String calle, String pobOVilla, String ciudad, Region region) {
        this.numero = numero;
        this.calle = calle;
        this.villaOPoblacion = pobOVilla;
        this.ciudad = ciudad;
        this.region = region;
    }

       public String obtieneDireccion(String Direccion) {   
        return Direccion;
    }
 

    @Override
    public String toString() {
        return "Direccion{" + "numero=" + numero + ", calle=" + calle + ", villaOPoblacion=" + villaOPoblacion + ", ciudad=" + ciudad + ", region=" + region + '}';
    }
    

  
}
    