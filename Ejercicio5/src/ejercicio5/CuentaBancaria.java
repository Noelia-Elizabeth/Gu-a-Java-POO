
package ejercicio5;

import java.util.Scanner;

public class CuentaBancaria {
    
    private int numeroCuenta;
    private int dniCliente;
    private Double saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, int dniCliente, Double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public Double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(Double saldoActual) {
        this.saldoActual = saldoActual;
    }

//    public void crearCuenta () {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ingrese el número de la cuenta: ");
//        this.numeroCuenta = scanner.nextInt();
//        System.out.println("Ingrese el DNI del cliente: ");
//        this.dniCliente = scanner.nextInt();
//        System.out.println("Ingrese el saldo:");
//        this.saldoActual = scanner.nextDouble();
//    }
    
//    public void ingresarDinero (Double ingreso) {
//        this.saldoActual += ingreso;
//    }

//    public void retirarDinero (Double retiro) {
//        
//        if (this.getSaldoActual() > retiro) {
//            this.setSaldoActual(this.getSaldoActual()-retiro);
//        } else {
//            this.setSaldoActual(0.0);
//        }
//    }
    
//    public void extraccionRapida(Double retiro) {
//        if (retiro <= this.getSaldoActual()*0.2) {
//            this.setSaldoActual(this.getSaldoActual() - retiro);
//        } else {
//            System.out.println("No puede retirar más del 20% de su saldo actual.");
//        }
//    }
 
//    public void consultarSaldo() {
//        System.out.println("Su saldo actual es: " + this.getSaldoActual());
//    }

//    public void consultarDatos() {
//        System.out.println("Su N° de cuenta es: " + this.getNumeroCuenta());
//        System.out.println("Su N° de DNI es: " + this.getDniCliente());
//    }
    
}
