import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nuevo texto para sobrescribir el archivo:");
        String nuevoTexto = scanner.nextLine();
        
        try (FileWriter writer = new FileWriter("archivo1.txt")) {
            writer.write(nuevoTexto);
            System.out.println("Archivo sobrescrito exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al sobrescribir el archivo: " + e.getMessage());
        }
    }
}