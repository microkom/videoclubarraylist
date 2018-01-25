package videoclubarraylist;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int i;
        /*Crea 1 vector en el que ir introduciendo Series y Videojuegos 10
        posiciones cada uno mínimo. */
        
        ArrayList <Entregable> item = new ArrayList<Entregable>();
        
        Entregable i0 = new Serie("Los Simpsons", 20, "Infantil", "Matt Groening");
        item.add(i0);
        
        Entregable i1 = new Serie("Star Wars", 7, "Ficción", "George Lucas");
        item.add(i1);
        
        Entregable i2 = new Serie("Star Trek", 33, "Ficción", "Juanjo");
        item.add(i2);
        
        Entregable i3 = new Serie("Life", 2, "Policia", "Sandra");
        item.add(i3);
        
        Entregable i4 = new Serie("The Big Bang Theory", 11, "Comedia", "Miguel A");
        item.add(i4);
        
        Entregable i5 = new Serie("Blue bloods", 6, "Policia", "Victor");
        item.add(i5);
        
        System.out.printf("El número de elementos es %d ", item.size());
        
        //variables de conteo
        int contSeries=0;
        int contVideoJuego=0;
        
       
    }

}
