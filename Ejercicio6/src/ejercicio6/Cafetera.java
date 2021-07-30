
package ejercicio6;

public class Cafetera {
    
    private Double capacidadMaxima;
    private Double cantidadActual;

    public Cafetera() {
    }

    public Cafetera(Double capacidadMaxima, Double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public Double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(Double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public Double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(Double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public void llenarCafetera () {
        this.cantidadActual = this.capacidadMaxima;
        System.out.println("La cafetera tiene: " + this.cantidadActual);
    }
    
    public void servirTaza(Double tamanioTaza){
        
        if (this.cantidadActual >= tamanioTaza) {
            this.cantidadActual -= tamanioTaza;
            System.out.println("Taza llena.");
        } else {
            System.out.println("No alzancaba, solo se puso colocar: " + this.cantidadActual);
            this.cantidadActual = 0.0;
        }        
    }
    
    public void vaciarCafetera() {
        System.out.println("Cafetera vaciada.");
        this.cantidadActual = 0.0;
    }
    
    public void agregarCafe(Double cantidadCafe) {
        
        if (this.capacidadMaxima >= this.cantidadActual) {
            System.out.println("Se agregan " + cantidadCafe + " de café a la cafetera.");
            this.cantidadActual += cantidadCafe;
        } else {
            System.out.println("Cafetera llena.");
            this.cantidadActual = this.capacidadMaxima;
        }
        
    }
}
