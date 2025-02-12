package documentacion;

/**
 * Consiste en un producto con nombre, precio y stock.
 * Permite gestionar su venta, aumento de stock y disponibilidad.
 *
 * @author [Jose Maria Fernandez Saavedra]
 * @version 1.0.
 * @since 2025.
 */
public class Producto {
    /** Nombre del producto. */
    private String nombre;

    /** Precio del producto en decimales. */
    private double precio;

    /** Cantidad de stock del producto. */
    private int cantidadDisponible;

    /**
     * Constructor para crear un nuevo producto.
     *
     * @param nombre Nombre del producto.
     * @param precio Precio del producto.
     * @param cantidadDisponible Stock inicial del producto.
     */
    public Producto(String nombre, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    /**
     * Constructor que inicializa el producto con su nombre los valores por defecto a 0.
     *
     * @param nombre Nombre del producto.
     */
    public Producto(String nombre) {
        this(nombre, 0, 0);
    }

    /**
     * Devuelve el nombre del producto.
     *
     * @return nombre nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el precio del producto.
     *
     * @return precio precio del producto.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto.
     *
     * @param precio Nuevo precio del producto.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Devuelve el stock disponible del producto.
     *
     * @return cantidadDisponible cantidad disponible del producto.
     */
    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    /**
     * Incrementa el stock del producto.
     *
     * @param cantidad Cantidad que aumenta el stock del producto.
     */
    public void incrementarStock(int cantidad) {
        cantidadDisponible += cantidad;
    }

    /**
     * Vende una cantidad especifica de producto, reduce el stock disponible.
     *
     * @param cantidad Cantidad de producto vendida, a reducir del stock.
     * @throws IllegalArgumentException si se intenta vender mas cantidad de la que hay en stock.
     */
    public void vender(int cantidad) {
        if (cantidad <= cantidadDisponible) {
            cantidadDisponible -= cantidad;
        } else {
            throw new IllegalArgumentException("Cantidad vendida excede la cantidad disponible");
        }
    }

    /**
     * Comprueba la disponibilidad del producto, si el stock es mayor que 0.
     *
     * @return true si el stock es mayor que 0, false en caso contrario.
     */
    public boolean estaDisponible() {
        return cantidadDisponible > 0;
    }

    /**
     * Representa el producto en forma de cadena de texto.
     *
     * @return Una cadena de texto con los datos del producto.
     */
    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidadDisponible=" + cantidadDisponible +
                '}';
    }
}
