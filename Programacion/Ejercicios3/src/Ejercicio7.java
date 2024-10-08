import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jugador 1: Introduzca su elección:");
        System.out.println("1 Piedra\n2 Papel\n3 Tijera\n4 Lagarto\n5 Spock\n ");
        int opc1 = scanner.nextInt();
        System.out.println("Jugador 2: Introduzca su elección:");
        System.out.println("1 Piedra\n2 Papel\n3 Tijera\n4 Lagarto\n5 Spock\n ");
        int opc2 = scanner.nextInt();
        if (opc1 > 5 || opc1 <= 0 || opc2 > 5 || opc2 <= 0){
            System.out.println("Error de selección.");
            return;
        }
        boolean ganador = true;
        switch(opc1){
            case 1:
                if (opc2 == 2 || opc2 == 5){
                    ganador = false;
                }
                break;
            case 2:
                if (opc2 == 3 || opc2 == 4){
                    ganador = false;
                }
                break;
            case 3:
                if (opc2 == 1 || opc2 == 5){
                    ganador = false;
                }
                break;
            case 4:
                if (opc2 == 1 || opc2 == 3){
                    ganador = false;
                }
                break;
            case 5:
                if (opc2 == 2 || opc2 == 4){
                    ganador = false;
                }
                break;
        }

        if (ganador){
            System.out.println("Gana el Jugador 1");
        } else {
            System.out.println("Gana el jugador 2");
        }
    }
}
