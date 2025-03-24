public class Estudiante {
    private String nombre;
    private int edad;
    private String curso;

    public Estudiante(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }

    public String toString(){
        return "Nombre: " + this.nombre + "\nEdad: " + this.edad + "\nCurso: " + this.curso;    }
}
