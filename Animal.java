/*
 Vamos a crear una clase Animal que tenga un método hacerRuido()
que devuelva un saludo“Hola”.
Luego haremos clase Perro y clase Gato
que extiendan de Animal y 
sobreescriban elmétodo hacerRuido() 
con el ruido que corresponda a cada uno.
Luego, en el main vamos a crearun ArrayList de animales 
y los siguientes animalesAnimal a = new Animal();
Animal b = new Perro();Animal c = new Gato();
Agregaremos a la lista a cada uno y luego, con un for each,
recorreremos la lista llamando almétodo hacerRuido() de cada ítem.
 */
package Entidades;

/**
 atributos el nombre, 
alimento, edad y raza del Animal.
 FINAL ES NO HIJOS
 ABSTRACTA ES NO NEW DEL PADRE
 */
public abstract  class Animal {
    
    
    protected String nombre;
    protected Enum alimento;
    protected int edad;
    protected Enum raza;

    public Animal(String nombre, Enum alimento, int edad, Enum raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
    
    
    
   public abstract void hacerRuido();
   
   public void alimentarse(){//lo heredan tal cual
       System.out.println("me alimento de "+ alimento);
   }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", alimento=" + alimento + ", edad=" + edad + ", raza=" + raza + '}';
    }
   
}
