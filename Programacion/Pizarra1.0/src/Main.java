import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Libro libro1 = new Libro("Harry Potter", "JK Rolliw",1999);
        Libro libro2 = new Libro("Harry Potter 2 ", "JK Rolliw",1999);
        Libro libro3 = new Libro("Manifiesto Comunista", "MArx",1888);
        Libro libro4 = new Libro("Señor de los anillos", "tolkien",1956);

        ArrayList<Libro> coleccion = new ArrayList<>();

        coleccion.add(libro1);
        coleccion.add(libro2);
        coleccion.add(libro3);
        coleccion.add(libro4);

        Biblioteca biblioteca1 = new Biblioteca(coleccion);
        System.out.println(biblioteca1.buscaPorAnio(1999));
        System.out.println(biblioteca1.buscaPorAutor("MArx"));
        System.out.println(biblioteca1.listarPorAnio(1888));

    }
}