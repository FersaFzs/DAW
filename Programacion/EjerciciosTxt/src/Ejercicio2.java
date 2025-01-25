import java.io.File;

public class Ejercicio2 {
    public static void main(String[] args){
        String path = "C:\\Users\\Administrator\\Desktop\\DAW\\Programacion\\EjerciciosTxt\\Ficheros\\archivo1.txt";
        File archivo1 = new File(path);

        if (archivo1.exists()) {
            LeerTXT.leer(path);
        } else {
            System.out.println("El archivo no existe");
        }
    }
}
