public class Lavadora extends Electrodomestico{
    private int carga = 5;

    public Lavadora(double precio, String color, String consumo, int peso, int capacidad){
        super(precio, color, consumo, peso);
        this.carga = capacidad;
    }


}
