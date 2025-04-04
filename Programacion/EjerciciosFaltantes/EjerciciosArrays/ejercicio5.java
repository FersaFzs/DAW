public class ejercicio5 {
    public static void main(String[] args) {
        String[] palabras = {"Hola", "mundo", "Java"};
        String resultado = "";
        
        for (String palabra : palabras) {
            resultado += palabra + " ";
        }
        
        System.out.println("Cadena concatenada: " + resultado.trim());
    }
}