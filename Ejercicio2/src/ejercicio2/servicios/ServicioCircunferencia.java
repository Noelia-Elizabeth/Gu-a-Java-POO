
package ejercicio2.servicios;

import ejercicio2.Circunferencia;
import java.util.Scanner;

public class ServicioCircunferencia {
    
    public Circunferencia crearCircunferencia () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio: ");
        Double radio = scanner.nextDouble();
        return new Circunferencia(radio);
    }
    
    public Double area (Circunferencia c) {
        return Math.PI * Math.pow(c.getRadio(), 2);
    }
    
    public Double perimetro (Circunferencia c) {
        Double perimetro = 2 * Math.PI * c.getRadio();
        return perimetro;
    }
}
