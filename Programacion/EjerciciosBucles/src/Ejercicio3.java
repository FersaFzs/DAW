import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una cadena: ");
        String cadena = "";
        cadena = scanner.nextLine();
        String cadenaInversa ="";
        for(int i = cadena.length(); i > 0; i--){
            //hago esto para no usar StringBuilder ni .append()
            cadenaInversa += cadena.substring(i-1, i);
        }
        System.out.println(cadenaInversa);
    }
}
