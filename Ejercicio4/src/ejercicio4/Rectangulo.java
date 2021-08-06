
package ejercicio4;

import java.util.Scanner;

public class Rectangulo {
    
    private Double base;
    private Double altura;

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    
    
//    public void crearRectangulo () {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingrese la base del rectángulo:");
//        this.base = scanner.nextDouble();
//        System.out.println("Ingrese la altura del rectángulo:");
//        this.altura = scanner.nextDouble();
//    }
    
//    public Double superficie () {
//        return this.base * this.altura;
//    }
    
//    public Double perimetro () {
//        return (this.altura + this.base) * 2;
//    }
    
//    public void dibujarRectángulo () {
//        if (this.altura == 1) {
//            for (int i = 0; i < this.base; i++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        } else {
//            for (int i = 0; i < this.base; i++) {
//            System.out.print("*");
//            }
//            System.out.println(" ");
//
//            for (int k = 0; k < this.altura-2; k++) {
//                for (int i = 0; i < this.base; i++) {
//                    if (i == 0 || i == this.base-1) {
//                        System.out.print("*");
//                    } else {
//                        System.out.print(" ");
//                    }
//                }
//                System.out.println(" ");
//            }
//
//
//            for (int i = 0; i < this.base; i++) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//
//        }
//        
//    }
    
}
