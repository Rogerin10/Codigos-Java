package Clases;
 
public class Rectangulo {
    private int ancho;
    private int largo;

    public Rectangulo(int ancho, int largo) {
        this.ancho = ancho;
        this.largo = largo;
    }
 
    public int obtienePerimetro(){
        return 2 * (ancho + largo);
        
    }                               // calculan el perimetro y el area del rectangulo
    
    public int calcularArea(){
        return ancho * largo;
        
    }
    
    public void cambiaAncho(int nuevoAncho) {
        this.ancho = nuevoAncho;
    }                                           // cambiaAncho y cambiaLargo permiten cambiar el ancho y el largo del rectangulo.

    public void cambiaLargo(int nuevoLargo) {
        this.largo = nuevoLargo;
    }  
}
