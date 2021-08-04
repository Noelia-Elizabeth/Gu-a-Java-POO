
package extra3;

public class Raices {
    
    private Double a;
    private Double b;
    private Double c;

    public Raices(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public Double getDiscriminante() {
        return (Math.pow(this.b, 2)-(4*this.a*this.c));
    }
    
    public Boolean tieneRaices() {
        return this.getDiscriminante() >= 0;
    }
    
    public Boolean tieneRaiz() {
        return this.getDiscriminante() == 0;
    }
    
    public void obtenerRaices() {
        Double aux1 = -this.b + Math.sqrt((Math.pow(this.b, 2)-(4*this.a*this.c))/2*this.a);
        Double aux2 = -this.b - Math.sqrt((Math.pow(this.b, 2)-(4*this.a*this.c))/2*this.a);
        if (this.tieneRaices()) {
            System.out.println("La solución uno: " + aux1);
            System.out.println("La solución dos: " + aux2);
        }
    }
    
    public void obtenerRaiz() {
        Double aux1 = -this.b + Math.sqrt((Math.pow(this.b, 2)-(4*this.a*this.c))/2*this.a);
        if (this.tieneRaiz()) {
            System.out.println("La solución es: " + aux1);
        }
    }
    
    public void calcular() {
        if (this.tieneRaices()==false && this.tieneRaiz()==false) {
            System.out.println("No tiene ninguna solución.");
        } else if (this.tieneRaices()) {
            this.obtenerRaices();
        } else if (this.tieneRaiz()) {
            this.obtenerRaiz();
        }
    }
}
