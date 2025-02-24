import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args){

        //Creo el ArrayList Estudiantes
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        String estudiantesCSV = "C:\\Users\\Jose María Fernández\\Desktop\\DAW\\DAW\\Programacion\\EntregaConjunta\\src\\main\\archivos\\estudiantes.csv";

        //Set ciudades sueltas
        HashSet<String> ciudades = new HashSet<>();

        //Mapa estudiantes por ciudad
        HashMap<String, List<Estudiante>> estudiantesCiudad = new HashMap<>();

        //Cola de atención
        Queue<Estudiante> atencionEstudiantes = new LinkedList<>();

        //Recorro el archivo CSV
        try(BufferedReader br = new BufferedReader(new FileReader(estudiantesCSV))){
            String linea;
            while((linea = br.readLine()) != null){
                //Guardo las lineas en un array de string para separar la cadena por las comas
                String[] datos = linea.split(",");
                String nombre = datos[0];
                int edad = Integer.parseInt(datos[1]);
                String ciudad = datos[2];
                double nota = Double.parseDouble(datos[3]);

                //Guardo cada estudiante con el constructor en el ArrayList
                Estudiante estudiante = new Estudiante(nombre, edad, ciudad, nota);
                estudiantes.add(estudiante);

                //Guardo las ciudades en el Set
                ciudades.add(ciudad);

                //Guardo en el mapa, por cada ciudad, un array list con los nombres de los estudiantes.
                estudiantesCiudad.putIfAbsent(ciudad, new ArrayList<>());
                estudiantesCiudad.get(ciudad).add(estudiante);

                //Por cada estudiante que leo lo añado a la cola de atención.
                atencionEstudiantes.add(estudiante);
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }

        //Muestro los estudiantes
        System.out.println("Lista de estudiantes: ");
        for(Estudiante e: estudiantes){
            System.out.println(e.toString());
        }
        System.out.println();

        //Muestro las ciudades sueltas
        System.out.println("Lista de ciudades: ");
        for(String ciudad : ciudades){
            System.out.println(ciudad);
        }
        System.out.println();

        //Muestro los estudiantes por ciudad (solo los nombres para que se vea más claro
        System.out.println("Estudiantes por ciudad: ");
        for(Map.Entry<String, List<Estudiante>> v : estudiantesCiudad.entrySet()){
            System.out.println("Ciudad: " + v.getKey());
            for(Estudiante e : v.getValue()){
                System.out.println("  " + e.getNombre());
            }
        }
        System.out.println();

        //Muestro la cola de atención a cada estudiante.
        System.out.println("Atención al Estudiante: ");
        while (!atencionEstudiantes.isEmpty()){
            Estudiante atendido = atencionEstudiantes.poll();
            System.out.println("Atendiendo a: " + atendido.getNombre());
        }
    }
}
