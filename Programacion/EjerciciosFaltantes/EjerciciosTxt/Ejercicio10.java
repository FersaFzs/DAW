import java.io.File;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        File archivo = new File("archivo2.txt");
        if (!archivo.exists()) {
            System.out.println("El archivo archivo2.txt no existe.");
            return;
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Está seguro que desea eliminar archivo2.txt? (s/n)");
        String respuesta = scanner.nextLine();
        
        if (respuesta.equalsIgnoreCase("s")) {
            if (archivo.delete()) {
                System.out.println("Archivo eliminado exitosamente.");
            } else {
                System.out.println("No se pudo eliminar el archivo.");
            }
        } else {
            System.out.println("Operación cancelada.");
        }
    }
}