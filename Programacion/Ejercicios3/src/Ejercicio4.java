import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una fecha: ");
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int anio = scanner.nextInt();
        boolean valido = false;

        switch (mes){
            case 1:
                if (31 >= dia && dia > 0)
                    valido = true;
                break;
            case 2:
                if (28 >= dia && dia > 0)
                    valido = true;
                break;
            case 3:
                if (31 >= dia && dia > 0)
                    valido = true;
                break;
            case 4:
                if (30 >= dia && dia > 0)
                    valido = true;
                break;
            case 5:
                if (31 >= dia && dia > 0)
                    valido = true;
                break;
            case 6:
                if (30 >= dia && dia > 0)
                    valido = true;
                break;
            case 7:
                if (31 >= dia && dia > 0)
                    valido = true;
                break;
            case 8:
                if (31 >= dia && dia > 0)
                    valido = true;
                break;
            case 9:
                if (30 >= dia && dia > 0)
                    valido = true;
                break;
            case 10:
                if (31 >= dia && dia > 0)
                    valido = true;
                break;
            case 11:
                if (30 >= dia && dia > 0)
                    valido = true;
                break;
            case 12:
                if (31 >= dia && dia > 0)
                    valido = true;
                break;
        }
        if ((anio % 4 == 0&& anio % 100 != 0) ||(anio % 400 == 0)){
            if(mes == 2 && dia == 29){
                valido = true;
            }
        }
        if (valido){
            System.out.println("Fecha válida");
        } else {
            System.out.println("Fecha no válida");
        }
    }
}
