public class Programa2 {
    public static void main(String[] args) {
        // Definir una cadena
        char[] cadena = {'O','l','a','s','e','n','e','l','m','a','r'};

        // Inicializar el contador de vocales
        int contadorVocales = 0;

        // Recorrer el array para contar las vocales
        for (int i = 0; i <= cadena.length; i+=2) {
            char caracter = cadena[i];
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contadorVocales++;
            }
        }

        // Mostrar el conteo de vocales
        System.out.println("El número de vocales es: " + contadorVocales);
    }
}
