
package ejercicio9;

public class Matematica {
    
    private Double n1;
    private Double n2;

    public Matematica() {
    }

    public Matematica(Double n1, Double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Double getN1() {
        return n1;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    public Double getN2() {
        return n2;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }
    
    public int devolverMayor() {
        if (this.n1 > this.n2) {
            return 1;
        } else if (this.n2 > this.n1) {
            return 2;
        } else {
            return 0;
        }
    }
    
    public Double calcularPotencia() {
        if (this.devolverMayor() == 1) {
            return this.n1 * this.n1;
        } else {
            return this.n2 * this.n2;
        }
    }
    
    public Double calculaRaiz() {
        if (this.devolverMayor() == 1) {
            return Math.sqrt(Math.abs(this.n2));
        } else {
            return Math.sqrt(Math.abs(this.n1));
        }
    }
    
}
