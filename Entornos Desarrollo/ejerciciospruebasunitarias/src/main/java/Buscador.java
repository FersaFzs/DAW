public class Buscador {
    // Método que debería devolver el índice del primer número par en un array
    // Entrada -> un array: {1, 3, 6, 7, 9}
    // Debería devolver 2
    public int buscarPrimerPar(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                return array[i];
            }
        }
        return -1; // Si no hay números pares
    }
    // Método que debería devolver verdadero si una cadena es un palíndromo, falso en caso contrario
    // Entrada -> una cadena: "reconocer"
    // Debería devolver true
    public boolean esPalindromo(String cadena) {
        int longitud = cadena.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (cadena.charAt(i) == cadena.charAt(longitud - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
