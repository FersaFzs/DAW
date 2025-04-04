import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el texto que desea guardar:");
        String texto = scanner.nextLine();
        
        try (FileWriter writer = new FileWriter("archivo1.txt")) {
            writer.write(texto);
            System.out.println("Archivo creado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }
}