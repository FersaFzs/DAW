import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;

public class CopiaMain {
    ArrayList<Estudiante> estudiantes = new ArrayList<>();
    HashSet<String> ciudades = new HashSet<>();
    HashMap<String, List<Estudiante>> estudiantesCiudad = new HashMap<>();
    Queue<Estudiante> atencionEstudiantes = new LinkedList<>();
    public static void main(String[] args){
        String path = "";
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String linea;
            while((linea = br.readLine()) != null){
                String[] datos = linea.split(",");
                Estudiante e = new Estudiante(datos[0], Integer.parseInt(datos[1]), datos[2], Double.parseDouble(datos[3]));
                estudiantes.add(e);
                ciudades.add(e.getCiudad());
                estudiantesCiudad.putIfAbsent(e.getCiudad(), new ArrayList<>());
                estudaiantesCiudad.get(e.getCiudad()).add(e);
                atencionEstudiantes.add(e);
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }

        for(Map.Entry<String, List<Estudiante>> entry : estudiantesCiudad.entrySet()){
            System.out.println("Ciudad " + entry.getKey());
            for(Estudiante e : entry.getValue()){
                System.out.println(e.getNombre());
            }
        }

        for(Estudiante e : estudiantes){
            System.out.println(e);
        }

        for(String ciudad : ciudades){
            System.out.println(ciudad);
        }

        while(!atencionEstudiantes.isEmpty()){
            System.out.println(atencionEstudiantes.poll().getNombre());
        }
    }
}
