
package ejercicio1.servicios;

import ejercicio1.Libro;
import java.util.Scanner;

public class ServicioLibro {
    
    public Libro cargarLibro () {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el ISBN del libro:");
        String isbn = scanner.next();
        System.out.println("Ingrese el título del libro:");
        String titulo = scanner.next();
        System.out.println("Ingrese el autor del libro:");
        String autor = scanner.next();
        System.out.println("Ingrese el número de páginas del libro:");
        int cantidadPaginas = scanner.nextInt();        
        return new Libro(isbn,titulo,autor,cantidadPaginas);
    }
    
    public void mostrarLibro(Libro libro) {
        System.out.println(" ");
        System.out.println("Libro: " + libro.titulo);
        System.out.println("Autor: " + libro.autor);
        System.out.println("ISBN: " + libro.isbn);
        System.out.println("Cantidad de páginas: " + libro.cantidadPaginas);
    }
}
