import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 3: Gestión de Inventario
        //Descripción: Crea una clase Producto con atributos como id, nombre, precio y cantidad. Luego,
        //crea una clase Inventario que use un Map para almacenar productos (usando el id como clave).
        //Implementa métodos para agregar productos, actualizar la cantidad de un producto y listar
        //productos con stock bajo

        Producto p1 = new Producto(1,"cafe1",23,1);

        Inventario i1 = new Inventario();

        i1.AgregarProducto(p1);

        i1.ActualizarCantidad(p1,6);

        i1.listarProductos();

    }
}
