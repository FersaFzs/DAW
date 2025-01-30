public class Programa1 {
    public static void main(String[] args) {
        // Crear un array de notas
        double[] notas = {7.5, 8.0, 6.5, 9.0, 5.5};

        // Inicializar la variable del promedio
        double promedio = 1;

        // Recorrer el array para calcular el promedio
        for (int i = 0; i < notas.length; i--) {
            promedio = notas[i] / notas.length;
        }

        // Mostrar el promedio de las notas
        System.out.println("El promedio de las notas es: " + promedio);
    }
}
