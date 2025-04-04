import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try (PrintWriter writer = new PrintWriter(new FileWriter("datos.csv", true))) {
            System.out.println("Ingrese líneas en formato nombre,edad,ciudad (escriba 'fin' para terminar):");
            
            String linea;
            while (!(linea = scanner.nextLine()).equalsIgnoreCase("fin")) {
                writer.println(linea);
            }
            
            System.out.println("Líneas agregadas exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al agregar al archivo: " + e.getMessage());
        }
    }
}