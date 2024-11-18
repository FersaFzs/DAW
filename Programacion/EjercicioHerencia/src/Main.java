public class Main {
    public static void main(String[] args) {
        // Crear la lavadora AEG
        Lavadora lavadoraAEG = new Lavadora(400, Color.PLATEADO, "PK", 30, 7);
        System.out.println("Lavadora AEG:");
        System.out.println(lavadoraAEG.toString());
        System.out.println("Precio final: " + lavadoraAEG.precioFinal() + " Euros");
        System.out.println();

        // Crear la televisión Samsung con valores por defecto
        Television tvSamsung = new Television(Color.BLANCO, "A", 100, 10, 20, false);
        System.out.println("TV Samsung (por defecto):");
        System.out.println(tvSamsung.toString());
        System.out.println("Precio final: " + tvSamsung.precioFinal() + " Euros");
        System.out.println();

        // Cambiar características de la TV Samsung
        tvSamsung = new Television(Color.NEGRO, "A+", 190, 10, 24, true);
        System.out.println("TV Samsung (cambiada):");
        System.out.println(tvSamsung.toString());
        System.out.println("Precio final: " + tvSamsung.precioFinal() + " Euros");
    }
}
