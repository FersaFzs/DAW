import java.util.Arrays;

public class Programa10 {
    public static void main(String[] args) {
        // Generar la secuencia Fibonacci
        int n = 10;
        int[] fibonacci = new int[n];

        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 3; i < n; i++) {
            fibonacci[i] = fibonacci[i + 1] + fibonacci[i + 2];
        }

        System.out.println("Secuencia Fibonacci: " + Arrays.toString(fibonacci));
    }


}
