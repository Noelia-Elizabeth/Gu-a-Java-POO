
package ejercicio12;

import java.util.Date;
import java.util.Scanner;

public class Persona {
    
    private String nombre;
    private Date fechaDeNacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    
    public void crearPersona() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona:");
        this.nombre = scanner.nextLine();
        System.out.println("Ingrese el día de nacimiento:");
        int dia = scanner.nextInt();
        System.out.println("Ingrese el mes de nacimiento:");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el anio de nacimiento:");
        int anio = scanner.nextInt();
        this.fechaDeNacimiento = new Date(anio, mes-1, dia);
    }
    
    public int calcularEdad() {
        Date actual = new Date();
        return actual.getYear() - this.fechaDeNacimiento.getYear();
    }
    
    public Boolean menorQue(int edad) {
        return edad > this.calcularEdad();
    }
    
    public void mostrarPersona() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Fecha de nacimiento: " + this.fechaDeNacimiento);
    }
    
}
