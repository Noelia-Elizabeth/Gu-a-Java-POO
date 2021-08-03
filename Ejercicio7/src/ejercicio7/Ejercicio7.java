/*

Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo ('H' hombre o 'M' mujer), 
peso y altura. Si el alumno desea añadir algún otro atributo, puede hacerlo. Los métodos que se implementarán son:

    • Un constructor por defecto.
    • Un constructor con todos los atributos como parámetro.
    • Métodos getters y setters de cada atributo.
    • Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y 
      después se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, 
      comprueba que el sexo introducido sea correcto, es decir, H o M. Si no es correcto se deberá mostrar un mensaje
    • Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
      Si esta fórmula da por resultado un valor menor que 20, la función devuelve un -1. 
      Si la fórmula da por resultado un número entre 20 y 25 (incluidos), 
      significa que el peso está por debajo de su peso ideal y la función devuelve un 0. Finalmente, 
      si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, 
      y la función devuelve un 1. Se recomienda hacer uso de constantes para devolver estos valores.
    • Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
      devuelve un booleano.

A continuación, en la clase main hacer lo siguiente:

Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, 
deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e 
indicar para cada objeto si la persona es mayor de edad.

Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables, 
para después en el main, calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, 
cuantas en su peso ideal y cuantos, por encima, 
y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.

 */
package ejercicio7;

public class Ejercicio7 {


    public static void main(String[] args) {
        
        //Creamos personas
        Persona persona1 = new Persona("Lean",24,"H",72.0,1.72);
        Persona persona2 = new Persona("Matías",24,"H",90.0,1.65);
        Persona persona3 = new Persona("Alex",23,"H",70.0,1.57);
        Persona persona4 = new Persona("Agos",17,"M",8.0,1.74);
        
        //Calculamos el IMC de pada persona
        persona1.calcularIMC();
        persona2.calcularIMC();
        persona3.calcularIMC();
        persona4.calcularIMC();
        
        //Interpretamos y mostramos por pantaña el resultado del IMC de cada persona
        persona1.pesoIdeal();
        persona2.pesoIdeal();
        persona3.pesoIdeal();
        persona4.pesoIdeal();
        
        //Mostramos por pantalla si las personas son mayores de edad o no
        if (persona1.esMayorDeEdad()) {
            System.out.println(persona1.getNombre() + " es mayor de edad.");
        } else {
            System.out.println(persona1.getNombre() + " no es mayor de edad.");
        }
        
        if (persona2.esMayorDeEdad()) {
            System.out.println(persona2.getNombre() + " es mayor de edad.");
        } else {
            System.out.println(persona2.getNombre() + " no es mayor de edad.");
        }
        
        if (persona3.esMayorDeEdad()) {
            System.out.println(persona3.getNombre() + " es mayor de edad.");
        } else {
            System.out.println(persona3.getNombre() + " no es mayor de edad.");
        }
        
        if (persona4.esMayorDeEdad()) {
            System.out.println(persona4.getNombre() + " es mayor de edad.");
        } else {
            System.out.println(persona4.getNombre() + " no es mayor de edad.");
        }
        
        //Calculamos el porcentaje de personas por debajo de su peso
        int cantidadConBajoPeso = 0;
        int cantidadConPesoIdeal = 0;
        int cantidadConSobrepeso = 0;
        
        switch (persona1.getPesoIdeal()) {
            case -1:
                cantidadConBajoPeso++;
                break;
            case 0:
                cantidadConPesoIdeal++;
                break;
            case 1:
                cantidadConSobrepeso++;
                break;
        }
        
        switch (persona2.getPesoIdeal()) {
            case -1:
                cantidadConBajoPeso++;
                break;
            case 0:
                cantidadConPesoIdeal++;
                break;
            case 1:
                cantidadConSobrepeso++;
                break;
        }
        
        switch (persona3.getPesoIdeal()) {
            case -1:
                cantidadConBajoPeso++;
                break;
            case 0:
                cantidadConPesoIdeal++;
                break;
            case 1:
                cantidadConSobrepeso++;
                break;
        }
        
        switch (persona4.getPesoIdeal()) {
            case -1:
                cantidadConBajoPeso++;
                break;
            case 0:
                cantidadConPesoIdeal++;
                break;
            case 1:
                cantidadConSobrepeso++;
                break;
        }
        
        System.out.println("Hay " + cantidadConBajoPeso + " personas por debajo de su peso ideal.");
        System.out.println("Hay " + cantidadConPesoIdeal + " personas en su peso ideal.");
        System.out.println("Hay " + cantidadConSobrepeso + " personas son sobrepeso.");
        
    }
    
}
