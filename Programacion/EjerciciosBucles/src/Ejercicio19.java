import java.util.Scanner;
import java.util.Random;
public class Ejercicio19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        double n = 0;
        for(int i = 0; i < 10; i++){
            int nrandom = random.nextInt(100)+1;
            n += nrandom;
            System.out.println(nrandom);
        }
        n/= 10;
        System.out.println("La media de los  numeros es: "+n);
    }
}
