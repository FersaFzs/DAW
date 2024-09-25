import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce 4 enteros: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();

        int multiplicacion = n1 * n2 * n3 * n4;
        int suma = n1 + n2 + n3 + n4;
        double media = suma / 4.0;

        System.out.println("El producto de los numeros introducidos es: " + multiplicacion + " la suma es: " + suma + " la media es: " + media);
    }
}
