public class factura {
    cliente c1 = new cliente();
    //Constructores
    public factura(){
        System.out.println("Has creado una factura");
    }
    public factura(String nombre_cliente){
        c1.setNombre_cliente(nombre_cliente);
        System.out.println("Has creado una factura");
    }
    public void saludo(){
        System.out.println("Sr/Sra" + c1.nombreCorto()+" aquí tiene el resumen de la factura: ");
    }
    public void muestraFactura(){
        System.out.println(c1.getNombre_cliente());
        System.out.println();
    }

}
