import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca sus ingresos anuales y su cantidad de empleados: ");
        double ingresos = scanner.nextDouble();
        int empleados = scanner.nextInt();
        int impuestos = 0;
        if (ingresos < 20000){
            impuestos = 5;
        } else if (ingresos >= 20000 && 40000 > ingresos){
            impuestos = 10;
        } else if (ingresos >= 40000 && 80000 > ingresos){
            impuestos = 20;
        } else if (ingresos >= 80000){
            impuestos = 30;
        } else {
            System.out.println("Numero de ingresos no válido");
        }

        if (empleados > 3){
            impuestos += 5;
        }
    }
}
