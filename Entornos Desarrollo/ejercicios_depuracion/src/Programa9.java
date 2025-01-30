public class Programa9 {
    public static void main(String[] args) {
        // Crear un array de números
        int[] datos = {10, 20, 30, 40, 50};

        // Inicializar la variable de la suma en un array
        int sumaNumeros= 0;

        // Recorrer el array para sumar los elementos en un array
        for (int i = datos.length; i>0; i++) {
            sumaNumeros = datos[i];
        }

        // Mostrar la suma de los elementos en un rango
        System.out.println("La suma de los elementos en un rango es: " + sumaNumeros);
    }
}
