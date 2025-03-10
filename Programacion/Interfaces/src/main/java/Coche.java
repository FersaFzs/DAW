import java.util.ArrayList;

public class Coche {
    private double precio;
    private String modelo;
    private int anio;
    private String marca;

    public Coche(double precio, String modelo, int anio, String marca) {
        this.precio = precio;
        this.modelo = modelo;
        this.anio = anio;
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public static ArrayList<Coche> generarDatosEstaticos(){
        ArrayList<Coche> datos = new ArrayList<>();
        datos.add(new Coche(18000, "E320", 2008, "Mercedes"));
        datos.add(new Coche(70000, "Supra", 2017, "Toyota"));
        datos.add(new Coche(15000, "Silvia", 1998, "Nissan"));
        datos.add(new Coche(50000, "340i", 2020, "BMW"));
        return datos;
    }
}
