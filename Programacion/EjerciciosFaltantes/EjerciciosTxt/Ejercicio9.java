import java.io.*;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la palabra para filtrar líneas:");
        String palabra = scanner.nextLine();
        
        try (BufferedReader reader = new BufferedReader(new FileReader("archivo1.txt"));
             FileWriter writer = new FileWriter("filtrado.txt")) {
            
            String linea;
            while ((linea = reader.readLine()) != null) {
                if (linea.toLowerCase().contains(palabra.toLowerCase())) {
                    writer.write(linea + "\n");
                }
            }
            
            System.out.println("Líneas filtradas guardadas en filtrado.txt");
            
        } catch (IOException e) {
            System.out.println("Error al filtrar el archivo: " + e.getMessage());
        }
    }
}