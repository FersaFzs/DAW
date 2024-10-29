import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Entrada
        System.out.println("Ingrese un número entero positivo: ");
        int n = scanner.nextInt();

        int sumatoria=1; //la inicializo en 1 porque siempre va a ser divisor
        for(int i = 2; i < n; i++){
            if(n%i == 0){
                sumatoria += i;
            }
        }

        //Salida
        if(n == sumatoria){
            System.out.println("El número "+n+" es un número perfecto.");
        }else{
            System.out.println("El número "+n+" no es un número perfecto.");
        }
    }
}
