public class ejercicio8 {
    public static void main(String[] args) {
        char[] caracteres = {'a', 'b', 'a', 'c', 'a', 'd'};
        char buscado = 'a';
        int contador = 0;
        
        for (char c : caracteres) {
            if (c == buscado) {
                contador++;
            }
        }
        
        System.out.println("El carácter '" + buscado + "' aparece " + contador + " veces.");
    }
}