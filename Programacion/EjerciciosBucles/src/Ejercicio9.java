import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un número n: ");
        int n = scanner.nextInt();
        int sumaPares = 0;
        for(int i = 1; i <= n; i++){
            if(i%2==0){
                System.out.println(sumaPares+" + "+i);
                sumaPares += i;
            }
        }
        System.out.println("La suma de los pares de ese número da: "+ sumaPares);
    }
}
