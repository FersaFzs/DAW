import java.util.HashMap;
import java.util.Map;

public class Ej2 {
    static HashMap<String, Producto> productos = new HashMap<>();

    static void agregarProductos(String ID, String nombre, double precio, int cant){
        productos.put(ID, new Producto(nombre, precio, cant));
    }

    static void actualizarCantidad(String ID, int NuevaCantidad){
        if(productos.containsKey(ID)){
            productos.get(ID).setCantidadDisponible(NuevaCantidad);
        }
    }

    static void consultarPrecio(String ID){
        if(productos.containsKey(ID)){
            System.out.println("El producto " + ID + " tiene un precio de: "+productos.get(ID).getPrecio()+"€");
        }
    }

    static void mostrarInventario(){
        for(Map.Entry<String, Producto> producto : productos.entrySet()){
            System.out.println("ID: "+producto.getKey()+" "+ producto.getValue().toString());
        }
    }
}
