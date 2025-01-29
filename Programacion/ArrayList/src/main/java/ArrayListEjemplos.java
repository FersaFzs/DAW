import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEjemplos {
    public static void main(String[] args){
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Cereza");

        System.out.println("Ejemplo 1: Lista de frutas");
        for(String fruta : frutas){
            System.out.println(fruta);
        }

        frutas.add(1, "Naranja");
        System.out.println("\nEjemplo 2: Lista de frutas: ");
        System.out.println(frutas);

        frutas.remove(2);
        frutas.remove("Cereza");
        System.out.println("\nEjemplo 3: Lista de frutas: ");
        System.out.println(frutas);

        boolean contieneManzana = frutas.contains("Manzana");
        System.out.println("\nEjemplo 4: La lista contiene manzana? " + contieneManzana);

        frutas.add("Kiwi");
        frutas.add("Pera");
        Collections.sort(frutas);
        System.out.println("\nEjemplo 5: Lista ordenada alfabéticamente");
        System.out.println(frutas);

        frutas.clear();
        System.out.println("\nEjemplo 6: Lista limpia");
        System.out.println(frutas);
    }
}
