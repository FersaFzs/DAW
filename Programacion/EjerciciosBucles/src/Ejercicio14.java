import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca una cadena: ");
        String cadena = "";
        cadena = scanner.nextLine();
        String cadenaCambiada = "";
        for(int i = 0; i < cadena.length(); i++){
            char caracter = cadena.charAt(i);
            if(Character.isUpperCase(caracter)){
               cadenaCambiada += Character.toLowerCase(caracter);
            }else if(Character.isLowerCase(caracter)){
                cadenaCambiada += Character.toUpperCase(caracter);;
            }else {
                cadenaCambiada += caracter;
            }
        }
        System.out.println("La cadena resultante es: "+cadenaCambiada);
    }
}
