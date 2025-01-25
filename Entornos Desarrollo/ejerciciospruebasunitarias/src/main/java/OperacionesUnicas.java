public class OperacionesUnicas {
    // Método que debería devolver el producto de los elementos en posiciones pares de un array
    // Entrada -> un array: {2, 5, 3, 8, 4}
    // Debería devolver 24 (2 * 3 * 4)
    public int productoElementosPares(int[] array) {
        int producto = 1;
        for (int i = 0; i < array.length; i += 2) {
            producto *= array[i];
        }
        return producto;
    }

    // Método que debería devolver un nuevo array con los elementos invertidos del original
    // Entrada -> un array: {1, 2, 3, 4, 5}
    // Debería devolver {5, 4, 3, 2, 1}
    public int[] invertirArray(int[] array) {
        int[] invertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            invertido[i] = array[array.length - i - 1];
        }
        return invertido;
    }

    // Método que debería devolver la cantidad de veces que cambia el signo en un array
    // Entrada -> un array: {1, -2, 3, -4, 5}
    // Debería devolver 4
    public int contarCambiosSigno(int[] array) {
        int cambios = 0;
        for (int i = 1; i < array.length; i++) {
            if ((array[i - 1] <= 0 && array[i] < 0) || (array[i - 1] < 0 && array[i] >= 0)) {
                cambios++;
            }
        }
        return cambios;
    }

    // Método que debería devolver verdadero si un número es primo, falso en caso contrario
    // Entrada -> un número, por ejemplo, 7
    // Debería devolver true
    public boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
