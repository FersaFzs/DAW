import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FiltrarTXT {
    public static void filtrar(String nombreArchivo, String Destino, String palabra){
        try{
            FileWriter fw = new FileWriter(Destino);
            BufferedWriter bw = new BufferedWriter(fw);

            FileReader fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);

            String linea;
            while((linea = br.readLine()) != null){
                if(linea.contains(palabra)){
                    bw.write(linea);
                    bw.newLine();
                }
            }
            br.close();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
