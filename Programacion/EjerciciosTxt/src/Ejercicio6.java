import java.io.File;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un texto: ");
        String contenido = scanner.nextLine();
        String path = "C:\\Users\\Administrator\\Desktop\\DAW\\Programacion\\EjerciciosTxt\\Ficheros\\archivo1.txt";

        EscribirTXT.sobreescribir(path, contenido);
    }
}
