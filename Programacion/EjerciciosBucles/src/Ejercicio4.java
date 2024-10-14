import java.util.Scanner;
import java.util.Random;
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Introduzca el tamaño de la cadena: ");
        int n = scanner.nextInt();
        String cadena = "";


        for(int i = 0; i < n; i++){
            char caracterAleatorio = (char)(random.nextInt(26) + 'a');
            cadena += caracterAleatorio;
        }
        System.out.println(cadena);
    }
}
