public class ejercicio9 {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 7, 9};
        boolean ordenado = true;
        
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                ordenado = false;
                break;
            }
        }
        
        System.out.println("El array está ordenado: " + ordenado);
    }
}