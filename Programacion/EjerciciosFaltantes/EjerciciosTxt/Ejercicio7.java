import java.io.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        try (BufferedReader reader1 = new BufferedReader(new FileReader("archivo1.txt"));
             BufferedReader reader2 = new BufferedReader(new FileReader("archivo2.txt"));
             FileWriter writer = new FileWriter("archivo3.txt")) {
            
            String linea;
            while ((linea = reader1.readLine()) != null) {
                writer.write(linea + "\n");
            }
            
            while ((linea = reader2.readLine()) != null) {
                writer.write(linea + "\n");
            }
            
            System.out.println("Archivos concatenados exitosamente en archivo3.txt");
            
        } catch (IOException e) {
            System.out.println("Error al concatenar archivos: " + e.getMessage());
        }
    }
}