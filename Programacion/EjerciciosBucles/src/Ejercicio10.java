import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int contadorCadenas = 0;
        String cadena = "";
        String cadenaMasLarga = "";
        String salir = "salir";

        while (!cadena.equals(salir)){
            System.out.println("Introduzca una cadena: ");
            cadena = scanner.nextLine();
            if(cadena.length() > cadenaMasLarga.length()){
                cadenaMasLarga = cadena;
            }
            contadorCadenas ++;
        }
        //descontamos la cadena de salida
        contadorCadenas -= 1;

        System.out.println("Has introducido: "+contadorCadenas+" cadenas, y la mas larga es:\n"+cadenaMasLarga);
    }
}
