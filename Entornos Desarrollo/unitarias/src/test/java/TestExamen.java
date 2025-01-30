import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestExamen {

    @Test
    public void testCalcularFactorial() {
        assertThrows(IllegalArgumentException.class, () ->
        Examen.calcularFactorial(-7));
        int res = Examen.calcularFactorial(3);
        assertEquals(6, res);
    }

    @Test
    public void testInvertirArray(){
        int[] array = {1,2,3,4,5};
        int[] resultado = {5,4,3,2,1};
        assertArrayEquals(resultado, Examen.inventirArray(array));
    }

    @Test
    public void testContarCambios(){
        int res = Examen.contarCambios(new int[]{1,2,-3,-2,4});
        assertEquals(2, res);
    }

    @Test
    public void testPosicionPrimerNegativo(){
        int res = Examen.posicionPrimerNegativo(new int[]{1,2,-3,5,8});
        assertEquals(2, res);
        int res2 = Examen.posicionPrimerNegativo(new int[]{1,2,-3,5,-8});
        assertEquals(2, res2);
    }
}
