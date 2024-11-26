import java.util.Scanner;
public class Coche extends Vehiculo{
    private final int numPuertas;
    public Coche(String marca, String modelo, int numPuertas){
        super(marca, modelo);
        this.numPuertas = numPuertas;
    }

    @Override
    public void encenderMotor() {
        System.out.println("Motor encendido: brum brum");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Numero de puertas: " + this.numPuertas);
    }

    public void abrirPuertas(){
        for(int i = 1; i <= this.numPuertas; i++){
            System.out.println("Abriendo puerta "+ i);
        }
        if(this.numPuertas > 2){
            System.out.println("Este coche tiene mas de 2 puertas");
        }
    }

    public static Coche crearCochePorConsola(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la marca del coche: ");
        String marca = scanner.nextLine();
        System.out.println("Introduzca el modelo del coche: ");
        String modelo = scanner.nextLine();
        System.out.println("Introduzca el numero de puertas: ");
        int numPuertas = scanner.nextInt();
        scanner.close();
        return new Coche(marca, modelo, numPuertas);
    }

}
