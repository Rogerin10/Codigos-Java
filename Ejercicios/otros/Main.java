public class Main {
    public static void main(String[] args) {
        String cadenasParaProbar[] = { "Mi hijo degustó en el festival de bayas una extraña pizza de kiwi con queso",
                "Hola",
                "El veloz murciélago hindú comía feliz cardillo y kiwi. La cigüeña tocaba el saxofón detrás del palenque de paja",
                "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ", // Debería ser true
                "ABCDEFGHIJKLMNÑOPQRSTUVWXY", // Sin Z
        };

        for (String cadena : cadenasParaProbar) {
            System.out.printf("La cadena '%s' es pangrama? %b\n", cadena, esPangrama(cadena));
        }
    }

    public static boolean esPangrama(String cadena) {
        cadena = cadena.toUpperCase(); // Convertir a mayúscula para simplificar comparaciones
        String letrasDelAlfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        for (int x = 0; x < letrasDelAlfabeto.length(); x++) {
            if (!cadena.contains(Character.toString(letrasDelAlfabeto.charAt(x)))) {
                return false;
            }
        }
        return true;
    }
}