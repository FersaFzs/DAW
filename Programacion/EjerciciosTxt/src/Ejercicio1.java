import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un texto: ");
        String texto = scanner.nextLine();
        String path = "C:\\Users\\Administrator\\Desktop\\DAW\\Programacion\\EjerciciosTxt\\Ficheros\\archivo1.txt";

        File archivo1 = new File(path);

        try {
            //Se crea el archivo1, si existe se sobreescribe
            archivo1.createNewFile();
            System.out.println("Archivo creado: " + archivo1.getName());
        } catch (IOException e){
            System.out.println("Error al crear el archivo");
        }

        EscribirTXT.escribir(path, texto);
        LeerTXT.leer(path);
    }
}
