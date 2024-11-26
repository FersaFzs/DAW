public abstract class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void endenderMotor();

    public void mostrarDetalles(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
    }
}
