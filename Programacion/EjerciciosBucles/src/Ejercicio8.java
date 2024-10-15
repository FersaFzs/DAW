import java.util.Scanner;
import java.util.Random;
public class Ejercicio8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = 0;
        int sol = random.nextInt(101)+1;
        while (n != sol) {
            System.out.println("Introduzca un número del 1 al 100: ");
            n = scanner.nextInt();
            if (n > 100 || n < 1) {
                System.out.println("Ese numero no está entre el 1 y el 100");
                return;
            } else{
                System.out.println("Incorrecto!");
            }
        }
        System.out.println("Correcto el número secreto es: "+n);
    }
}
