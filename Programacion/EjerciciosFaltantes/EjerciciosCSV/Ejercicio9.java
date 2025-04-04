import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio9 {
    public static void main(String[] args) {
        ArrayList<String> lineas = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader("datos.csv"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                lineas.add(linea);
            }
            
            Collections.sort(lineas);
            
            try (FileWriter writer = new FileWriter("ordenado.csv")) {
                for (String l : lineas) {
                    writer.write(l + "\n");
                }
                System.out.println("Archivo ordenado guardado como ordenado.csv");
            }
            
        } catch (IOException e) {
            System.out.println("Error al ordenar el archivo: " + e.getMessage());
        }
    }
}