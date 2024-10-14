import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una cadena: ");
        String cadena = "";
        cadena = scanner.nextLine();
        String cadenaInversa ="";
        for(int i = cadena.length(); i > 0; i--){
            cadenaInversa += cadena.substring(i-1, i);
        }
        if(cadenaInversa.equals(cadena)){
            System.out.println("La cadena: "+cadena+ " es palindromo.");
        }else{
            System.out.println("La cadena: "+cadena+" no es palíndromo.");
        }
    }
}
