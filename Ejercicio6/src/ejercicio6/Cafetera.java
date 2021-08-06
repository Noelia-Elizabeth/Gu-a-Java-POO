
package ejercicio6;

public class Cafetera {
    
    private Double capacidadMaxima = 0.0;
    private Double cantidadActual = 0.0;

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
    
//    public void llenarCafetera () {
//        this.cantidadActual = this.capacidadMaxima;
//        System.out.println("La cafetera tiene: " + this.cantidadActual);
//    }
    
//    public void servirTaza(int tamanioTaza){
//        
//        if (this.cantidadActual >= tamanioTaza) {
//            this.cantidadActual -= tamanioTaza;
//            System.out.println("Taza llena.");
//        } else {
//            System.out.println("No alcanzaba; solo se pudo colocar: " + this.cantidadActual);
//            this.cantidadActual = 0.0;
//        }        
//    }

//    public void vaciarCafetera() {
//        System.out.println("Cafetera vaciada.");
//        this.cantidadActual = 0.0;
//    }

//    public void agregarCafe(int cantidadCafe) {
//        
//        if (this.capacidadMaxima >= cantidadCafe + this.cantidadActual) {
//            System.out.println("Se agregan " + cantidadCafe + " de café a la cafetera.");
//            this.cantidadActual += cantidadCafe;
//        } else {
//            System.out.println("Cafetera llena.");
//            this.cantidadActual = this.capacidadMaxima;
//        }
//        
//    }
}
