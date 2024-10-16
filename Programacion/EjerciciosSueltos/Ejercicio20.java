import java.util.Scanner;
import java.util.Random;
public class Ejercicio20 {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int solucion = random.nextInt(100);
        int n;
        do{
            System.out.println("Introduzca un número: ");
            n = scanner.nextInt();
            if (n < solucion){
                System.out.println("Más");
            } else if (n > solucion){
                System.out.println("Menos");
            } else {
                System.out.println("Exacto, el número es: "+n);
            }
        } while(n != solucion);
    }
}
