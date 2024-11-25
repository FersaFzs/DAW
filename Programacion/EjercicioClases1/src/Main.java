
//Main de prueba para comprobar si funciona
public class Main {
    public static void main(String[] args) {
        int numProductos = 0;
        Tienda impresora = new Tienda("Impresora HP", 100, 21, 5);
        numProductos++;
        Tienda raton = new Tienda("Ratón Logitech");
        Tienda libro = new Tienda("Libro Stephen Hawking", 20, 4, 15);
        Tienda teclado = new Tienda("Teclado razer", 60, 21, 20);

        System.out.println(impresora);
        System.out.println(raton);
        System.out.println(libro);
        System.out.println(teclado);
        System.out.println("Número de productos: " + Tienda.getNumeroProductos());
        System.out.println();

        //descuento global del 10%
        Tienda.setDescuentoGlobal(10);

        //cambiar precio raton
        raton.setPrecio(12);

        // Mostrar los productos después de aplicar el descuento
        System.out.println(impresora);
        System.out.println(raton);
        System.out.println(libro);
        System.out.println(teclado);
        System.out.println("Número de productos: " + Tienda.getNumeroProductos());
    }
}
