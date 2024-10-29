import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Entrada
        System.out.println("Ingrese un número entero positivo: ");
        int n = scanner.nextInt();

        int sumatoria = 0;
        for(int i = 2; i <= n; i+=2){
            System.out.println(i);
            sumatoria += i;
        }

        //Salida
        System.out.println("La suma de todos los pares hasta "+n+" es: "+sumatoria);
    }
}
