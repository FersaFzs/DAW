public abstract class Animal {
    protected String nombre;
    protected String especie;

    public Animal(String nombre, String especie){
        this.nombre = nombre;
        this.especie = especie;
    }

    public abstract void hacerSonido();

    public void mostrarDetalles(){
        System.out.println("Nombre: "+ this.nombre);
        System.out.println("Especie: "+ this.especie);
    }
}
