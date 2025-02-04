import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        HashSet<String> elementos = new HashSet<>();
        String elemento = "Prueba";
        elementos.add(elemento);
        if(elementos.contains(elemento)){
            System.out.println("lo contiene");
        } else{
            System.out.println("no lo contiene");
        }
    }
}
