package Clases;

public class Sistema {
    public static void main(String []args){
        
        
        Region r1 = new Region("bio-bio", 8);
        
        Direccion d1 = new Direccion(10, "calle 123", "concepcion", r1);
        Direccion d2 = new Direccion(4, "calle 2", "villa el manzano", "concepcion", r1);
        
        
        System.out.println(d1);
        System.out.println(d2);
        System.out.println("La direccion es: " + d1.obtieneDireccion("calle 1"));
        
        
        
    
    
    }
    
}
