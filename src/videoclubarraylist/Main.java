package videoclubarraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

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

        System.out.printf("El número de elementos es %d ", item.size());

        //variables de conteo
        int contSeries = 0;
        int contVideoJuego = 0;

        //Entrega algunos Videojuegos y Series con el método entregar().
        i0.entregar();
        i1.entregar();

        //Cuenta cuantas Series y Videojuegos hay entregados. Al contarlos, devuélvelos.
        Iterator<Entregable> it = item.iterator();
        Entregable e;

        while (it.hasNext()) {
            e = it.next();
            System.out.println(e.toString());
        }
            if (e instanceof Serie){
                contSeries++;
            }
            
        /*
        
         
         Por último, indica el Videojuego tiene más horas estimadas y la serie
        con más temporadas.
         Muestralos en pantalla con toda su información (usa el método
        toString()).
         */

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
