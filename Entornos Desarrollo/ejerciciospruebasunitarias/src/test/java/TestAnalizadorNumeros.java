import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class TestAnalizadorNumeros {

    @Test
    public void testContarMayoresQueUmbral(){
        int[] array = {2,14,10,20};
        int res = AnalizadorNumeros.contarMayoresQueUmbral(array, 9);
        assertEquals(2, res);
    }

    @Test
    public void testCalcularFactorial(){
        int rest = AnalizadorNumeros.calcularFactorial(3);
        assertEquals(6, rest);
        assertThrows(IllegalArgumentException.class, () -> {
            AnalizadorNumeros.calcularFactorial(-2);
        }, "Se espera una excepción");
    }

    @Test
    public void testContarParesImpares(){
        int[] array = {1,2,3,4,5,6,7};
        String res = AnalizadorNumeros.contarParesImpares(array);
        assertEquals("Pares: 3, Impares: 4", res);
    }

    @Test
    public void testCalcularPromedio(){
        int[] array = {1,2,3,4,5,6,7};
        int[] vacio = {};
        double res = AnalizadorNumeros.calcularPromedio(array);
        assertEquals(4.0, res);
        assertThrows(IllegalArgumentException.class, () -> {
            AnalizadorNumeros.calcularPromedio(vacio);
        }, "Se espera una excepción");
    }

    @Test
    public void testOrdenarAscendente(){
        int[] array = {5,4,3,2,1};
        int[] arrayOrdenado = {1,2,3,4,5};
        int[] res = AnalizadorNumeros.ordenarAscendente(array);
        assertEquals(arrayOrdenado, res);
    }
}

