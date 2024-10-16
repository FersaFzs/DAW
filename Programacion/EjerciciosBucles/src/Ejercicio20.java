import java.util.Scanner;
public class Ejercicio20{
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //se podría hacer poniendo i+=5 en la declaración del for pero el enunciado pone que se filtre con condicionales
        for(int i = 1; i <= 100; i++){
            if(i%5==0){
                System.out.println(i);
            }
        }
    }
}
