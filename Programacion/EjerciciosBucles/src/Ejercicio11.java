import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una cadena: ");
        String cadena = "";
        cadena = scanner.nextLine();
        int cuentaPalabras = 1;
        for(int i = 0; i < cadena.length(); i++){
            if(cadena.charAt(i) == ' '){
                cuentaPalabras++;
            }
        }
        System.out.println("La cadena tiene: "+cuentaPalabras+" palabras.");
    }
}
