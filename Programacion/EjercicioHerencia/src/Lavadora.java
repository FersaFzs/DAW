public class Lavadora extends Electrodomestico{
    private int carga = 5;

    public Lavadora(double precio, Color color, String consumo, int peso, int capacidad){
        super(precio, color, consumo, peso);
        this.carga = capacidad;
    }

    public Lavadora(){
        super();
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" + "Carga: " + this.carga + " kg";
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if(this.carga > 6){
            precioFinal += 50;
        }
        return precioFinal;
    }
}
