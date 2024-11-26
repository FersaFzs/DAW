
public class Main {
    public static void main(String[] args) {

        //Crear perros
        System.out.println("Vamos a crea un perro: ");
        Perro perro1 = Perro.crearPerroPorConsola();
        Perro perro2 = new Perro("Rodolfo", "Perro", "Mastin");

        //Muestra los perros
        System.out.println("\nSe han creado los perros: ");
        perro1.mostrarDetalles();
        System.out.println();
        perro2.mostrarDetalles();

        //Crear gatos
        System.out.println("\nVamos a crear un gato: ");
        Gato gato1 = Gato.crearGatoPorConsola();
        Gato gato2 = new Gato("Bilbo", "Gato", true);

        //Muestra los gatos
        System.out.println("\nSe han creado los gatos: ");
        gato1.mostrarDetalles();
        System.out.println();
        gato2.mostrarDetalles();

        //Acciones del perro
        System.out.println("\nQué hace el perro? ");
        perro1.hacerSonido();
        perro1.moverCola();

        //Acciones del gato
        System.out.println("\nQué hace el gato? ");
        gato1.hacerSonido();
        gato1.saltar();
    }
}