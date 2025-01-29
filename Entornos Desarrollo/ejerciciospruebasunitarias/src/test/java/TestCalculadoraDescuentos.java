import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class TestCalculadoraDescuentos {
    @Test
    public void testAplicarDescuento(){
        double res = CalculadoraDescuentos.aplicarDescuento(100.00, 10.0);
        assertEquals(90.0, res);
        assertThrows(IllegalArgumentException.class, () -> {
            CalculadoraDescuentos.aplicarDescuento(100.0, -10.0);
        }, "Se espera una excepción");
    }
}
