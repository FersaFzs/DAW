import java.util.Scanner;
public class Gato extends Animal{
    private final boolean tieneCola;

    public Gato(String nombre, String especie, boolean tieneCola){
        super(nombre, especie);
        this.tieneCola = tieneCola;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        if(this.tieneCola){
            System.out.println("Tiene cola");
        } else {
            System.out.println("No tiene cola");
        }
    }

    @Override
    public void hacerSonido() {
        System.out.println("MIAU");
    }

    public void saltar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número de saltos: ");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("El gato esta saltando");
        }
    }

    public static Gato crearGatoPorConsola(){
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Introduce el nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Introduce la especie: ");
        String especie = scanner.nextLine();
        System.out.println("Introduce true si el gato tiene cola, false si no tiene: ");
        boolean cola = scanner.nextBoolean();
        return new Gato(nombre, especie, cola);
    }
}
