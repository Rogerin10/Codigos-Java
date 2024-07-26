package laboratorio2_.parte2;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
    public static void main(String[] args) {
        
        
        Trabajo t1 = new Trabajo("vendedor", 5, 10000);
        Trabajo t2 = new Trabajo("Oficinista", 8, 200000);
        
         
        List<Trabajo> listaTrabajo = new ArrayList<>();
        listaTrabajo.add(t1);
        listaTrabajo.add(t2);
        
        Persona p1 = new Persona("juan", "209318113", "calle 2", 20, 33333333, t1);
        Persona p2 = new Persona("pedro", "208317113", "arauco 123", 28, 22222222, t2);
        Persona p3 = new Persona("pablo", "229831711", "arauco 142", 28, 11111111, t2);

        List<Persona> listaPersona = new ArrayList<>();
        listaPersona.add(p1);
        listaPersona.add(p2);
        listaPersona.add(p3);
         
     System.out.println("Bienvenido al Sistema ");
        System.out.println("");

        System.out.println("lista de Personas:");
        for (Persona persona : listaPersona) {
            System.out.println(persona);
        }

        System.out.println("");
        
        System.out.println("lista de Trabajos:");
        for (Trabajo trabajo : listaTrabajo) {
            System.out.println(trabajo );
        }
    }

}

   
    

