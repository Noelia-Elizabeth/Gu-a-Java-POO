
package ejercicio3.servicios;

import ejercicio3.Operacion;
import java.util.Scanner;

public class ServicioOperacion {
    
    public Operacion crearOperacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número:");
        Double numero1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo número:");
        Double numero2 = scanner.nextDouble();
        return new Operacion(numero1, numero2);
    }
    
    public Double sumar(Operacion o){
        return o.getNumero1() + o.getNumero2();
    }
    
    public Double restar(Operacion o) {
        return o.getNumero1() - o.getNumero2();
    }
    
    public Double multiplicar(Operacion o) {
        if (o.getNumero1() != 0 && o.getNumero2() != 0) {
            return o.getNumero1() * o.getNumero2();
        } else {
            System.out.println("Está prohibida la multiplicación por 0");
            return 0.0;
        }
    }
    
    public Double dividir(Operacion o) {
        if (o.getNumero2() != 0) {
            return o.getNumero1() * o.getNumero2();
        } else {
            System.out.println("Está prohibida la división por 0");
            return 0.0;
        }
    }
}
