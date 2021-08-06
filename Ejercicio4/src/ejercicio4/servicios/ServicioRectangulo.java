
package ejercicio4.servicios;

import ejercicio4.Rectangulo;
import java.util.Scanner;

public class ServicioRectangulo {
    
    public Rectangulo crearRectangulo () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la base del rectángulo:");
        Double base = scanner.nextDouble();
        System.out.println("Ingrese la altura del rectángulo:");
        Double altura = scanner.nextDouble();
        return new Rectangulo(base, altura);
    }
    
    public Double superficie (Rectangulo r) {
        return  r.getBase()* r.getAltura();
    }
    
    public Double perimetro (Rectangulo r) {
        return (r.getAltura() + r.getBase()) * 2;
    }
    
    public void dibujarRectángulo (Rectangulo r) {
        if (r.getAltura() == 1) {
            for (int i = 0; i < r.getBase(); i++) {
                System.out.print("*");
            }
            System.out.println(" ");
        } else {
            for (int i = 0; i < r.getBase(); i++) {
            System.out.print("*");
            }
            System.out.println(" ");

            for (int k = 0; k < r.getAltura()-2; k++) {
                for (int i = 0; i < r.getBase(); i++) {
                    if (i == 0 || i == r.getBase()-1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println(" ");
            }

            for (int i = 0; i < r.getBase(); i++) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
        
    }
    
}
