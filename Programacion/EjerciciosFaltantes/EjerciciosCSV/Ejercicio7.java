import java.io.*;

public class Ejercicio7 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("datos.csv"));
             FileWriter writer = new FileWriter("copia_datos.csv")) {
            
            String linea;
            while ((linea = reader.readLine()) != null) {
                writer.write(linea + "\n");
            }
            System.out.println("Archivo copiado a copia_datos.csv");
            
        } catch (IOException e) {
            System.out.println("Error al copiar el archivo: " + e.getMessage());
        }
    }
}