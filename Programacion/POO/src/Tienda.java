import java.util.Scanner;
import java.util.Random;
public class Tienda {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    private producto p1 = new producto("Cerveza Alhambra", 2.8);
    private producto p2 = new producto("Coca-Cola",2.9);
    private producto p3 = new producto("Nestea",3.2);
    private producto p4 = new producto("Aquarius",3.0);
    private producto p5 = new producto("Tapas extra", 1.5);
    private int iva = 21;
    public void muestraProductos(){
        System.out.println(this.p1.getNombre_producto()+" "+ this.p1.getPrecio_producto()+"€");
        System.out.println(this.p2.getNombre_producto()+" "+ this.p2.getPrecio_producto()+"€");
        System.out.println(this.p3.getNombre_producto()+" "+ this.p3.getPrecio_producto()+"€");
        System.out.println(this.p4.getNombre_producto()+" "+ this.p4.getPrecio_producto()+"€");
        System.out.println(this.p5.getNombre_producto()+" "+ this.p5.getPrecio_producto()+"€");
    }

    public void compra(){
        System.out.println("Introduzca la cantidad de "+ this.p1.getNombre_producto()+ ": ");
        int c1 = scanner.nextInt();
        this.p1.setCantidad_producto(c1);
        System.out.println("Introduzca la cantidad de "+ this.p2.getNombre_producto()+ ": ");
        int c2 = scanner.nextInt();
        this.p2.setCantidad_producto(c2);
        System.out.println("Introduzca la cantidad de "+ this.p3.getNombre_producto()+ ": ");
        int c3 = scanner.nextInt();
        this.p3.setCantidad_producto(c3);
        System.out.println("Introduzca la cantidad de "+ this.p4.getNombre_producto()+ ": ");
        int c4 = scanner.nextInt();
        this.p4.setCantidad_producto(c4);
        System.out.println("Introduzca la cantidad de "+ this.p5.getNombre_producto()+ ": ");
        int c5 = scanner.nextInt();
        this.p5.setCantidad_producto(c5);
    }
    public double calculaTotalBasico(){
        return p1.getPrecio_producto() * p1.getCantidad_producto() + p2.getPrecio_producto() * p2.getCantidad_producto() + p3.getPrecio_producto() * p3.getCantidad_producto() + p4.getPrecio_producto() * p4.getCantidad_producto() + p5.getPrecio_producto() * p5.getCantidad_producto();
    }

    public double calculaIvaRepercutido(){
        return calculaTotalBasico() * (this.iva / 100.0);
    }

    public double totalConIva(){
        return calculaTotalBasico() - calculaIvaRepercutido();
    }

    public int descuentoRandom(){
        return random.nextInt(9)+1;
    }

}
