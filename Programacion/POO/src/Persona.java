import java.sql.SQLOutput;

public class Persona {
    private String nombre;
    private int edad;
    private char sexo;

    public Persona() {

    }

    public Persona(String n1, int edad, char sexo) {
        nombre = n1;
        this.edad = edad; // con this.x hacemos referencia al atributo de la clase aunque tenga el mismo nombre que el de la función
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void saluda(){
        System.out.println("Hola");
    }

}
