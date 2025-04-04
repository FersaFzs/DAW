import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la palabra a buscar:");
        String palabra = scanner.nextLine();
        int contador = 0;
        
        try (BufferedReader reader = new BufferedReader(new FileReader("archivo1.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] palabras = linea.split("\\s+");
                for (String p : palabras) {
                    if (p.equalsIgnoreCase(palabra)) {
                        contador++;
                    }
                }
            }
            
            System.out.println("La palabra '" + palabra + "' aparece " + contador + " veces.");
            
        } catch (IOException e) {
            System.out.println("Error al buscar en el archivo: " + e.getMessage());
        }
    }
}