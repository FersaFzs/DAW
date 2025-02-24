public class Habitacion {
    private int numero;
    private String tipo;
    private double precio;
    private boolean estado;

    public Habitacion(int numero, String tipo, double precio) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
        this.estado = true;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "numero=" + numero +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                ", estado=" + estado +
                '}';
    }
}