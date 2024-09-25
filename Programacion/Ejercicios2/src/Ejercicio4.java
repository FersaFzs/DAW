import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Ejercicio 4
        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce tus tres notas: ");
        double npractica = scanner.nextDouble();
        double nproblemas = scanner.nextDouble();
        double nteorica = scanner.nextDouble();

        double nota = ((npractica * 0.1) + (nproblemas * 0.5) + (nteorica * 0.4));
        System.out.println("Nota final de " + nombre + " es " + nota +".");
    }
}
