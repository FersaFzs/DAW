import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio6 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("datos.csv"))) {
            String linea;
            System.out.println("Datos separados:");
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                System.out.println("Nombre: " + datos[0] + ", Edad: " + datos[1] + ", Ciudad: " + datos[2]);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}