import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio5 {
    public static void main(String[] args) {
        int contador = 0;
        
        try (BufferedReader reader = new BufferedReader(new FileReader("datos.csv"))) {
            while (reader.readLine() != null) {
                contador++;
            }
            System.out.println("El archivo tiene " + contador + " líneas.");
        } catch (IOException e) {
            System.out.println("Error al contar líneas: " + e.getMessage());
        }
    }
}