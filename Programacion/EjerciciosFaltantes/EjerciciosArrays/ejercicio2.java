public class ejercicio2 {
    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20, 25};
        int suma = 0;
        
        for (int num : numeros) {
            suma += num;
        }
        
        System.out.println("La suma es: " + suma);
    }
}