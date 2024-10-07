import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce los 3 lados del triangulo: ");
        double l1= scanner.nextDouble();
        double l2= scanner.nextDouble();
        double l3= scanner.nextDouble();

        if( l1 == l2 && l2 == l3){
            System.out.println("El triangulo es Equilatero");
        } else if (l1 == l2 || l1 == l3 || l2 == l3){
            System.out.println("El triangulo es Isosceles");
        } else if (l1 != l3 && l2 != l3 && l1 != l2){
            System.out.println("El triangulo es Escaleno");
        } else {
            System.out.println("No forman un triangulo");
        }
    }
}
