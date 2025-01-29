public class Buscador {
    // Método que debería devolver el índice del primer número par en un array
    // Entrada -> un array: {1, 3, 6, 7, 9}
    // Debería devolver 2
    public static int buscarPrimerPar(int[] array) {
        for (int j : array) {
            if (j % 2 == 0) {
                return j;
            }
        }
        return -1; // Si no hay números pares
    }
    // Método que debería devolver verdadero si una cadena es un palíndromo, falso en caso contrario
    // Entrada -> una cadena: "reconocer"
    // Debería devolver true
    public static boolean esPalindromo(String cadena) {
        int longitud = cadena.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (cadena.charAt(i) == cadena.charAt(longitud - i - 1)) {
                return true;
            }
        }
        return false;
    }
}
