import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los datos en formato nombre,edad,ciudad:");
        String linea = scanner.nextLine();
        
        try (FileWriter writer = new FileWriter("datos.csv")) {
            writer.write(linea + "\n");
            System.out.println("Datos guardados en datos.csv");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}