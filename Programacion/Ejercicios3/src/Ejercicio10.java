import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double nota1,nota2,nota3,nota4,nota5,nota6;
        double peso1,peso2,peso3,peso4,peso5,peso6;
        System.out.println("Introduce la nota 1 y su peso porcentual: ");
        nota1 = scanner.nextDouble();
        peso1 = scanner.nextDouble();
        System.out.println("Introduce la nota 2 y su peso porcentual: ");
        nota2 = scanner.nextDouble();
        peso2 = scanner.nextDouble();
        System.out.println("Introduce la nota 3 y su peso porcentual: ");
        nota3 = scanner.nextDouble();
        peso3 = scanner.nextDouble();
        System.out.println("Introduce la nota 4 y su peso porcentual: ");
        nota4 = scanner.nextDouble();
        peso4 = scanner.nextDouble();
        System.out.println("Introduce la nota 5 y su peso porcentual: ");
        nota5 = scanner.nextDouble();
        peso5 = scanner.nextDouble();
        System.out.println("Introduce la nota 6 y su peso porcentual: ");
        nota6 = scanner.nextDouble();
        peso6 = scanner.nextDouble();

        double sumaPesos = peso1 + peso2 + peso3 + peso4 + peso5 + peso6;
        if(sumaPesos == 100.0){
            double promedioPonderado = (nota1 * (peso1 / 100)) +(nota2 * (peso2 / 100)) +(nota3 * (peso3 / 100)) +(nota4 * (peso4 / 100)) +(nota5 * (peso5 / 100)) +(nota6 * (peso6 / 100));
            System.out.println("El promedio ponderado es: "+promedioPonderado);
            if(promedioPonderado < 60.0){
                System.out.println("Has suspendido");
            }
        } else {
            System.out.println("Error: la suma de los pesos no es igual a 100%");
        }
    }
}
