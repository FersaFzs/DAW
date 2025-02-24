import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    public ArrayList<Libro> buscaPorAutor(String autor){
        ArrayList<Libro> libroPorAutor = new ArrayList<>();
        for (Libro libro : libros){
            if (libro.getAutor().equals(autor)){
                libroPorAutor.add(libro);
            }
        }
        return libroPorAutor;
    }

    public ArrayList<Libro> buscaPorAnio(int anio){
        ArrayList<Libro> buscaPorAnio = new ArrayList<>();
        for (Libro libro : libros){
            if (libro.getAnio()==anio){
                buscaPorAnio.add(libro);
            }
        }
        return buscaPorAnio;
    }

    public ArrayList<Libro> listarPorAnio(int anio) {
        ArrayList<Libro> listarPorAnio = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAnio() > anio) {
                listarPorAnio.add(libro);
            }
        }
        return listarPorAnio;
    }

    public void mostrarLibros(){
        if (libros.isEmpty()){
            System.out.println("No hay libros en la biblioteca");
        }else {
            for(Libro libro : libros){
                System.out.println(libro);
            }
        }
    }
}
