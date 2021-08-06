
package ejercicio6.servicios;

import ejercicio6.Cafetera;

public class ServicioCafetera {
    
    public void llenarCafetera (Cafetera caf) {
        caf.setCantidadActual(caf.getCapacidadMaxima());
        System.out.println("La cafetera tiene: " + caf.getCantidadActual());
    }
    
    public void servirTaza(Cafetera caf, int tamanioTaza){
        
        if (caf.getCantidadActual() >= tamanioTaza) {
            caf.setCantidadActual(caf.getCantidadActual() - tamanioTaza);
            System.out.println("Taza llena.");
        } else {
            System.out.println("No alcanzaba; solo se pudo colocar: " + caf.getCantidadActual());
            caf.setCantidadActual(0.0);
        }        
    }
    
    public void vaciarCafetera(Cafetera caf) {
        System.out.println("Cafetera vaciada.");
        caf.setCantidadActual(0.0);
    }
    
    public void agregarCafe(Cafetera caf, int cantidadCafe) {
        
        if (caf.getCapacidadMaxima() >= cantidadCafe + caf.getCantidadActual()) {
            System.out.println("Se agregan " + cantidadCafe + " de café a la cafetera.");
            caf.setCantidadActual(cantidadCafe + caf.getCantidadActual());
        } else {
            System.out.println("Cafetera llena.");
            caf.setCantidadActual(caf.getCapacidadMaxima());
        }
        
    }
}
