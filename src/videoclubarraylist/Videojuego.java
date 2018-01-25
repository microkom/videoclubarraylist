package videoclubarraylist;

public class Videojuego extends Entregable {
    final static int HORAS_DEF=10;
    //Sus atributos son titulo, horas estimadas, entregado, genero y compañia.
    
    private int horas;
    private String company;
    
    //constructor con todos los atributos, excepto de entregado
    public Videojuego(String titulo, int horas, String genero, String company){
        super(titulo,genero);
        this.horas=horas;
        this.company=company;
    }
    //constructor con el titulo y la compañia. El resto por defecto
    public Videojuego(String titulo, String company){
        super(titulo);
        this.company=company;
        this.horas=HORAS_DEF;
    }
    //Métodos get y set
    public String getCompany(){
        return this.company;
    }
    public int getHoras(){
        return this.horas;
    }
    public void setCompany(String company){
        this.company=company;
    }
    public void setHoras(int horas){
        this.horas=horas;
    }
    
    public String toString(){
        String texto = super.toString();
        texto += "\tHoras: " + this.horas+ "\n";
        texto += "\tCompañia: " + this.company;
        return texto;
    }
}
