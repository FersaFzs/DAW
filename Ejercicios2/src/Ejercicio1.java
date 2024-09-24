import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Ejercicio 1
        System.out.print("Introduce el radio del circulo: ");
        float r = scanner.nextFloat();
        final double pi = Math.PI ;
        double area = pi * (r*r);
        double perimetro = 2 * pi * r;
        System.out.println("El area del circulo es : "+area+"\nEl perimetro del circulo es : "+perimetro);

    }
}
