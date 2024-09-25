import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Ejercicio7
        System.out.println("Introduce dos tiempos en horas minutos y segundos (Formato: Horas1 Minutos1 Segundos1 Horas2 Minutos2 Segundos2): ");
        int horas1 = scanner.nextInt();
        int minutos1 = scanner.nextInt();
        int segundos1 = scanner.nextInt();
        int horas2 = scanner.nextInt();
        int minutos2 = scanner.nextInt();
        int segundos2 = scanner.nextInt();

        segundos1 = (horas1 * 3600) + (minutos1 * 60) + segundos1;
        segundos2 = (horas2 * 3600) + (minutos2 * 60) + segundos2;

        int diffTiempo = segundos2 - segundos1;
        int diffHoras = diffTiempo / 3600;
        int diffSegundos = diffTiempo % 3600;
        int diffMinutos = diffSegundos / 60;
        diffSegundos %= 60;

        System.out.println("Han pasado "+diffHoras+" horas, "+diffMinutos+" minutos y "+diffSegundos+" segundos.");

    }
}
