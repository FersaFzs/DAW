import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce las notas de 5 materias (0-100): ");
        double nota1 = scanner.nextDouble();
        if (100 < nota1 || nota1 < 0){
            System.out.println("La nota " + nota1 + " es inválida");
            System.exit(0);
        }
        double nota2 = scanner.nextDouble();
        if (100 < nota2 || nota2 < 0){
            System.out.println("La nota " + nota2 + " es inválida");
            System.exit(0);
        }
        double nota3 = scanner.nextDouble();
        if (100 < nota3 || nota3 < 0){
            System.out.println("La nota " + nota3 + " es inválida");
            System.exit(0);
        }
        double nota4 = scanner.nextDouble();
        if (100 < nota4 || nota4 < 0){
            System.out.println("La nota " + nota4 + " es inválida");
            System.exit(0);
        }
        double nota5 = scanner.nextDouble();
        if (100 < nota5 || nota5 < 0){
            System.out.println("La nota " + nota5 + " es inválida");
            System.exit(0);
        }

        double media = ((nota1 + nota2 + nota3 + nota4 + nota5)/5);
        String calificacion = "";
        if (100 >= media && media >= 90){
            calificacion = "A";
        }else if (89 >= media && media >= 80){
            calificacion = "B";
        }else if (79 >= media && media >= 70){
            calificacion = "C";
        }else if (69 >= media && media >= 60){
            calificacion = "D";
        }else if (60 > media ){
            calificacion = "F";
        }
        System.out.println("Tu calificación es: " + calificacion);
    }
}
