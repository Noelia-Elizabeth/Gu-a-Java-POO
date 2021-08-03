/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String) y su longitud. 
En el main se creará el objeto y se le pedirá al usuario que ingrese una frase que puede ser una palabra o 
varias palabras separadas por un espacio en blanco y a través de los métodos set, 
se guardará la frase y la longitud de manera automática según la longitud de la frase ingresada. 

Deberá además implementar los siguientes métodos:

    • Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
    • Método invertirFrase(), deberá invertir la frase ingresada y mostrar la frase invertida por pantalla. 
      Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    • Método vecesRepetido(String letra), deberá recibir por parámetro un carácter ingresado por el usuario y 
      contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
      Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    • Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase 
      con otra nueva frase ingresada por el usuario.
    • Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada 
      por el usuario y mostrar la frase resultante.
    • Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, 
      por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
    • Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y 
      devuelve verdadero si la contiene y falso si no.
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Cadena frase1 = new Cadena();
        
        System.out.println("Infrese una frase:");
        frase1.setFrase(scanner.nextLine());
        frase1.setLongitud(frase1.getFrase().length());
        
        System.out.println(" ");
        System.out.print("◎ Su frase: ");
        System.out.println(frase1.getFrase());
        System.out.print("◎ La longitud de su frase: ");
        System.out.println(frase1.getLongitud());
        System.out.print("◎ N° de vocales de su frase: ");
        System.out.println(frase1.mostrarVocales());
        System.out.print("◎ Su frase invertida: ");
        frase1.invertirFrase();
        
        System.out.println(" ");
        System.out.println("Ingrese una letra para buscar: ");
        System.out.println("◎ La letra se repite: " + frase1.vecesRepetido(scanner.nextLine()));
        
        System.out.println(" ");
        System.out.println("Ingrese una nueva frase para comparar longitudes:");
        System.out.println("◎ La frase más larga es: " + frase1.compararLongitud(scanner.nextLine()));
        
        
        System.out.println(" ");
        System.out.println("Ingrese una frase para concatenarla con la original:");
        frase1.unirFrases(scanner.nextLine());

        System.out.println(" ");
        System.out.println("Ingrese una letra para las letra a:");
        frase1.unirFrases(scanner.nextLine());
        
        System.out.println(" ");
        System.out.println("Ingrese una letra para buscar en la frase original:");
        if (frase1.contiene(scanner.nextLine())) {
            System.out.println("◎ La letra está en su frase.");
        } else {            
            System.out.println("◎ La letra no está en su frase.");
        }
    }
    
}
