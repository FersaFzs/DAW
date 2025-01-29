import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class TestCalculadoraEstadísticas {
    @Test
    public void testSumaCuadradosPositivos(){
        int[] array = {1,-1,2,1};
        int res = OperacionesEstadisticas.sumaCuadradosPositivos(array);
        assertEquals(10, res);
    }

    @Test
    public void testProductoNegativos(){
        int[] array = {-2,1,7,-3};
        int res = OperacionesEstadisticas.productoNegativos(array);
        assertEquals(6, res);
    }

    @Test
    public void testEncontrarMinimo(){
        int[] array = {4,7,2,45};
        int res = OperacionesEstadisticas.encontrarMinimo(array);
        assertEquals(2, res);
    }

    @Test
    public void testCalcularRango(){
        int[] array = {-5,1,2,3,5};
        int[] arrayVacio = {};
        int res = OperacionesEstadisticas.calcularRango(array);
        assertEquals(10, res);
        assertThrows(IllegalArgumentException.class, () -> {
            OperacionesEstadisticas.calcularRango(arrayVacio);
        }, "Se espera una excepción");
    }
}
