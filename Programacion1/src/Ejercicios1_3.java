import java.util.Scanner;

public class Ejercicios1_3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el numero total de ventas: ");
        int ventas = scanner.nextInt();
        System.out.print("Introduce el numero de productos electrónicos vendidos:");
        int electronicos = scanner.nextInt();
        int ropa = ventas - electronicos;
        double porcentajeElectronicos = (electronicos * 100.0) / ventas;
        double porcentajeRopa = (ropa * 100.0) / ventas;

        System.out.println("Has vendido "+ventas+" productos, de los cuales el "+porcentajeElectronicos+"% son productos electronicos y el otro "+porcentajeRopa+"% es ropa.");

    }
}
