import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un numero N");
        int n = scanner.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println(i);
        }
    }
}
