import java.util.Scanner;
public class Perro extends Animal{
    private final String raza;

    public Perro(String nombre, String especie, String raza){
        super(nombre, especie);
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("GUAU");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Raza: "+ this.raza);
    }

    public void moverCola(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero de veces que mueve la cola: ");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("El perro esta moviendo la cola");
        }
    }

    public static Perro crearPerroPorConsola(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Introduce la especie: ");
        String especie = sc.nextLine();
        System.out.println("Introduce la raza: ");
        String raza = sc.nextLine();
        return new Perro(nombre, especie, raza);
    }
}
