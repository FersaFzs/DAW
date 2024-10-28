import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una cadena: ");
        String cadena = "";
        cadena = scanner.nextLine();
        int contador = 0;

        for(int i = 0; i < cadena.length(); i++){
            contador++;
        }
        System.out.println("La cadena tiene: "+contador+" caracteres.");
    }
}
