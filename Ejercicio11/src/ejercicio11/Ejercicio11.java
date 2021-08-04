/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la clase Date. 

En este ejercicio deberemos instanciar en el main, una fecha usando la clase Date, 
para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al usuario para poner el constructor del objeto Date. 
Una vez creada la fecha de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, 
que se puede conseguir instanciando un objeto Date con constructor vacío.

Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date(); 
 */
package ejercicio11;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        
        int dia;
        int mes;
        int anio;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el día: ");
        dia = scanner.nextInt();
        System.out.println("Ingrese el mes: ");
        mes = scanner.nextInt();
        System.out.println("Ingrese el año: ");
        anio = scanner.nextInt();
        
        Date fecha = new Date (anio, mes, dia);
        System.out.println("La fecha ingresada es: " + fecha);
        
        System.out.println("ϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟϟ");
        
        Date actual = new Date();
        Long auxiliar = fecha.getTime();
        Long auxiliarActual = actual.getTime();
        Long diferencia;
        if (fecha.before(actual)) {
            diferencia = auxiliarActual - auxiliar;
        } else {
            diferencia = auxiliar - auxiliarActual;
        }
        System.out.println("Hay " + diferencia + " milisegundos entre la fecha ingresada y la fecha actual.");
        
        
    }
    
}
