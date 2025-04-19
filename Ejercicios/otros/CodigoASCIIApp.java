import javax.swing.JOptionPane; // Se importa la clase JOptionPane del paquete javax.swing 
                                // para permitir la entrada y salida de datos mediante cuadros de diálogo.

public class CodigoASCIIApp {

    public static void main(String[] args) {

        String opcion = JOptionPane.showInputDialog(
                "Elige una opcion:\n1. Ingresar texto para obtener codigos ASCII\n2. Ingresar codigo ASCII para obtener el caracter");

        switch (opcion) {
            case "1":
                // opcion para ingresae el texto y obtener codigos ASCII
                String texto = JOptionPane.showInputDialog("Introduce un nombre: ");

                System.out.println("Texto ingresado: " + texto);
                System.out.println("Codigos ASCII: ");

                for (int i = 0; i < texto.length(); i++) {
                    char caracter = texto.charAt(i);
                    int codigo = (int) caracter;
                    System.out.println(caracter + ": " + codigo);

                }
                break;

            case "2":
                // opcion para ingresar cadena de codigos ASCII y obtener el texto
                String codigoASCIItr = JOptionPane
                        .showInputDialog("Introduce una cadena de codigos ASCII separados por espacios:");
                String[] codigosArray = codigoASCIItr.split(" ");

                System.out.println("Texto correspondiente a los codigos ASCII: ");

                for (String codigoStr : codigosArray) {
                    int codigo = Integer.parseInt(codigoStr);
                    char caracter = (char) codigo;
                    System.out.println(caracter);
                }
                System.out.println();
                break;

            default:
                System.out.println("Opcion no valida.");
                break;
        }

    }

}
