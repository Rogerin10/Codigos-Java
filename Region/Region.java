package Clases;


public class Region {
    
    private String nombre;
    private int numero;

    public Region(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }


    public String obtieneNombre() {
        return nombre;
    }
}
