import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirCSV {
    public static void escribir(String path, String datos){
        BufferedWriter bw = null;
        try{
            FileWriter fw = new FileWriter(path);
            bw = new BufferedWriter(fw);
            bw.write(datos);
            bw.newLine();
        } catch(IOException e){
            System.err.println(e.getMessage());
        } finally {
            if(bw != null){
                try{
                    bw.close();
                } catch(IOException e){
                    System.out.println("Error al cerrar el fichero de escritura");
                }
            }
        }
    }
}
