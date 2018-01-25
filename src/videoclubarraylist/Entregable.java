
package videoclubarraylist;

public class Entregable {
    
    protected final static boolean ENTREGADO_DEF = false;
    
    private String titulo;
    private boolean entregado;
    private String genero;
    
    public Entregable(String titulo, boolean entregado, String genero){
        this.titulo = titulo;
        this.entregado = entregado;
        this.genero = genero;
    }
    public Entregable(String titulo){
        this.titulo = titulo;
        this.genero = "accion"; 
        this.entregado = false;
    }
    public Entregable(String titulo,String genero){
        this.titulo = titulo;
        this.genero = genero; 
        this.entregado = false;
    }
    public Entregable(){
        this.titulo="";
        this.genero="";
        this.entregado=false;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public boolean isEntregado() {
        return this.entregado;
    }
    public String getGenero() {
        return this.genero;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    //metodo entregar() (prestar) items
    public void entregar(){
        this.entregado=true;
    }
    //metodo para devolver items
    public void devolver(){
        this.entregado=false;
    }
    public String toString(){
        String texto = "";
        texto = "\tTítulo: " + this.titulo+ "\n";
        if (this.entregado) {
            texto += "\tSerie no disponible\n";
        } else {
            texto += "\tSerie disponible\n";
        }
        texto += "\tGenero: " + this.genero+ "\n";
        return texto;
    }
   
}
