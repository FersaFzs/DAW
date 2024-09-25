import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Ejercicio 2
        System.out.print("Introduce las horas de trabajo diarias y los dias trabajados a la semana: ");
        int horas = scanner.nextInt();
        int dias = scanner.nextInt();
        int sueldo = 12 * horas * dias;
        System.out.println(sueldo + " euros a la semana.");
    }

}
