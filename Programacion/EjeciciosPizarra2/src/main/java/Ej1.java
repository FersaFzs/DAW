import java.util.HashMap;
import java.util.Map;

public class Ej1 {
    static HashMap<String, Integer> contactos = new HashMap<>();

    public static void agregarContacto(String nombre, int tlf){
        contactos.put(nombre, tlf);
    }

    public static void buscarTelefono(String nom){
            if(contactos.containsKey(nom)){
                System.out.println("El número de "+ nom +" es "+ contactos.get(nom));
            } else {
                System.out.println("No existe un contacto con ese nombre");
            }
    }

    public static void mostrarContactos(){
        for(Map.Entry<String, Integer> contacto : contactos.entrySet()){
            System.out.println("Nombre: "+contacto.getKey()+" Teléfono: "+contacto.getValue());
        }
    }
}
