package videoclubarraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        /*
        


for (int i = 0; i < 5; i++) {
    System.out.format(leftAlignFormat, "some data" + i, i * i);
}
System.out.format("+-----------------+------+%n");
         */
        String leftAlignFormat = "| %-15s | %-4d |%n";

        ArrayList<Entregable> item = new ArrayList<Entregable>();

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

        Entregable i6 = new Videojuego("Mario Bros", 8, "Infantil", "Nintendo");
        item.add(i6);

        Entregable i7 = new Videojuego("Ninja Gaiden", 6, "Accion", "Sega");
        item.add(i7);

        Entregable i8 = new Videojuego("Street Fighter", 14, "Accion", "Nintendo");
        item.add(i8);

        Entregable i9 = new Videojuego("Contra", 8, "Accion", "Nintendo");
        item.add(i9);

        System.out.printf("\tEl número de elementos es %d \n\n", item.size());

        //variables de conteo
        int contSeries = 0;
        int contVideoJuego = 0;

        //Entrega algunos Videojuegos y Series con el método entregar().
        i0.entregar();
        i1.entregar();

        //Cuenta cuantas Series y Videojuegos hay entregados. Al contarlos, devuélvelos.
        Iterator<Entregable> it = item.iterator();
        Entregable e = null;

        int mayorS = 0;
        String videoj = "";
        int mayorV = 0;
        String series = "";

        Serie serieMax = null;
        Videojuego videojuegoMax = null;

        while (it.hasNext()) {
            e = it.next();
            System.out.println(e.toString());

            if (e instanceof Serie) {

                if (e.isEntregado()) {
                    contSeries++;
                }

                if (serieMax == null) {//modificar para manipular el objeto**************************************
                    if (((Serie) e).getNumTemporadas() > mayorS) {
                        mayorS = ((Serie) e).getNumTemporadas();
                        series = ((Serie) e).getTitulo();
                    }
                }
            }
            if (e instanceof Videojuego) {

                if (e.isEntregado()) {
                    contVideoJuego++;
                }

                if (videojuegoMax == null) {//modificar para manipular el objeto**************************************

                    if (((Videojuego) e).getHoras() > mayorV) {
                        mayorV = ((Videojuego) e).getHoras();
                        videoj = ((Videojuego) e).getTitulo();
                    }
                }
            }
            /*
            
        
             */

        }
        System.out.println("\tTotal de series: " + contSeries);
        System.out.println("\tTotal de Videojuegos: " + contVideoJuego);
        System.out.println("\tEl video juego que más horas tiene es " + videoj + " con " + mayorV + " horas");
        System.out.println("\tLa serie que más temporadas tiene es " + series + " con " + mayorS + " temporadas");

        /*
        
         
         Por último, indica el Videojuego tiene más horas estimadas y la serie
        con más temporadas.
         Muestralos en pantalla con toda su información (usa el método
        toString()).
         */
    }

    public static void encabezadoTabla() {

        System.out.printf("+-----------------+------+%n");
        System.out.printf("| Column name     | ID   |%n");
        System.out.printf("+-----------------+------+%n");
    }
}


/*
package electrodomestico;

import java.util.ArrayList;
import java.util.Iterator;


public class Main {

    
    public static void main(String[] args) {
        //Creamos un array de Electrodomesticos        
        ArrayList <Electrodomestico> listaElectrodomesticos= new ArrayList<Electrodomestico>();
        
        Electrodomestico e1 = new Electrodomestico(200, 60, 'C', "Verde");
        listaElectrodomesticos.add(e1);
        
        Electrodomestico e2 = new Lavadora(150, 30);
        listaElectrodomesticos.add(e2);
        
        Electrodomestico e3 = new Television(500, 80, 'E', "negro", 42, false);
        listaElectrodomesticos.add(e3);
        
        Electrodomestico e4=new Electrodomestico();
        listaElectrodomesticos.add(e4);                          
        
        Electrodomestico e5=new Electrodomestico(600, 20, 'D', "gris");
        listaElectrodomesticos.add(e5);
                                   
        Electrodomestico e6=new Lavadora(300, 40, 'Z', "blanco", 40);
        listaElectrodomesticos.add(e6);
                                            
        Electrodomestico e7=new Television(250, 70);
        listaElectrodomesticos.add(e7);
                                                     
        Electrodomestico e8=new Lavadora(400, 100, 'A', "verde", 15);
        listaElectrodomesticos.add(e8);
        
        System.out.printf("El numero de elementos es %d \n", listaElectrodomesticos.size());
                
        //Creamos las variables que usaremos para almacenar la suma de los precios
        double sumaElectrodomesticos=0;
        double sumaTelevisiones=0;
        double sumaLavadoras=0;
        
        Iterator<Electrodomestico> it = listaElectrodomesticos.iterator();
        Electrodomestico E;
        while (it.hasNext()){
            E = it.next();
            System.out.println(E.toString());
            
            if(E instanceof Electrodomestico){
                sumaElectrodomesticos+=E.precioFinal();
            }
            if(E instanceof Lavadora){
                sumaLavadoras+=E.precioFinal();
            }
            if(E instanceof Television){
                sumaTelevisiones+=E.precioFinal();
            }
             
        }
        
        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisiones);
        
        
        Electrodomestico e9 = new Television(200, 60, 'C', "naranja", 30, true);
        listaElectrodomesticos.add(5, e9);
        
        Electrodomestico e10 = new Electrodomestico(50, 10);
        listaElectrodomesticos.add(e10);
        
        System.out.printf("El numero de elementos es %d \n", listaElectrodomesticos.size());
        
        sumaElectrodomesticos=0;
        sumaTelevisiones=0;
        sumaLavadoras=0;
        
        it = listaElectrodomesticos.iterator();
        while (it.hasNext()){
            E = it.next();
            System.out.println(E.toString());
            
            if(E instanceof Electrodomestico){
                sumaElectrodomesticos+=E.precioFinal();
            }
            if(E instanceof Lavadora){
                sumaLavadoras+=E.precioFinal();
            }
            if(E instanceof Television){
                sumaTelevisiones+=E.precioFinal();
            }
             
        }
        
        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisiones);
   
    }
    
    
}
 */
