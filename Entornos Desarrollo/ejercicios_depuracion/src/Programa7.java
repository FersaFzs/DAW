import java.util.Arrays;

public class Programa7 {
    public static void main(String[] args) {
        // Ordenar un array de números de menor a mayor
        int[] numeros = {5, 2, 8, 1, 7};

        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[i]) {
                        int aux = numeros[i];
                        numeros[i] = numeros[j];
                        numeros[j] = aux;
                }
            }
        }

        System.out.println("Números ordenados de menor a mayor: " + Arrays.toString(numeros));
    }
}
