public class Intercambio {
    public static void intercambiar(int[] arreglo, int indice1, int indice2) {
        int temp = arreglo[indice1];
        arreglo[indice1] = arreglo[indice2];
        arreglo[indice2] = temp;
    }

    public static void main(String[] args) {
        int[] arreglo = { 1, 2, 3, 4, 5 };
        System.out.println("Arreglo original: ");
        for (int i : arreglo) {
            System.out.print(i + " ");
        }

        // Intercambiar elementos en las posiciones 1 y 3
        intercambiar(arreglo, 1, 3);

        System.out.println("\nArreglo después del intercambio: ");
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
    }
}
