import java.io.*;

public class ArchivoPersonas {
    public static void mostrar(String nombreArchivo, String rutaExcel){
        try{
            FileReader fr = new FileReader(nombreArchivo);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(rutaExcel);
            BufferedWriter bw = new BufferedWriter(fw);

            String linea;
            while((linea = br.readLine()) != null){
                String[] datos = linea.split(";");
                System.out.println("Nombre: " + datos[0] + "Localidad: " + datos[1] + "Edad: " + datos[2]);

                if(datos[2].//Menor o igual a 30 años) ;

                else if(datos[2].//Mayor de 30 años// ) ;
                        try {
                            bw.write(datos[0] + "," + datos[1] + "," + datos[2]);
                            bw.newLine();
                        } catch (IOException e2){
                            throw new RuntimeException(e2);
                        }
                }

            br.close();
            bw.close();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}

