public class ejercicio6 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int[] invertido = new int[numeros.length];
        
        for (int i = 0; i < numeros.length; i++) {
            invertido[i] = numeros[numeros.length - 1 - i];
        }
        
        System.out.println("Array invertido:");
        for (int num : invertido) {
            System.out.print(num + " ");
        }
    }
}