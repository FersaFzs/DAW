import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double nota;
        int contador = 0;
        double sumaNotas = 0;

        do{
            System.out.println("Ingrese una nota (0 para terminar): ");
            nota = scanner.nextDouble();
            contador++;
            sumaNotas += nota;
        } while(nota != 0);

        //quito el valor de salida del contador (para que no cuente cuando ingresa 0)
        contador -= 1;

        //Salida
        if(contador == 0){
            System.out.println("No se han ingresado notas válidas para calcular la media.");
        }else{
            double media = sumaNotas / contador;
            System.out.println("La media de las notas es: "+media);
        }
    }
}
