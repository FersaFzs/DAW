public class ejercicio12 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int contadorPares = 0;
        int contadorImpares = 0;
        
        // Primero contamos cuántos pares e impares hay
        for (int num : numeros) {
            if (num % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }
        
        int[] pares = new int[contadorPares];
        int[] impares = new int[contadorImpares];
        
        int indexPares = 0;
        int indexImpares = 0;
        
        // Llenamos los arrays
        for (int num : numeros) {
            if (num % 2 == 0) {
                pares[indexPares++] = num;
            } else {
                impares[indexImpares++] = num;
            }
        }
        
        System.out.println("Números pares:");
        for (int num : pares) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nNúmeros impares:");
        for (int num : impares) {
            System.out.print(num + " ");
        }
    }
}