public class Publicacion {
    protected String titulo;
    protected int nPag;

    public Publicacion(){
    }
    public Publicacion(String tit, int pags){
        this.titulo = tit;
        this.nPag = pags;
    }

    public void muestraInfo(){
        System.out.println("Titulo: "+ this.titulo);
        System.out.println("Numero de páginas: "+ this.nPag);
    }
}
