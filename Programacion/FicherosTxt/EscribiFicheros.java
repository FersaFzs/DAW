import java.io.BufferedWriter;
import java.io.FileWriter;

public class EscribiFicheros {
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
}
