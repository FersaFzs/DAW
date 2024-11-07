
public class cliente {
    private String nombre_cliente;

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public cliente(){
        System.out.println("Has creado un cliente");
    }

    public cliente(String nombre_cliente){
        this.nombre_cliente = nombre_cliente;
        System.out.println("Has creado un cliente");
    }
    public String nombreCorto(){
        int primer_espacio = this.nombre_cliente.indexOf(" ");
        return this.nombre_cliente.substring(0, primer_espacio);
    }
}
