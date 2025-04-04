import java.io.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("archivo1.txt"));
             FileWriter writer = new FileWriter("archivo2.txt")) {
            
            String linea;
            while ((linea = reader.readLine()) != null) {
                writer.write(linea + "\n");
            }
            System.out.println("Contenido copiado exitosamente a archivo2.txt");
            
        } catch (IOException e) {
            System.out.println("Error al copiar el archivo: " + e.getMessage());
        }
    }
}