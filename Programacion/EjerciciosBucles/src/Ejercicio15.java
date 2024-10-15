import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int n = scanner.nextInt();
        int digitos = 0;
        for(int i = n; i > 0; i /= 10){
          digitos++;
        }
        System.out.println("El número tiene "+digitos+" digitos");
    }
}
