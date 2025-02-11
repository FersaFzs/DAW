import java.util.*;

public class Ej3 {
    static TreeMap<String, ArrayList<Double>> notas = new TreeMap<>();

    static void agregarDatos(){
        ArrayList<Double> notasEstudiante1 = new ArrayList<>(Arrays.asList(7.5, 6.9, 9.4));
        notas.put("Fersa", notasEstudiante1);
        ArrayList<Double> notasEstudiante3 = new ArrayList<>(Arrays.asList(8.5, 4.9, 9.8));
        notas.put("Zoe", notasEstudiante3);
        ArrayList<Double> notasEstudiante2 = new ArrayList<>(Arrays.asList(8.5, 4.9, 9.8));
        notas.put("Ana", notasEstudiante2);
    }
    public static void agregarNotas(String nombre) {
        if (notas.containsKey(nombre)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce la nota (valores negativos o mayores de 10 para salir): ");
            double nota = scanner.nextDouble();
            do {
                notas.get(nombre).add(nota);
                System.out.println("Introduce la nota (valores negativos o mayores de 10 para salir): ");
                nota = scanner.nextDouble();
            } while (nota >= 0.00 && nota <= 10.00);
        } else {
            System.out.println("No existe un alumno con ese nombre");
        }
    }

    public static double calcularMedia(String nombre) {
        double total = 0.00;
        if (notas.containsKey(nombre)) {
            for (double v : notas.get(nombre)) {
                total += v;
            }
        } else {
            System.out.println("No existe alumno con ese nombre");
        }
        return total / notas.get(nombre).size();
    }

    public static void mostrarAlumnos() {
        if (!notas.isEmpty()) {
            for (Map.Entry<String, ArrayList<Double>> nota : notas.entrySet()) {
                System.out.println("Nombre: " + nota.getKey() + " Notas: " + nota.getValue());
            }
        } else{
            System.out.println("No hay nada que mostrar");
        }
    }
}
