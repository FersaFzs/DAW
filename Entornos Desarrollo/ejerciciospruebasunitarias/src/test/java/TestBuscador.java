import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestBuscador {
    @Test
    public void testBuscarPrimerPar(){
        int[] array ={1,3,4,5,6,7};
        int res = Buscador.buscarPrimerPar(array);
        assertEquals(4, res);
    }

    @Test
    public void testEsPalindromo(){
        boolean res = Buscador.esPalindromo("salas");
        assertTrue(res);
    }
}
