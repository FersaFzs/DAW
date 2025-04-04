import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la línea que desea agregar:");
        String nuevaLinea = scanner.nextLine();
        
        try (PrintWriter writer = new PrintWriter(new FileWriter("archivo1.txt", true))) {
            writer.println(nuevaLinea);
            System.out.println("Línea agregada exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al agregar al archivo: " + e.getMessage());
        }
    }
}