import java.util.Scanner;
public class Ejercicios1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //Ejercicio 1
        System.out.print("Introduce el radio del circulo: ");
        float r = scanner.nextFloat();
        final double pi = 3.1415 ;
        double area = pi * (r*r);
        double perimetro = 2 * pi * r;
        System.out.println("El area del circulo es : "+area+"\nEl perimetro del circulo es : "+perimetro);

        //Ejercicio 2
        System.out.print("Introduce 4 enteros: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int n4 = scanner.nextInt();

        int multiplicacion = n1 * n2 * n3 * n4;
        int suma = n1+n2+n3+n4;
        double media = suma / 4.0;

        System.out.println("El producto de los numeros introducidos es: "+multiplicacion+" la suma es: "+suma+" la media es: "+media);

        //Ejercicio 3
        System.out.print("Introduce el numero total de ventas: ");
        int ventas = scanner.nextInt();
        System.out.print("Introduce el numero de productos electrónicos vendidos:");
        int electronicos = scanner.nextInt();
        int ropa = ventas - electronicos;
        double porcentajeElectronicos = (electronicos * 100.0) / ventas;
        double porcentajeRopa = (ropa * 100.0) / ventas;

        System.out.println("Has vendido "+ventas+" productos, de los cuales el "+porcentajeElectronicos+"% son productos electronicos y el otro "+porcentajeRopa+"% es ropa.");

        //Ejercicio 4
        int a=3,b=4,c=5;
        int x;
        x = b;
        b = a;
        a = c;
        c = x;

        //Ejercicio 4.1
        a = 6;
        b = 7;
        c = 8;
        x = 0;
        int d = 9;
        x = b; //Guardo el valor de B
        b = a; //B toma el valor de A
        a = d; //Guardo el valor de D
        d = x; //D toma el valor de B
        x = c; //Guardo el valor de C
        c = a; //C toma el valor de D
        a = x; //A toma el valor de C

        //Ejercicio 5
        System.out.print("Introduce una cantidad de segundos: ");
        int segundos = scanner.nextInt();
        int horas = segundos / 3600;
        int restoSegundos = segundos % 3600;
        int minutos = restoSegundos / 60;
        restoSegundos %= 60;
        System.out.println(horas +" horas, " +minutos+" minutos y " + restoSegundos + " segundos.");

        //Ejercicio 6
        System.out.print("Introduce un número de 5 cifras: ");
        int xn = scanner.nextInt();
        for (int i = 0; i < 5; i ++){
            int nx = xn % 10;
            System.out.print(nx + " ");
            xn /= 10;
        }
        //Ejercicio 6 opción 2
        System.out.print("\nIntroduce otro número de 5 cifras: ");
        int numx = scanner.nextInt();
        int x1 = numx % 10;
        numx /= 10;
        int x2 = numx % 10;
        numx /= 10;
        int x3 = numx % 10;
        numx /= 10;
        int x4 = numx % 10;
        numx /= 10;
        int x5 = numx;
        System.out.println(x5+" "+x4+" "+x3+" "+x2+" "+x1);
    }
}

