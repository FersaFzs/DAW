import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         int n = 0;
         while(n != 3){
             System.out.println("MENU:\n1: Contar caracteres\n2: Invertir cadena\n3: Salir\nIntroduzca número de opción: ");
             n = scanner.nextInt();
             switch(n){
                 case 1:
                     System.out.println("Introduzca una cadena: ");
                     scanner.nextLine();
                     String cadena1 = scanner.nextLine();
                     int contador = 0;
                     for(int i = 0; i < cadena1.length(); i++){
                         contador++;
                     }
                     System.out.println("La cadena tiene "+contador+" caracteres");
                     break;
                 case 2:
                     System.out.println("Introduzca una cadena: ");
                     scanner.nextLine();
                     String cadena2 = scanner.nextLine();
                     String cadenaInversa = "";
                     for(int i = cadena2.length(); i > 0; i--){
                         //hago esto para no usar el StringBuilder ni .append()
                         cadenaInversa += cadena2.substring(i-1, i);
                     }
                     System.out.println("La cadena invertida es: "+cadenaInversa);
                     break;
                 case 3:
                     System.out.println("Saliendo del programa...");
                     break;
                 default:
                     System.out.println("Ese valor no corresponde a una opción. ");
                     break;
             }
         }
    }
}
