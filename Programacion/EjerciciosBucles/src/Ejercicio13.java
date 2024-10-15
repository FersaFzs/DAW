import java.util.Scanner;
import java.util.Random;
public class Ejercicio13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String caracteres = "asdfghjklqwertyuiopzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
        String password = "";
        for(int i = 0; i < 8; i++){
            int n = random.nextInt(caracteres.length());
            password += caracteres.charAt(n);
        }
        System.out.println("la password es: "+password);

    }
}
