public class ejercicio7 {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        int suma = 0;
        
        for (int num : numeros) {
            suma += num;
        }
        
        double promedio = (double) suma / numeros.length;
        System.out.println("El promedio es: " + promedio);
    }
}