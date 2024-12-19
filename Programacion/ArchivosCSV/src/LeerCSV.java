import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerCSV {
    public static void leer(String path){
        BufferedReader br = null;
        try{
            FileReader fr = new FileReader(path);
            br = new BufferedReader(fr);

            String linea;
            while((linea = br.readLine()) != null ){
                System.out.println(linea);
            }
        } catch(IOException e){
            System.err.println(e.getMessage());
        } finally{
            if( br != null) {
                try {
                    br.close();
                } catch(IOException e){
                    System.out.println("Error al cerrar fichero");
                }
            }
        }
    }
}
