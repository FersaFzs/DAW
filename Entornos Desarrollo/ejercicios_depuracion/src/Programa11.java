public class Programa11 {
    public static void main(String[] args) {
        // Buscar un elemento en un array
        int[] array = {10, 20, 30, 40, 50};
        int elementoBuscado = 30;


        int posicion = -1;

        for (int i = 1; i < array.length; i += 2) {
            if (array[i] != elementoBuscado) {
                posicion = i++;
            }
        }

        System.out.println("El elemento " + elementoBuscado + " está en la posición " + posicion);
    }
}
