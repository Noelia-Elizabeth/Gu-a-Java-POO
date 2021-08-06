
package ejercicio5.servicios;

import ejercicio5.CuentaBancaria;
import java.util.Scanner;

public class ServicioCuentaBancaria {
    
    public CuentaBancaria crearCuenta () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de la cuenta: ");
        int numeroCuenta = scanner.nextInt();
        System.out.println("Ingrese el DNI del cliente: ");
        int dniCliente = scanner.nextInt();
        System.out.println("Ingrese el saldo:");
        Double saldoActual = scanner.nextDouble();
        return new CuentaBancaria(numeroCuenta, dniCliente, saldoActual);
    }
    
    public void ingresarDinero (CuentaBancaria cb, Double ingreso) {
        cb.setSaldoActual(ingreso + cb.getSaldoActual());
    }
    
    public void retirarDinero (CuentaBancaria cb, Double retiro) {
        
        if (cb.getSaldoActual() > retiro) {
            cb.setSaldoActual(cb.getSaldoActual()-retiro);
        } else {
            cb.setSaldoActual(0.0);
        }
    }
    
    public void extraccionRapida(CuentaBancaria cb, Double retiro) {
        if (retiro <= cb.getSaldoActual()*0.2) {
            cb.setSaldoActual(cb.getSaldoActual() - retiro);
        } else {
            System.out.println("No puede retirar más del 20% de su saldo actual.");
        }
    }
    
    public void consultarSaldo(CuentaBancaria cb) {
        System.out.println("Su saldo actual es: " + cb.getSaldoActual());
    }
    
    public void consultarDatos(CuentaBancaria cb) {
        System.out.println("Su N° de cuenta es: " + cb.getNumeroCuenta());
        System.out.println("Su N° de DNI es: " + cb.getDniCliente());
    }
    
}
