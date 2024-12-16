
import java.io.BufferedReader;
import java.io.FileReader;

public class LeerFicheros {
    //Metodo para leer
    public static void leer(String nombreArchivo){
        try{
            FileReader fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);

            String linea;


            while ((linea = br.readLine()) != null){
                System.out.println(linea);
            }

            br.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


}
