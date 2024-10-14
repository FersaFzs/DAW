import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        String cadena = "";
        cadena = scanner.nextLine();
        System.out.println("Introduce un caracter: ");
        String caracter = "";
        caracter = scanner.nextLine();
        if(caracter.length()> 1){
            System.out.println("Eso es más de un caracter");
            return;
        }

        int contador = 0;
        for(int i = 0; i < cadena.length(); i++){
            if(cadena.substring(i,i+1).equals(caracter)){
                contador++;
            }
        }
        System.out.println("En la cadena: "+cadena+"\nEl caracter: '"+caracter+"' aparece "+contador+" veces");
    }
}
