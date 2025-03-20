import java.util.ArrayList;

public class Coche {
    private String marca;
    private int anio;
    private String color;

    public Coche(String marca, int anio, String color) {
        this.marca = marca;
        this.anio = anio;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + "\nAnio: " + anio + "\nColor: " + color;
    }

    public static ArrayList<Coche> generarCoches(){
        ArrayList<Coche> datos = new ArrayList<>();
        datos.add(new Coche("BMW", 2008, "Rojo"));
        datos.add(new Coche("Toyota", 2017, "Azul"));
        datos.add(new Coche("Nissan", 1998, "Blanco"));
        datos.add(new Coche("Mercedes",2020 ,"Negro"));
        return datos;
    }
}
