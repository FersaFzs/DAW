import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la palabra a buscar: ");
        String palabra = scanner.nextLine();
        String path = "C:\\Users\\Administrator\\Desktop\\DAW\\Programacion\\EjerciciosTxt\\Ficheros\\archivo3.txt";
        LeerTXT.buscaPalabra(path, palabra);
    }
}
