import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio_Random {
    public static void main(String[] args) {
        Random generador = new Random();
        int dado = generador.nextInt(6)+1;
        System.out.println(dado);
        }
    }