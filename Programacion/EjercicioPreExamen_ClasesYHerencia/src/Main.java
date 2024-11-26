public class Main {
    public static void main(String[] args) {
        System.out.println("Vamos a crear un coche: ");

        Coche coche1 = Coche.crearCochePorConsola();

        System.out.println("Coche creado");
        coche1.mostrarDetalles();
        coche1.endenderMotor();
        coche1.abrirPuertas();
    }
}