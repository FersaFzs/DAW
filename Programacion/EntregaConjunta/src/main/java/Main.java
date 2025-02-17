import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args){
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        String estudiantesCSV = "C:\\Users\\Jose María Fernández\\Desktop\\DAW\\DAW\\Programacion\\EntregaConjunta\\src\\main\\archivos\\estudiantes.csv";
        HashSet<String> ciudades = new HashSet<>();
        HashMap<String, List<Estudiante>> estudiantesCiudad = new HashMap<>();
        Queue<Estudiante> atencionEstudiantes = new LinkedList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(estudiantesCSV))){
            String linea;
            while((linea = br.readLine()) != null){
                String[] datos = linea.split(",");
                String nombre = datos[0];
                int edad = Integer.parseInt(datos[1]);
                String ciudad = datos[2];
                double nota = Double.parseDouble(datos[3]);

                Estudiante estudiante = new Estudiante(nombre, edad, ciudad, nota);
                estudiantes.add(estudiante);
                ciudades.add(ciudad);

                estudiantesCiudad.putIfAbsent(ciudad, new ArrayList<>());
                estudiantesCiudad.get(ciudad).add(estudiante);

                atencionEstudiantes.add(estudiante);
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }

        System.out.println("Lista de estudiantes: ");
        for(Estudiante e: estudiantes){
            System.out.println(e.toString());
        }
        System.out.println();

        System.out.println("Lista de ciudades: ");
        for(String ciudad : ciudades){
            System.out.println(ciudad);
        }
        System.out.println();

        System.out.println("Estudiantes por ciudad: ");
        for(Map.Entry<String, List<Estudiante>> v : estudiantesCiudad.entrySet()){
            System.out.println("Ciudad: " + v.getKey());
            for(Estudiante e : v.getValue()){
                System.out.println("  " + e.getNombre());
            }
        }
        System.out.println();

        System.out.println("Atención al Estudiante: ");
        while (!atencionEstudiantes.isEmpty()){
            Estudiante atendido = atencionEstudiantes.poll();
            System.out.println("Atendiendo a: " + atendido.getNombre());
        }
    }
}
