public class ejercicio4 {
    public static void main(String[] args) {
        char[] caracteres = {'a', 'b', 'e', 'i', 'o', 'u', 'x', 'y'};
        int contador = 0;
        
        for (char c : caracteres) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }
        
        System.out.println("Total de vocales: " + contador);
    }
}