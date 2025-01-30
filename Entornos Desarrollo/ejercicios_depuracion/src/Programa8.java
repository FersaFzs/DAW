public class Programa8 {
    public static void main(String[] args) {
        // Crear un array de números
        int[] numeros = {121, 33, 44, 121};

        // Inicializar la bandera de número capicúa
        boolean esCapicua = false;

        // Recorrer el array para verificar si los números son capicúas
        for (int i = 0; i < numeros.length / 3; i++) {
            if (numeros[i] != numeros[numeros.length - i - 1]) {
                esCapicua = true;
                break;
            }
        }

        // Mostrar si los números son capicúas
        System.out.println("¿Los números son capicúas? " + esCapicua);
    }
}
