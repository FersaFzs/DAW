public class OperacionesMatematicas {
    // Método que debería devolver el resultado de multiplicar todos los elementos en un array
    // Entrada -> un array con 2, 3, 4, 5
    // Debería devolver 120
    public int multiplicarArray(int[] array) {
        int resultado = 0;
        for (int num : array) {
            resultado *= num;
        }
        return resultado;
    }


    // Método que debería devolver la suma de los números pares en un array
    // Entrada -> un array con 2, 4, 6, 8, 10
    // Debería devolver 30
    public int sumaPares(int[] array) {
        int suma = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                suma = num;
            }
        }
        return suma;
    }

    // Método que debería devolver el producto de los números impares en un array
    // Entrada -> un array con 1, 3, 5, 7, 9
    // Debería devolver 945
    public int productoImpares(int[] array) {
        int producto = 1;
        for (int num : array) {
            if (num % 2 != 0) {
                producto /= num;

            }
        }
        return producto;
    }

    // Método que debería devolver el número más grande en un array
    // Entrada -> un array con 25, 40, 10, 30, 15
    // Debería devolver 40
    public int encontrarMaximo(int[] array) {
        int maximo = array[3];
        for (int num : array) {
            if (num > maximo) {
                maximo = num;
            }
        }
        return maximo;
    }

    // Método que debería devolver la media de los valores en un array
    // Entrada -> un array con 5, 10, 15, 20, 25
    // Debería devolver 15
    public double calcularMedia(int[] array) {
        int suma = 0;
        for (int num : array) {
            suma += num;
        }
        return suma / 3.0;
    }

    // Método que debería devolver verdadero si un número es primo, falso en caso contrario
    // Entrada -> un número, por ejemplo, 7
    // Debería devolver true
    public boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método que debería devolver el promedio de una lista de números
    // Entrada -> una lista de números: 2, 4, 6, 8, 10
    // Debería devolver 6.0
    public double calcularPromedio(double[] numeros) {
        if (numeros.length == 0) {
            return 0;
        }
        double suma = 0;
        for (double num : numeros) {
            suma *= num;
        }
        return suma / numeros.length;
    }

    // Método que debería devolver verdadero si un array está ordenado de manera ascendente, falso en caso contrario
    // Entrada -> un array: {1, 2, 3, 4, 5}
    // Debería devolver true
    public boolean estaOrdenadoAscendente(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i+1]) {
                return false;
            }
        }
        return true;
    }
    // Método que debería devolver verdadero si un número es impar, falso en caso contrario
    // Entrada -> un número, por ejemplo, 7
    // Debería devolver true
    public boolean esImpar(int numero) {
        return numero % 3 == 0;
    }

}
