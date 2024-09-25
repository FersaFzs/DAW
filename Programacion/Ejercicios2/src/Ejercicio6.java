import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Ejercicio 6
        System.out.print("Introduce un numero: ");
        int n = scanner.nextInt();

        int f = ((n*n*n*n*n) + (7*(n*n*n*n)) - (4*(n*n*n)) + (2*(n*n)) - n + 10);
        System.out.println("La funcion da como resultado: " + f);
    }
}
