import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tus credenciales:\nUsuario: ");
        String usuario = "";
        usuario = scanner.nextLine();
        System.out.println("Contraseña: ");
        String password = scanner.nextLine();

        if (usuario.equals("admin") && password.equals("1234")){
            System.out.println("Administrador, acceso concedido");
        } else if(usuario.equals("user") && password.equals("abcd")){
            System.out.println("Usuario, acceso concedido");
        } else if(usuario.equals("guest") && password.equals("xyz")){
            System.out.println("Invitado, acceso concedido");
        } else{
            System.out.println("Acceso denegado");
        }
    }
}
