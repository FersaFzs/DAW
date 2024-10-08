import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULADORA:");
        System.out.println("Introduzca el primer valor: ");
        double n1 = scanner.nextDouble();
        System.out.println("Introduzca el operador: \nSuma + \rResta - \rMultiplicación *\nDivisión /\nPotencia ^\nRaíz Cuadrada <<root>>\nFactorial !\n");
        scanner.nextLine();
        String operador = scanner.nextLine();
        System.out.println("Introduzca el segundo valor: ");
        double n2 = scanner.nextDouble();
        double resultado = 0;
        switch (operador){
            case "+":
                resultado = n1 + n2;
                break;
            case "-":
                resultado = n1 - n2;
                break;
            case "*":
                resultado = n1 * n2;
                break;
            case "/":
                resultado = n1 / n2;
                break;
            case "%":
                resultado = n1 % n2;
                break;
            case "^":
                resultado = Math.pow(n1,n2);
                break;
            case "root":
                resultado = Math.sqrt(n1);
                System.out.println("La raiz cuadrada de " + n1 + " es: ");
                break;
            case "!":
                for(int i = 1; i <= n1; i++){
                    resultado += i;
                }
                System.out.println("El factorial de " + n1 + " es: ");
                break;
        }
        System.out.println(resultado);
    }
}
