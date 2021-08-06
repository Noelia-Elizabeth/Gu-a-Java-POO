/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos: 
numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las operaciones asociadas a dicha clase son:

• Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
• Agregar los métodos getters y setters correspondientes
• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la restará al saldo actual.
  Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */

//Dejo comentada la solución original.
package ejercicio5;

import ejercicio5.servicios.ServicioCuentaBancaria;

public class Ejercicio5 {

    public static void main(String[] args) {
        
//        CuentaBancaria cuenta1 = new CuentaBancaria(000,0,0.0);
//        
//        //Creación de la cuenta
//        cuenta1.crearCuenta();
//        
//       // Prueba de los métodos
//        System.out.println("∿∿∿∿∿∿∿∿∿∿∿∿∿∿∿∿∿∿∿∿");
//        System.out.println("Los datos de su cuenta: ");
//        cuenta1.consultarDatos();
//        System.out.println("∿∿∿∿∿∿∿∿∿∿∿∿∿∿∿∿∿∿∿∿");
//        System.out.println("Consulta del saldo: ");
//        cuenta1.consultarSaldo();
//        System.out.println("∿∿∿∿∿∿∿∿∿∿∿∿∿∿∿∿∿∿∿∿");

        ServicioCuentaBancaria serviciocb = new ServicioCuentaBancaria();
        CuentaBancaria cuenta1 = serviciocb.crearCuenta();
        
        serviciocb.consultarDatos(cuenta1);
        serviciocb.consultarSaldo(cuenta1);
        serviciocb.ingresarDinero(cuenta1, 200.0);
        serviciocb.extraccionRapida(cuenta1, 50.0);
        serviciocb.retirarDinero(cuenta1, 100.0);
        
    }
    
}
