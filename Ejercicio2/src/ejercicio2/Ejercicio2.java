/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio 
de tipo real. A continuación, se deben crear los siguientes métodos:

    a) Método constructor que inicialice el radio pasado como parámetro.
    b) Métodos get y set para el atributo radio de la clase Circunferencia.
    c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
    d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
    e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */

// Dejo comentada la resolución original.
package ejercicio2;

import ejercicio2.servicios.ServicioCircunferencia;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        //Creamos la circunferencia
        
        System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
        System.out.println("※Vamos a crear una circunferencia※");
        System.out.println("※※※※※※※※※※※※※※※※※※※※※※※※※※※※※※");
        
//        Circunferencia C1 = new Circunferencia(0.0);
        
//        C1.crearCircunferencia();
//        System.out.println("El área de su circunferencia es: " + C1.area());
//        System.out.println("El perímetro de su circunferencia es: " + C1.perimetro());
        

        ServicioCircunferencia circ = new ServicioCircunferencia();
        Circunferencia circunferencia = circ.crearCircunferencia();
        System.out.println("El área de su circunferencia es: " + circ.area(circunferencia));
        System.out.println("El perímetro de su circunferencia es: " + circ.perimetro(circunferencia));
    }
    
}
