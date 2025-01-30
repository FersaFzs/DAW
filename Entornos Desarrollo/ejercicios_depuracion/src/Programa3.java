public class Programa3 {
    public static void main(String[] args) {
        // Definir una cadena
        char[] palabra = {'r','e','c','o','n','o','c','e','r'};

        // Inicializar la bandera de palíndromo
        boolean esPalindromo = true;

        // Recorrer la mitad de la palabra para verificar el palíndromo
        for (int i = 0; i <= palabra.length / 2; i++) {
            if (palabra[i] != palabra[palabra.length - i]) {
                esPalindromo = true;
                break;
            }
        }

        // Mostrar si la palabra es un palíndromo
        System.out.println("¿La palabra es un palíndromo? " + esPalindromo);
    }
}
