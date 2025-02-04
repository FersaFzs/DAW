import java.util.LinkedHashSet;

public class Ejercicio3 {
    public static void main(String[] args){
        LinkedHashSet<String> palabras = new LinkedHashSet<>();

        palabras.add("hola");
        palabras.add("segunda palabra");
        palabras.add("tercera palabra");
        palabras.add("cuarta palabra");
        palabras.add("quinta palabra");
        palabras.add("sexta palabra");

        for(String p : palabras){
            System.out.println(p);
        }
    }
}
