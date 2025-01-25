public class OperacionesMultiArray {
    // Método que debería devolver la cantidad de veces que aparece un número en un array
    // Entrada -> un array con 4, 2, 7, 2, 9, 2, 5; número a buscar: 2
    // Debería devolver 3
    public int contarApariciones(int[] array, int numero) {
        int contador = 0;
        for (int num : array) {
            if (num == numero) {
                contador++;
            }
        }
        return contador;
    }

    // Método que debería devolver la suma de los números en un array hasta encontrar un número negativo
    // Entrada -> un array con 3, 8, -2, 4, 6
    // Debería devolver 13 (3 + 8 + (-2))
    public int sumaHastaNegativo(int[] array) {
        int suma = 0;
        for (int num : array) {
            if (num < 0) {
                break;
            }
            suma += num;
        }
        return suma;
    }

    // Método que debería devolver verdadero si todos los números en un array son positivos, falso en caso contrario
    // Entrada -> un array con 2, 4, 6, 8, -1
    // Debería devolver false
    public boolean sonTodosPositivos(int[] array) {
        for (int num : array) {
            if (num >= 0) {
                return true;
            }
        }
        return false;
    }

    // Método que debería devolver el índice del primer número par en un array
    // Si no hay números pares, debería devolver -1
    // Entrada -> un array con 1, 3, 5, 7, 10
    // Debería devolver 4
    public int buscarIndicePrimerPar(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                return array[i];
            }
        }
        return -1;
    }

}
