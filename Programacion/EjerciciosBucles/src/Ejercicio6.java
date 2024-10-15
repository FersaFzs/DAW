import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una cadena: ");
        String cadena = "";
        cadena = scanner.nextLine();
        int contador = 0;
        for(int i = 0; i < cadena.length(); i ++){
            switch(cadena.substring(i, i +1)){
                case "a":
                    contador++;
                    break;
                case "e":
                    contador++;
                    break;
                case "i":
                    contador++;
                    break;
                case "o":
                    contador++;
                    break;
                case "u":
                    contador++;
                    break;
                case "A":
                    contador++;
                    break;
                case "E":
                    contador++;
                    break;
                case "I":
                    contador++;
                    break;
                case "O":
                    contador++;
                    break;
                case "U":
                    contador++;
                    break;
            }
        }
        System.out.println("La cadena tiene "+contador+" vocales.");
    }
}
