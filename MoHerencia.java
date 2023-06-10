/*
 Tenemos una clase padre Animal 
junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, 
alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada 
clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta.
Generar una clase Main que realice lo
siguiente:
 */
package moherencia;

import Entidades.Animal;
import Entidades.Gato;
import Entidades.Caballo;
import Entidades.Perro;
import Utilidades.Alimento;
import Utilidades.Raza;
import java.util.ArrayList;

/**
 *
 * @author mgtom
 */
public class MoHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
//
        ArrayList<Animal> animales = new ArrayList();
//
//        Animal a = new Caballo();
//
//        Perro b = new Perro();
//        Gato c = new Gato();
//        animales.add(a);
//        animales.add(b);
//        animales.add(c);
//        
//        for (Animal animalx : animales) {
//            
//            animalx.hacerRuido();
//            A
//        }

Animal perro1= new Perro("lala",Alimento.CARNE,15,Raza.DOGO);
//perro1.alimentarse();
Gato gato= new Gato("michi",Alimento.WHISKAS,15,Raza.PERSA);
// gato.alimentarse();
Caballo caballito= new Caballo("lucky",Alimento.PASTO,15,Raza.OTROS);
        
 animales.add(perro1);
 animales.add(gato);
 animales.add(caballito);
     
        for (Animal cadaUno : animales) {
            System.out.println(cadaUno/*.toString()*/);;
            cadaUno.alimentarse();
            
            
        }

    }

}
