/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo
privado base y un atributo privado altura. La clase incluirá un método para crear el
rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un
método para calcular la superficie del rectángulo y un método para calcular el
perímetro del rectángulo. Por último, tendremos un método que dibujará el
rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir
los métodos getters, setters y constructores correspondientes.

Superficie = base * altura / Perímetro = (base + altura) * 2.
 */

//Dejo comentada la solución original.
package ejercicio4;

import ejercicio4.servicios.ServicioRectangulo;

public class Ejercicio4 {

    public static void main(String[] args) {
        
        //Rectangulo R1 = new Rectangulo (1.0,1.0);
        
        //R1.dibujarRectángulo();
        
        ServicioRectangulo serviciorect = new ServicioRectangulo();
        
        Rectangulo rectangulo = serviciorect.crearRectangulo();
        
        System.out.println("La perímetro del retángulo es: " + serviciorect.perimetro(rectangulo));
        System.out.println("El superficie del retángulo es: " + serviciorect.superficie(rectangulo));
        
        serviciorect.dibujarRectángulo(rectangulo);
        
    }
    
}
