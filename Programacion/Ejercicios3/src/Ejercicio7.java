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

        boolean ganador = true;
        switch(opc1){
            case 1:
                if (opc2 == 2){
                    ganador = false;
                    System.out.println("Papel cubre piedra");
                } else if (opc2 == 5) {
                    ganador = false;
                    System.out.println("Spock vaporiza piedra");
                }
                break;
            case 2:
                if (opc2 == 3){
                    ganador = false;
                    System.out.println("Tijeras cortan papel");
                } else if (opc2 == 4) {
                    ganador = false;
                    System.out.println("Lagarto come papel");
                }
                break;
            case 3:
                if (opc2 == 1){
                    ganador = false;
                    System.out.println("Piedra aplasta tijeras");
                } else if (opc2 == 5) {
                    ganador = false;
                    System.out.println("Spock rompe tijeras");
                }
                break;
            case 4:
                if (opc2 == 1){
                    ganador = false;
                    System.out.println("Piedra aplasta lagarto");
                } else if (opc2 == 3) {
                    ganador = false;
                    System.out.println("Tijeras decapitan lagarto");
                }
                break;
            case 5:
                if (opc2 == 2){
                    ganador = false;
                    System.out.println("Papel desautoriza Spock");
                } else if (opc2 == 4) {
                    ganador = false;
                    System.out.println("Lagarto envenena Spock");
                }
                break;
            default:
                System.out.println("Error de selección");
        }

        if (ganador){
            System.out.println("Gana el Jugador 1");
        } else {
            System.out.println("Gana el jugador 2");
        }
    }
}
