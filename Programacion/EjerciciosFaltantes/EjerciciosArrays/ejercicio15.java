public class ejercicio15 {
    public static void main(String[] args) {
        String[] palabras = {"ana", "oso", "casa", "reconocer", "programar"};
        
        for (String palabra : palabras) {
            if (esPalindromo(palabra)) {
                System.out.println(palabra + " es un palíndromo");
            } else {
                System.out.println(palabra + " no es un palíndromo");
            }
        }
    }
    
    public static boolean esPalindromo(String palabra) {
        int i = 0;
        int j = palabra.length() - 1;
        
        while (i < j) {
            if (palabra.charAt(i) != palabra.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}