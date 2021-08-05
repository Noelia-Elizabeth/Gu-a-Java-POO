
package ejercicio3;

import java.util.Scanner;

public class Operacion {
    
    private Double numero1;
    private Double numero2;

    public Operacion(Double numero1, Double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public Double getNumero1() {
        return numero1;
    }

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }
    
//    public void crearOperacion () {
//        Scanner scanner = new Scanner(System.in);
//        this.numero1 = scanner.nextDouble();
//        this.numero2 = scanner.nextDouble();
//    }
    
//    public Double sumar (){
//        return this.numero1 + this.numero2;
//    }
//    
//    public Double restar () {
//        return this.numero1 - this.numero2;
//    }
    
//    public Double multiplicar () {
//        if (this.numero1 != 0 && this.numero2 != 0) {
//            return this.numero1 * this.numero2;
//        } else {
//            System.out.println("Está prohibida la multiplicación por 0");
//            return 0.0;
//        }
//    }
    
//    public Double dividr () {
//        if (this.numero2 != 0) {
//            return this.numero1 * this.numero2;
//        } else {
//            System.out.println("Está prohibida la división por 0");
//            return 0.0;
//        }
//    }
    
}
