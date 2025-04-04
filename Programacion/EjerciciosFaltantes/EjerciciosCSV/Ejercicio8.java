import java.io.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("datos.csv"));
             FileWriter writer = new FileWriter("adultos.csv")) {
            
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                int edad = Integer.parseInt(datos[1].trim());
                if (edad >= 18) {
                    writer.write(linea + "\n");
                }
            }
            System.out.println("Archivo de adultos creado: adultos.csv");
            
        } catch (IOException e) {
            System.out.println("Error al procesar archivos: " + e.getMessage());
        }
    }
}