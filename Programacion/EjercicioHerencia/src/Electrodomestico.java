public class Electrodomestico {
    protected double precioBase = 100;
    protected String color = "blanco";
    protected String consumo = "A";
    protected int peso = 10;

    public Electrodomestico(double precio, String color, String consumo, int peso){
        this.precioBase = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public Electrodomestico(){}

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    private static String comprobarConsumoEnergetico(String consumo){
        return switch (consumo) {
            case "A+" -> consumo;
            case "A" -> consumo;
            case "B" -> consumo;
            case "C" -> consumo;
            case "D" -> consumo;
            case "E" -> consumo;
            case "F" -> consumo;
            default -> "A";
        };
    }
    @Override
    public String toString(){
        System.out.println("Preio base: "+ this.precioBase);
        System.out.println("Consumo energético: "+ this.consumo);
        System.out.println("Peso: "+ this.peso + "kg");
        return null;
    }

    public double precioFinal(){
        double precioFinal = this.precioBase;

        switch(consumo){
            case "A+" -> precioFinal += 120;
            case "A" -> precioFinal += 100;
            case "B" -> precioFinal += 80;
            case "C" -> precioFinal += 60;
            case "D" -> precioFinal += 50;
            case "E" -> precioFinal += 30;
            case "F" -> precioFinal += 10;
        };

        if(peso >= 0 && peso < 20){
            precioFinal+=10;
        }else if(peso >= 20 && peso < 50){
            precioFinal+=30;
        }else if(peso >= 50 && peso < 80){
            precioFinal+=50;
        }else{
            precioFinal+=100;
        }
        return precioFinal;
    }
}
