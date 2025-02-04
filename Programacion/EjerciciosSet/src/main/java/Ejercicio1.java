import java.util.HashSet;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args){
        HashSet<String> nombres = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String nombre;
        do{
            System.out.println("Introduce Nombres (finaliza con 'salir'): ");
            nombre = scanner.nextLine();
            if (!nombre.equals("salir")) {
                nombres.add(nombre);
            }
        } while(!nombre.equals("salir"));
        System.out.println("\nLista de nombres: ");
        for(String name : nombres){
            System.out.println(name);
        }
    }
}
