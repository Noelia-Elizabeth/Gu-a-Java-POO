
package ejercicio8;

import java.util.Scanner;

public class Cadena {
    
    private String frase;
    private int longitud;

    public Cadena() {
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }
    
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int mostrarVocales () {
        int contador = 0;
        for (int i = 0; i < this.longitud; i++) {
            switch (this.frase.substring(i,i+1)) {
                case "a":
                    contador++;
                    break;
                case "e":
                    contador++;
                    break;
                case "i":
                    contador++;
                    break;
                case "o":
                    contador++;
                    break;
                case "u":
                    contador++;
                    break;
                    
            }
        }
        return contador;
    }
    
    public void invertirFrase() {
        for (int i = this.longitud; i > 0; i--) {
            System.out.print(this.frase.substring(i-1,i));
        }
        System.out.println(" ");
    }
    
    public int vecesRepetido(String letra) {
        int contador = 0;
        for (int i = 0; i < this.longitud; i++) {
            if (this.frase.substring(i, i+1).equals(letra)) {
                contador++;
            }
        }
        return contador;
    }
    
    public String compararLongitud(String frase) {

        if (frase.length() == this.longitud) {
            return "ninguna; tienen la misma longitud.";
        } else if (frase.length() < this.longitud) {
            return "la frase original.";
        }
        
        return "la nueva frase.";
        
    }
    
    public void unirFrases(String frase) {
        
        System.out.println("◎ La nueva frase es: " + this.frase.concat(frase));

    }
    
    public void reemplazar (String letra) {
        System.out.println("La frase sin 'a': " + this.frase.replace("a", letra));
    }
    
    public Boolean contiene (String letra) {
        return this.frase.contains(letra);
    }
    
}
