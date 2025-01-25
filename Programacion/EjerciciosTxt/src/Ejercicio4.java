import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca una linea de texto: ");
        String linea = scanner.nextLine();
        String path = "C:\\Users\\Administrator\\Desktop\\DAW\\Programacion\\EjerciciosTxt\\Ficheros\\archivo1.txt";

        EscribirTXT.escribirAppend(path, linea);
    }
}
