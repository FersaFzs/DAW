import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int n = scanner.nextInt();
        int sumaDigitos = 0;
       for(int i = n; i > 0; i/=10){
           sumaDigitos += n%10;
           n/=10;
       }
        System.out.println("La suma de los dígitos es: "+sumaDigitos);
    }
}
