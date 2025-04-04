import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio10 {
    public static void main(String[] args) {
        Set<String> lineasUnicas = new HashSet<>();
        
        try (BufferedReader reader1 = new BufferedReader(new FileReader("datos1.csv"));
             BufferedReader reader2 = new BufferedReader(new FileReader("datos2.csv"))) {
            
            String linea;
            while ((linea = reader1.readLine()) != null) {
                lineasUnicas.add(linea);
            }
            
            while ((linea = reader2.readLine()) != null) {
                lineasUnicas.add(linea);
            }
            
            try (FileWriter writer = new FileWriter("combinado.csv")) {
                for (String l : lineasUnicas) {
                    writer.write(l + "\n");
                }
                System.out.println("Archivos combinados en combinado.csv (sin duplicados)");
            }
            
        } catch (IOException e) {
            System.out.println("Error al combinar archivos: " + e.getMessage());
        }
    }
}