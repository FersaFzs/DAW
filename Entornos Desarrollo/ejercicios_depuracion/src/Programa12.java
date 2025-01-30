public class Programa12 {
    public static void main(String[] args) {
        // Contar los dígitos de un número
        int numero = 123456;
        int contador = 0;

        while (numero > 0) {
            numero = numero / 100;
        }

        System.out.println("El número tiene " + contador + " dígitos.");
    }
}
