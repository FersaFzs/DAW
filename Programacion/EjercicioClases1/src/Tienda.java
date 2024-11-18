public class Tienda {
    private String producto;
    private double precio;
    private double iva;
    private double descuento;

    private static int numeroProductos = 0; //static porque queremos que el numero de productos sea de tienda en general, no de cada objeto tienda que creemos
    private static double descuentoGlobal = 0; //static porque queremos que se pueda aplicar a todos los productos

    public Tienda(String producto, double precio, double iva, double descuento) {
        this.producto = producto;
        this.precio = precio;
        this.iva = iva;
        this.descuento = descuento;
        numeroProductos++;
    }

    public Tienda(String producto) {
        this(producto, 10, 21, 0);
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public static int getNumeroProductos() {
        return numeroProductos;
    }

    public static void setDescuentoGlobal(double descuentoGlobal) {
        Tienda.descuentoGlobal = descuentoGlobal;
    }

    public double calcularPrecio() {
        double descuentoAplicado = Math.max(this.descuento, descuentoGlobal); //uso el Math pero se puede hacer con una condición
        double precioConDescuento = precio * (1 - descuentoAplicado / 100);

        return precioConDescuento * (1 + iva / 100);
    }

    @Override
    public String toString() {
        return "Producto: " + producto + "\n" +
                "Precio: " + precio + " €\n" +
                "IVA: " + iva + "%\n" +
                "Descuento: " + descuento + "%\n" +
                "Precio final: " + calcularPrecio() + " €";
    }

}

