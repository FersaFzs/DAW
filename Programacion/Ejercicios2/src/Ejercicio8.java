import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Ejercicio 8
        System.out.println("Introduce tu fecha de nacimiento (Formato: dia mes año)");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int anio = scanner.nextInt();

        int sumaFecha = dia + mes + anio;
        int dig1 = sumaFecha % 10;
        sumaFecha /= 10;
        int dig2 = sumaFecha % 10;
        sumaFecha /= 10;
        int dig3 = sumaFecha % 10;
        sumaFecha /= 10;
        int dig4 = sumaFecha % 10;

        int luckyNum = dig1 + dig2 + dig3 + dig4;
        System.out.println("Tu numero de la suerte es: "+luckyNum);
    }
}
