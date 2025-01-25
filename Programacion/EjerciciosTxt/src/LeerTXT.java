
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerTXT {
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

    public static String leerStr(String nombreArchivo){
        StringBuilder contenido = new StringBuilder();

        try{
            FileReader fr2 = new FileReader(nombreArchivo);
            BufferedReader br2 = new BufferedReader(fr2);

            String linea;
            while((linea = br2.readLine()) != null){
                contenido.append(linea).append("\n");
            }

            br2.close();
        } catch (IOException e2){
            throw new RuntimeException(e2);
        }
        return contenido.toString();
    }

    public static int cuentaLineas(String nombreArchivo){
        int contador = 0;

        try{
            FileReader fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);

            String linea;


            while((linea = br.readLine()) != null){
                contador++;
                System.out.println("Linea "+contador);
            }

            br.close();
        } catch(IOException e3) {
            throw new RuntimeException(e3);
        }
        return contador;
    }

    public static void buscaPalabra(String nombreArchivo, String palabra){
        try{
            FileReader fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);

            String linea;
            int contador = 0;
            while((linea = br.readLine()) != null){
                int puntero = 0;
                while((puntero = linea.indexOf(palabra, puntero)) != -1){
                    contador++;
                    puntero += palabra.length();
                }
            }
            br.close();
            System.out.println("El archivo contiene la palabra " + palabra + " " + contador + " veces.");;
        } catch (IOException e4 ) {
            throw new RuntimeException(e4);
        }
    }
}
