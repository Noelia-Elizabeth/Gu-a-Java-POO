
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Libro libro1 = new Libro();
        
        cargarLibro(libro1, scanner);
        
        mostrarLibro (libro1);
        
        
    }
    
    public static void cargarLibro (Libro libro1, Scanner scanner) {
        System.out.println("Ingrese el ISBN del libro:");
        libro1.isbn = scanner.next();
        System.out.println("Ingrese el título del libro:");
        libro1.titulo = scanner.next();
        System.out.println("Ingrese el autor del libro:");
        libro1.autor = scanner.next();
        System.out.println("Ingrese el número de páginas del libro:");
        libro1.cantidadPaginas = scanner.nextInt();        
        
    }
    
    public static void mostrarLibro(Libro libro1) {
        System.out.println(" ");
        System.out.println("Libro: " + libro1.titulo);
        System.out.println("Autor: " + libro1.autor);
        System.out.println("ISBN: " + libro1.isbn);
        System.out.println("Cantidad de páginas: " + libro1.cantidadPaginas);
    }
    
}
