/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A de 50 números reales, 
y el segundo B, un arreglo de 20 números, también reales.

El programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. 

Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números ordenados al arreglo B de 20 elementos, 
y rellenar los 10 últimos elementos con el valor 0.5. 

Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 20.
 */
package ejercicio10;

import java.util.Arrays;


public class Ejercicio10 {


    public static void main(String[] args) {
        
        Double A[] = new Double[50];
        Double B[] = new Double[20];
        
        Arrays.fill(A, Math.random());
        System.out.println("El primer arreglo es: " + Arrays.toString(A));
        
        Arrays.sort(A);
        B = Arrays.copyOf(A, 10);
        //Arrays.fill(B, 11, 19, 0.5); REVISAR
        
        System.out.println("El arreglo A ordenado: " + Arrays.toString(A));
        System.out.println("El arreblo B: " + Arrays.toString(B));
        
        
    }
    
}
