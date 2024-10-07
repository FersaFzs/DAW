import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el tipo de cliente (regular, premium o VIP): ");
        String tipo = scanner.nextLine();
        System.out.println("Introduzca el precio del producto");
        double precio = scanner.nextDouble();


        if (tipo.equals("regular")){
            precio -= precio * 0.05;
        } else if(tipo.equals("premium")){
            precio -= precio * 0.1;
        } else if(tipo.equals("VIP")){
            if (precio >= 500){
                precio -= precio * 0.25;
            } else {
                precio -= precio * 0.2;
            }
        } else {
            System.out.println("Tipo de cliente no válido.");
        }
        System.out.println("Su precio se ha quedado en: " + precio);
    }
}
