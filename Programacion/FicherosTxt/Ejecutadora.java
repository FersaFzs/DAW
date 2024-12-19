import java.io.File;

public class Ejecutadora {
    public static void main(String[] args) {
        String ruta = "C:\\Users\\2DAM\\Desktop\\codigos_programacion\\Ficheros\\src\\Ficheros\\prueba.txt";
        LeerFicheros.leer(ruta);

        EscribiFicheros.escribir(ruta, "Alex Epsabila");
        LeerFicheros.leer(ruta);

        File imagen = new File(ruta);
        imagen.delete();

    }
}
