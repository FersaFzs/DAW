import java.util.Random;
import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random generador = new Random();

        //CON IDEA DE ORGANIZAR Y SEPARAR EL CODIGO
        //DEFINIR LAS VARIABLES (FINAL SI PROCEDE) NECESARIAS AQUI ARRIBA
        //%DEL IVA ... ETC
        //PRECIOS DE LOS PRODUCTOS NOMBRES DE LOS PRODUCTOS,ETC...
        //VARIABLES PARA EL DESCUENTO ALEATORIO

        //=====================================================================

        //ASIGNAR EL NOMBRE DE LOS PRODUCTOS
        final String nombre_producto1 = "Cerveza Alhambra";
        final String nombre_producto2 = "Coca-Cola";
        final String nombre_producto3 = "Nestea";
        final String nombre_producto4 = "Aquarius";
        final String nombre_producto5 = "Tapas extra";

        //ASIGNAR EL PRECIO DE LOS PRODUCTOS
        final double precio_producto1 = 2.8;
        final double precio_producto2 = 2.9;
        final double precio_producto3 = 3.2;
        final double precio_producto4 = 3.0;
        final double precio_producto5 = 1.5;

        //IVA
        final int iva = 21;

        //=====================================================================
        //IMPRIMIR EL MENSAJE DE BIENVENIDA

        System.out.println("BIENVENIDO ESTIMAD@ CLIENTE!");
        System.out.println("Tome asiento, pronto será atendido: ");

        //IMPRIMIR EL LOGOTIPO
        System.out.println("     .~~~~~~~~~.     ");
        System.out.println("    /           /    ");
        System.out.println("   |             |   ");
        System.out.println("   |   🍺BAR🍺   |   ");
        System.out.println("    /           /    ");
        System.out.println("      /        /     ");
        System.out.println("         |   |       ");
        System.out.println("         |   |       ");
        System.out.println("         |   |       ");
        System.out.println("      ___/___/___    ");

        //IMPRIMIR TABLA DE PRODUCTOS CON SUS PRECIOS
        System.out.println(nombre_producto1 + " " + precio_producto1 + "€");
        System.out.println(nombre_producto2 + " " + precio_producto2 + "€");
        System.out.println(nombre_producto3 + " " + precio_producto3 + "€");
        System.out.println(nombre_producto4 + " " + precio_producto4 + "€");
        System.out.println(nombre_producto5 + " " + precio_producto5 + "€");

        //PEDIR LA CANTIDAD QUE EL CLIENTE QUIERE COMPRAR DE CADA PRODUCTO
        System.out.print("Introduzca la cantidad de " + nombre_producto1 + ": ");
        int cantidad_producto1 = teclado.nextInt();
        System.out.print("Introduzca la cantidad de " + nombre_producto2 + ": ");
        int cantidad_producto2 = teclado.nextInt();
        System.out.print("Introduzca la cantidad de " + nombre_producto3 + ": ");
        int cantidad_producto3 = teclado.nextInt();
        System.out.print("Introduzca la cantidad de " + nombre_producto4 + ": ");
        int cantidad_producto4 = teclado.nextInt();
        System.out.print("Introduzca la cantidad de " + nombre_producto5 + ": ");
        int cantidad_producto5 = teclado.nextInt();
        //SUPONEMOS QUE EL CLIENTE NO ESCRIBE NUMEROS NEGATIVOS

        //PREGUNTAR EL NOMBRE AL CLIENTE PARA LA FACTURA
        System.out.println("Introduzca su nombre completo: ");
        String nombre_completo_cliente = "";
        nombre_completo_cliente = teclado.nextLine();

        //====================================================================
        //CALCULAR TODO LO NECESARIO DE LA FORMA QUE ESTIMEIS OPORTUNA
        double total_basico = (precio_producto1 * cantidad_producto1) + (precio_producto2 * cantidad_producto2) + (precio_producto3 * cantidad_producto3) + (precio_producto4 * cantidad_producto4) + (precio_producto5 * cantidad_producto5);
        double iva_repercutido = total_basico * (iva / 100.0);
        double total_con_iva = total_basico - iva_repercutido;

        //Valor aleatorio de descuento
        int descuento = generador.nextInt(6)+5;
        double valor_descontado = total_con_iva * (descuento /100.0);
        double total_final = total_con_iva - valor_descontado;

        //Sacar nombre
        //Buscamos el primer espacio:
        int primer_espacio = nombre_completo_cliente.indexOf(" ");
        //Desde el principio hasta el primer espacio es el nombre (o primer nombre)
        String nombre_cliente = nombre_completo_cliente.substring(0, primer_espacio);

        //====================================================================
        //SR/SRA AQUI TIENE SU FACTURA
        System.out.println("Sr/Sra " + nombre_cliente +" aquí tiene el resumen de la factura: ");
        //MOSTRAR EL RESUMEN DE LA FACTURA
        //NOMBRE DEL CLIENTE
        System.out.println("Nombre cliente: "+ nombre_completo_cliente.toUpperCase());
        //CUANTO COMPRÓ DE CADA PRODUCTO
        System.out.println(nombre_producto1 + ": " + cantidad_producto1);
        System.out.println(nombre_producto2 + ": " + cantidad_producto2);
        System.out.println(nombre_producto3 + ": " + cantidad_producto3);
        System.out.println(nombre_producto4 + ": " + cantidad_producto4);
        System.out.println(nombre_producto5 + ": " + cantidad_producto5);
        //TOTAL SIN IVA
        System.out.println("Total sin IVA: "+ total_basico);
        ///%IVA APLICADO
        System.out.println("IVA aplicado: " + iva +"%");
        //EL IVA QUE SE APLICA AL TOTAL EN BASE AL PORCENTAJE ANTERIOR
        System.out.println("IVA repercutido: "+ iva_repercutido + "€");
        //TOTAL CON IVA
        System.out.println("Total con IVA: "+total_con_iva+"€");
        //DESCUENTO ALEATORIO
        System.out.println("Descuento por 1ª vez: "+descuento+"%");
        //DESCUENTO APLICADO
        System.out.println("Valor descontado: "+valor_descontado+"€");
        //PRECIO FINAL
        System.out.println("Total final: "+total_final+"€");
        //IMPRIMIR MENSAJE DE DESPEDIDA
        System.out.println("Muchas gracias por su visita!");
    }
}
