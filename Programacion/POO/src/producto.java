import java.util.Scanner;
public class producto {
    Scanner scanner = new Scanner(System.in);
    private String nombre_producto;
    private double precio_producto;
    private int cantidad_producto;

    public producto(){
        System.out.println("Has creado un producto");
    }
    public producto(String nombre_producto, double precio_producto){
        this.nombre_producto = nombre_producto;
        this.precio_producto = precio_producto;
        System.out.println("Has creado un producto");
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public double getPrecio_producto() {
        return precio_producto;
    }

    public void setPrecio_producto(double precio_producto) {
        this.precio_producto = precio_producto;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public void comprarProducto(){
        System.out.println("Introduzca la cantidad de "+this.nombre_producto +": ");
        int cantidad = scanner.nextInt();
        setCantidad_producto(cantidad);
    }
}
