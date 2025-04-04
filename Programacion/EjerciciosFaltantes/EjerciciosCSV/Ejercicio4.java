import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nuevas líneas en formato nombre,edad,ciudad (escriba 'fin' para terminar):");
        
        try (FileWriter writer = new FileWriter("datos.csv")) {
            String linea;
            while (!(linea = scanner.nextLine()).equalsIgnoreCase("fin")) {
                writer.write(linea + "\n");
            }
            System.out.println("Archivo sobrescrito exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al sobrescribir el archivo: " + e.getMessage());
        }
    }
}