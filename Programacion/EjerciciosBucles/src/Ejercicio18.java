import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una cadena: ");
        String cadena = "";
        String consonantes = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        cadena = scanner.nextLine();
        int contador = 0;
        for(int i = 0; i < cadena.length(); i ++){
            if(consonantes.contains(cadena.substring(i, i+1))){
                contador++;
            }
        }
        System.out.println("La cadena tiene: "+contador+" consonantes.");
    }
}
