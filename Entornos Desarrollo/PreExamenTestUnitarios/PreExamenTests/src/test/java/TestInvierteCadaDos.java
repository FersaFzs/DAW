import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class TestInvierteCadaDos {

    @Test
    public void testInvierteCada2(){
        double[] prueba1 = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] resultado1 = {2.0,1.0,4.0,3.0,5.0};
        double[] prueba2 = {1.0,2.0, 3.0, 4.0};
        double[] resultado2 = {2.0,1.0,4.0,3.0};
        assertArrayEquals(resultado1, InvierteCadaDos.invierte_cada_2(prueba1));
        assertArrayEquals(resultado2, InvierteCadaDos.invierte_cada_2(prueba2));
    }
}
