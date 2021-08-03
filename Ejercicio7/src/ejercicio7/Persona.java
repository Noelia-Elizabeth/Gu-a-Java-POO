
package ejercicio7;

import java.util.Scanner;

public class Persona {
    
    private String nombre;
    private int edad;
    private String sexo;
    private Double peso;
    private Double altura;
    private int pesoIdeal;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public int getPesoIdeal() {
        return pesoIdeal;
    }

    public void setPesoIdeal(int pesoIdeal) {
        this.pesoIdeal = pesoIdeal;
    }
    
    
    public void crearPersona(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de la persona: ");
        this.nombre = scanner.next();
        
        System.out.println("Ingrese la edad de la persona: ");
        this.edad = scanner.nextInt();
        
        do {
            System.out.println("Ingrese el sexo de la persona (H o M): ");
            this.sexo = scanner.next();
            
            if (!"H".equals(this.sexo) || !"M".equals(this.sexo)) {
                System.out.println("Ingrese un valor válido.");
            }
        } while (!"H".equals(this.sexo) || !"M".equals(this.sexo));
        
        System.out.println("Ingrese el peso de la persona: ");
        this.peso = scanner.nextDouble();
        
        System.out.println("Ingrese la altura de la persona: ");
        this.altura = scanner.nextDouble();
        
    }
    
    public void calcularIMC() {
        Double resultado = this.peso / (this.altura * this.altura);
        
        if (resultado < 20) {
            this.pesoIdeal = -1;
        } else if (resultado >= 20 && resultado <= 25) {
            this.pesoIdeal = 0;
        } else if (resultado > 25) {
            this.pesoIdeal = 1;
        }
        
    }
    
    public Boolean esMayorDeEdad() {
        
        return this.edad >= 18;
        
    }
    
    public void pesoIdeal () {
        System.out.print("La persona llamada " + this.getNombre());
        switch (this.pesoIdeal) {
            case -1:
                System.out.println(" está por debajo de su peso ideal.");
                break;
            case 0:
                System.out.println(" está en su peso ideal.");
                break;
            case 1:
                System.out.println(" tiene sobrepeso.");
                break;
        }
    }
    
}
