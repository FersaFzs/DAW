public class ejercicio3 {
    public static void main(String[] args) {
        int[] numeros = {12, 45, 78, 23, 56};
        int mayor = numeros[0];
        
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        
        System.out.println("El número mayor es: " + mayor);
    }
}