import java.util.Scanner;

public class Ejercicios2_1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Ejercicio 1
        System.out.print("Introduce el radio del circulo: ");
        float r = scanner.nextFloat();
        final double pi = 3.1415 ;
        double area = pi * (r*r);
        double perimetro = 2 * pi * r;
        System.out.println("El area del circulo es : "+area+"\nEl perimetro del circulo es : "+perimetro);

    }
}
