import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca una palabra a filtrar: ");
        String palabra = scanner.nextLine();
        String path1 = "C:\\Users\\Administrator\\Desktop\\DAW\\Programacion\\EjerciciosTxt\\Ficheros\\archivo3.txt";
        String path2 = "C:\\Users\\Administrator\\Desktop\\DAW\\Programacion\\EjerciciosTxt\\Ficheros\\filtrado.txt";

        FiltrarTXT.filtrar(path1, path2, palabra);
    }
}
