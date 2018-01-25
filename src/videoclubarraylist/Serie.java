package videoclubarraylist;

public class Serie extends Entregable {

    //CONSTANTES temporadas 3 , entregado false y el genero acción.
    final static int TEMPORADAS_DEF = 3;
    final static boolean ENTREGADO_DEF = false;
    

    //Sus atributos son titulo, numero de temporadas, entregado, genero y creador
    private int numTemporadas;
    private String creador;

    //constructor con el titulo y el creador. El resto por defecto
    public Serie(String titulo, String creador) {
        super(titulo);
        this.creador = creador;
        this.numTemporadas = TEMPORADAS_DEF;
    }

    //constructor con todos los atributos, excepto de entregado.
    public Serie(String titulo, int numTemporadas, String genero, String creador) {
        super(titulo, genero);
        this.creador = creador;
        this.numTemporadas = numTemporadas;

    }

    //MÉTODOS
    public int getNumTemporadas() {
        return this.numTemporadas;
    }

    public String getCreador() {
        return this.creador;
    }

    public void setNumTemporadas(int numero) {
        this.numTemporadas = numero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    //Método toString
    public String toString() {
        String texto = super.toString();
        texto += "\tNº temporadas: " + this.numTemporadas+ "\n";
        texto += "\tCreador: " + this.creador;
        return texto;
    }
}
