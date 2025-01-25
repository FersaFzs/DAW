import java.io.File;

public class Main {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\2DAM\\Desktop\\codigos_programacion\\Ficheros\\src\\Ficheros\\prueba.txt";
        LeerTXT.leer(ruta);

        EscribirTXT.escribir(ruta, "Alex Epsabila");
        LeerTXT.leer(ruta);

        File imagen = new File(ruta);
        imagen.delete();

    }
}