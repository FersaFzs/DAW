import java.io.File;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Desea eliminar el archivo2.txt? Y/n");
        String respuesta = scanner.nextLine().trim().toUpperCase();
        String path = "C:\\Users\\Administrator\\Desktop\\DAW\\Programacion\\EjerciciosTxt\\Ficheros\\archivo2.txt";

        File archivo2 = new File(path);

        if(respuesta.equals("Y")){
            if(archivo2.exists()){
                if(archivo2.delete()){
                    System.out.println("El archivo ha sido eliminado.");
                }
            } else {
                System.out.println("No existe el archivo");
            }
        } else {
            System.out.println("No se ha eliminado el archivo.");
        }
    }
}
