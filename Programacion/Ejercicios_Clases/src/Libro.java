import java.util.Scanner;

public class Libro extends Publicacion{
    private String autor;
    private String isbn;

    public Libro(String t1, int mp, String autor, String isbn){
        super(t1, mp);
        this.autor = autor;
        this.isbn = isbn;
    }

    @Override
    public void muestraInfo(){
        super.muestraInfo();
        System.out.println("Autor: "+ this.autor);
        System.out.println("isbn: "+ this.isbn.toUpperCase());
    }

    public static Libro crearLibroConsola(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dime el titulo: ");
        String titulo = scanner.nextLine();
        System.out.println("Dime el numero de paginas: ");
        int np = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Dime el autor: ");
        String autor = scanner.nextLine();
        System.out.println("Dime el isbn: ");
        String isbn = scanner.nextLine();

        return new Libro(titulo,np,autor,isbn);
    }

}
