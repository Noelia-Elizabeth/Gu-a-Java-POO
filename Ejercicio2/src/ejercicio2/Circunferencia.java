
package ejercicio2;

import java.util.Scanner;


public class Circunferencia {
    
    private Double radio;

    public Circunferencia(Double radio) {
        this.radio = radio;
    }

    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio: ");
        this.radio = scanner.nextDouble();
    }
    
    public Double area () {
        Double area = Math.PI * this.radio * this.radio;
        return area;
    }
    
    public Double perimetro () {
        Double perimetro = 2 * Math.PI * this.radio;
        return perimetro;
    }
    
}
