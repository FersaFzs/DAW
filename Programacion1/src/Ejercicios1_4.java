import java.util.Scanner;

public class Ejercicios1_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
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

    }
}
