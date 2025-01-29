public class CalculadoraDescuentos {
    // Método que debería devolver el precio con descuento aplicado
    // Entrada -> precio original y porcentaje de descuento
    // Debería devolver el precio con descuento
    // Si el porcentaje no es correcto lanza una excepcion

    public static double aplicarDescuento(double precioOriginal, double porcentajeDescuento) {
        if (porcentajeDescuento < 0 || porcentajeDescuento > 100) {
            throw new IllegalArgumentException("El porcentaje de descuento debe estar entre 0 y 100.");
        }
        return precioOriginal - (precioOriginal * porcentajeDescuento / 100);
    }


}
