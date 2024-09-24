import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIntroduce otro número de 5 cifras: ");
        int numx = scanner.nextInt();
        int x1 = numx % 10;
        numx /= 10;
        int x2 = numx % 10;
        numx /= 10;
        int x3 = numx % 10;
        numx /= 10;
        int x4 = numx % 10;
        numx /= 10;
        int x5 = numx;
        System.out.println(x5+" "+x4+" "+x3+" "+x2+" "+x1);
    }
}
