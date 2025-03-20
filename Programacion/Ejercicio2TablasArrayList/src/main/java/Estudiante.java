import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private int edad;
    private int curso;

    public Estudiante(String nombre, int edad, int curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\nEdad: " + this.edad + "\nCurso: " + this.curso;
    }

    public static ArrayList<Estudiante> generarEstudiantes(){
        ArrayList<Estudiante> datos = new ArrayList<>();
        datos.add(new Estudiante("Chema", 20, 1));
        datos.add(new Estudiante("Alex", 21, 2));
        datos.add(new Estudiante("Javi", 22, 1));
        return datos;
    }
}
