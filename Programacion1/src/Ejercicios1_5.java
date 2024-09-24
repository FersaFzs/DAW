import java.util.Scanner;

public class Ejercicios1_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una cantidad de segundos: ");
        int segundos = scanner.nextInt();
        int horas = segundos / 3600;
        //Guarda el resto de los valores que no se han contado como horas
        int restoSegundos = segundos % 3600;
        int minutos = restoSegundos / 60;
        restoSegundos %= 60;
        System.out.println(horas +" horas, " +minutos+" minutos y " + restoSegundos + " segundos.");

    }
}
