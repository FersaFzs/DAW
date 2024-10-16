import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int n = scanner.nextInt();
        int sumaDivisores = 0;

        for(int i = 1; i <= n / 2; i++){
            if(n%i == 0){
                sumaDivisores += i;
            }
        }
        if(sumaDivisores == n){
            System.out.println("El numero "+ n+ " es un numero perfecto");
        } else {
            System.out.println("El numero "+n+" no es un numero perfecto");
        }
    }
}
