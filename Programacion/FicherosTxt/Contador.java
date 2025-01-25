import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Contador {
    public static int cuentaPalabras(String nombreArchivo, String palabra){
        int contador = 0;

        try{
            FileReader fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);

            String linea;
            while((linea = br.readLine()) != null){
                String[] datos = linea.split(",");
                for
                if(datos[i].equals(palabra)){
                    contador++
                }
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }


        return contador;
    }
}
