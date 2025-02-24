import java.util.HashMap;
import java.util.Map;


public class Inventario {
    private Map<Integer,Producto> invent;

    public Inventario (){
        this.invent = new HashMap<>();
    }

    //Implementa métodos para agregar productos, actualizar la cantidad de un producto y listar
    //productos con stock bajo

    public void AgregarProducto (Producto proAdd){
        invent.put(proAdd.getId(),proAdd);
    }

    public void ActualizarCantidad ( Producto actCant, int cantidad){
        if(invent.containsKey(actCant.getId())){
            invent.get(actCant.getId()).setCantidad(cantidad);
        }
        else {
            System.out.println("El producto no existe");
        }
    }
    public void listarProductos(){
        for(Map.Entry<Integer,Producto> entrada : invent.entrySet()){
            if(entrada.getValue().getCantidad() <= 5){
                System.out.println(entrada);
            }
        }
    }


}
