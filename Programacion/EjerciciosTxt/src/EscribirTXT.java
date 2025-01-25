import java.io.BufferedWriter;
import java.io.FileWriter;

public class EscribirTXT {
    public static void escribir(String path, String contenido){
        try{
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(contenido);
            bw.newLine();

            bw.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void escribirAppend(String path, String contenido){
        try{
            FileWriter fw = new FileWriter(path, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(contenido);
            bw.newLine();

            bw.close();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void sobreescribir(String path, String contenido){
        try {
            FileWriter fw = new FileWriter(path, false);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(contenido);
            bw.newLine();

            bw.close();
        } catch (Exception e3){
            throw new RuntimeException(e3);
        }
    }
}


