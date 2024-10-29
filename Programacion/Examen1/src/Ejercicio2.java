import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Entrada
        System.out.println("Ingrese un número entero: ");
        int n = scanner.nextInt();

        int n2 = 0; //n2 es el valor n al revés para comparar
        for(int i = n; i > 0; i /= 10) {
            n2 *= 10;
            n2 += i % 10;
        }

        //Salida
        if (n == n2){
            System.out.println("El número "+n+" es un palíndromo.");
        } else{
            System.out.println("El número "+n+" no es un palíndromo.");
        }
    }
}
