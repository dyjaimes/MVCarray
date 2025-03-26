
package vista;

import java.util.Scanner;


public class VistaReserva {
    private Scanner scanner;
    
    
    public VistaReserva(){
        scanner=new Scanner(System.in);
    }
    
    public int menu(){
        
        System.out.print("sistema de reserva de asientos\n");
        System.out.println("1. mostrar asientos disponibles");
        System.out.println("2. reservar asientos");
        System.out.println("3. salir\n");
        int cantidadAsientos = scanner.nextInt();
        return cantidadAsientos;
        
    }
    public int numasiento(){
        System.out.println("digite el numero de asiento: ");
        int numAsientos = scanner.nextInt();
        return numAsientos;
    }

    
    
}
