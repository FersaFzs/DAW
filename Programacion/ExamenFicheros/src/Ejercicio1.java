import java.io.*;
public class Ejercicio1 {
    public static void Ejercicio1(String nombreArchivo){
        int sumatoria = 0;
        int contador = 0;
        try{
            FileReader fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);

            String linea;
            while((linea = br.readLine()) != null){
                System.out.println(linea);
                linea.//pasar a numero ;
                sumatoria += //numero ;
                contador ++;
            }

            System.out.println("La sumatoria de los números es: " + sumatoria);
            System.out.println("La media de los números es: " + (sumatoria / contador));

            br.close();
        } catch(IOException e){
            throw new RuntimeException(e);
        }
    }
}
