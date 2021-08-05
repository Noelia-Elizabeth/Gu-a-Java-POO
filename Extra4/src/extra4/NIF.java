
package extra4;

import java.util.Scanner;

public class NIF {
    
    private int dni;
    private String letra;

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
    
    public String calcularLetra() {
        switch (this.dni%23) {
            case 0:
                return "T";
            case 1:
                return "R";
            case 2:
                return "W";
            case 3:
                return "A";
            case 4:
                return "G";
            case 5:
                return "M";
            case 6:
                return "Y";
            case 7:
                return "F";
            case 8:
                return "P";
            case 9:
                return "D";
            case 10:
                return "X";
            case 11:
                return "B";
            case 12:
                return "N";
            case 13:
                return "J";
            case 14:
                return "Z";
            case 15:
                return "S";
            case 16:
                return "Q";
            case 17:
                return "V";
            case 18:
                return "H";
            case 19:
                return "L";
            case 20:
                return "C";
            case 21:
                return "K";
            case 22: 
                return "E";
        }
        return "";
    }
    
    public void crearNif() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el DNI: ");
        this.dni = scanner.nextInt();
        this.letra = this.calcularLetra();
    }
    
    public void mostrar() {
        System.out.println(this.dni + "-" + this.letra);
    }
}
