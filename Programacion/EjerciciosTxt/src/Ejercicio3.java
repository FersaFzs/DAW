import java.io.File;

public class Ejercicio3 {
    public static void main(String[] args){
        String pathOrigen = "C:\\Users\\Administrator\\Desktop\\DAW\\Programacion\\EjerciciosTxt\\Ficheros\\archivo1.txt";
        String pathDestino = "C:\\Users\\Administrator\\Desktop\\DAW\\Programacion\\EjerciciosTxt\\Ficheros\\archivo2.txt";

        String contenido = LeerTXT.leerStr(pathOrigen);

        EscribirTXT.escribir(pathDestino, contenido);
    }
}
