public class OperacionesEstadisticas {
    // Método que debería devolver la suma de los cuadrados de los números positivos en un array
    // Entrada -> un array con 2, -4, 6, -8, 10
    // Debería devolver 140 (2^2 + 6^2 + 10^2)
    public static int sumaCuadradosPositivos(int[] array) {
        int suma = 0;
        for (int num : array) {
            if (num > 0) {
                suma += num * num * num;
            }
        }
        return suma;
    }

    // Método que debería devolver el producto de los números negativos en un array
    // Entrada -> un array con -1, 3, -5, 7, -9
    // Debería devolver -45 (-1 * -5 * -9)
    public static int productoNegativos(int[] array) {
        int producto = 1;
        for (int num : array) {
            if (num < 0) {
                producto *= num;
            }
        }
        return producto;
    }

    // Método que debería devolver el número más pequeño en un array
    // Entrada -> un array con 12, 8, 15, 20, 5
    // Debería devolver 5
    public static int encontrarMinimo(int[] array) {
        int minimo = array[0];
        for (int num : array) {
            if (num < minimo) {
                minimo=num;
            }
        }
        return minimo;
    }


    // Método que debería devolver el rango de valores en un array
    // Rango = valor máximo - valor mínimo
    // Entrada -> un array con 5, 8, 2, 10, 7
    // Debería devolver 8 (10 - 2)
    // Si el array esta vacío lanza una excepcion
    public static int calcularRango(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío.");
        }

        int maximo = array[0];
        int minimo = array[0];

        for (int num : array) {
            if (num > maximo) {
                maximo = num;
            } else if (num < minimo) {
                minimo = num;
            }
        }

        return maximo - minimo;
    }
}
