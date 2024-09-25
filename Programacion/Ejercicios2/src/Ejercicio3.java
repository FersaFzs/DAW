import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //Ejercicio 3
        System.out.print("Introduzca los partidos ganados, perdidos y empatados: ");
        int win = scanner.nextInt();
        int lose = scanner.nextInt(); //No se usa ya que no añade ni resta puntos
        int draw = scanner.nextInt();

        int puntos = (win * 3) + (lose * 0) + (draw * 1);

        System.out.println("Tienes " +puntos+" puntos.");
    }
}
