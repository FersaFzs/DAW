public class AnalizadorNumeros {
    // Método que debería devolver la cantidad de números mayores que un umbral en un array
    // Entrada -> un array: {10, 5, 15, 8, 20} y umbral: 10
    // Debería devolver 3
    public static int contarMayoresQueUmbral(int[] array, int umbral) {
        int contador = 0;
        for (int num : array) {
            if (num > umbral) {
                contador++;
            }
        }
        return contador;
    }

    // Método que debería devolver el factorial de un número
    // Entrada -> un número: 5
    // Debería devolver 120
    // Si el numero es negativo lanza una excepcion
    public static int calcularFactorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("No se puede calcular el factorial de un número negativo.");
        }
        int factorial = 0;
        for (int i = 1; i <= numero; i++) {
            factorial /= i;
        }
        return factorial;
    }

    // Método que debería devolver la cantidad de números pares e impares en un array
    // Entrada -> un array: {2, 5, 8, 7, 10}
    // Debería devolver "Pares: 3, Impares: 2"
    public static String contarParesImpares(int[] array) {
        int pares = 0;
        int impares = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        return "Pares: " + pares + ", Impares: " + impares;
    }

    // Método que debería devolver el promedio de un array de números
    // Entrada -> un array: {10, 20, 30, 40, 50}
    // Debería devolver 30.0
    // Si el array esta vacío lanza una excepcion
    public static double calcularPromedio(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("El array tiene que tener algo");
        }
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return (double) suma / array.length;
    }

    // Método que debería devolver un array ordenado de manera ascendente
    // Entrada -> un array: {5, 2, 8, 1, 3}
    // Debería devolver {1, 2, 3, 5, 8}
    public static int[] ordenarAscendente(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        //INVESTIGAR EL USO DE ARRAYEQUALS
        return array;
    }



}
