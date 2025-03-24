import java.io.BufferedReader;
import java.io.FileReader;
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

    public static ArrayList<Coche> generarCoches(String path){
        ArrayList<Coche> datos = new ArrayList<>();

        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            String linea;
            while((linea = br.readLine()) != null){
                String[] valores = linea.split(",");
                String marca = valores[0];
                int anio = Integer.parseInt(valores[1]);
                String color = valores[2];
                datos.add(new Coche(marca, anio, color));
            }

        } catch (Exception e) {
            throw new RuntimeException("Error procesando el archivo", e);
        }

        return datos;
    }

    public static void addCoche(ArrayList<Coche> coches, String marca, int anio, String color){
        coches.add(new Coche(marca, anio, color));
    }
}
