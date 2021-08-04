
package extra2;

import java.util.Scanner;

public class Puntos {
    
    private Double x1;
    private Double y1;
    private Double x2;
    private Double y2;

    public Puntos() {
    }
    
    public void crearPuntos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese x1: ");
        this.x1 = scanner.nextDouble();
        System.out.println("Ingrese y1: ");
        this.y1 = scanner.nextDouble();
        System.out.println("Ingrese x2: ");
        this.x2 = scanner.nextDouble();
        System.out.println("Ingrese y2: ");
        this.y2 = scanner.nextDouble();
    }
    
    public Double calcularDistancia() {
        return Math.sqrt(Math.pow(this.x2-this.x1, 2)+Math.pow(this.y2-this.y1, 2));
    }
    
}
