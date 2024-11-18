public class Television extends Electrodomestico{
    private int resolucion;
    private boolean netflix = false;

    public Television(Color color, String consumo, double precio, int peso, int resolucion, boolean netflix){
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.netflix = netflix;
    }

    public Television(){
        super();
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isNetflix() {
        return netflix;
    }

    @Override
    public String toString(){
        return super.toString() + "\n" +
                "Resolución: " + this.resolucion + " pulgadas\n" +
                "Netflix: " + (this.netflix ? "Sí" : "No");
    }

    @Override
    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if(this.resolucion > 20){
            precioFinal += super.getPrecioBase()*0.3;
        }
        if(this.netflix){
            precioFinal += 60;
        }
        return precioFinal;
    }
}
