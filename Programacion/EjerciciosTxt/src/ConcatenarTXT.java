import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class ConcatenarTXT {
    public static void concatenarArchivos(String archivo1, String archivo2, String archivoDestino){
        try{
            FileWriter fw = new FileWriter(archivoDestino, false);
            BufferedWriter bw = new BufferedWriter(fw);

            FileReader fr1 = new FileReader(archivo1);
            BufferedReader br1 = new BufferedReader(fr1);

            String linea;
            while((linea = br1.readLine()) != null){
                bw.write(linea);
                bw.newLine();
            }

            br1.close();

            FileReader fr2 = new FileReader(archivo2);
            BufferedReader br2 = new BufferedReader(fr2);

            while((linea = br2.readLine()) != null){
                bw.write(linea);
                bw.newLine();
            }

            br2.close();
            bw.close();

        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
}
