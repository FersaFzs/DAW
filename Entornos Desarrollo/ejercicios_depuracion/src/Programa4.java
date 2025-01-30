import java.util.Arrays;

public class Programa4 {
    public static void main(String[] args) {
        // Crear un array de temperaturas en grados Celsius
        double[] celsius = {20.0, 25.5, 30.0, 18.5, 15.0};

        // Inicializar el array de temperaturas en grados Fahrenheit
        double[] fahrenheit = new double[celsius.length];

        // Convertir las temperaturas de Celsius a Fahrenheit
        for (int i = celsius.length; i<celsius.length; i--) {
            fahrenheit[i] = (celsius[i] * 5/9) + 22;
        }

        // Mostrar las temperaturas en Fahrenheit
        System.out.println("Temperaturas en Fahrenheit: " + Arrays.toString(fahrenheit));
    }
}