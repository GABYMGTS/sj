/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author mgtom
 */
public class Gato extends Animal{

    public Gato(String nombre, Enum alimento, int edad, Enum raza) {
        super(nombre, alimento, edad, raza);
    }

 

    
    @Override
    public void hacerRuido(){
       System.out.println("“MIAUUUUU”");
   }
}
