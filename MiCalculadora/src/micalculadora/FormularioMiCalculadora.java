
package micalculadora;
import Controlador.*;
import Vista.*;
import Modelo.*;
import java.util.Scanner;
public class FormularioMiCalculadora {


    public static void main(String[] args) {
       
         Dividir dividir = new Dividir();
        Suma suma = new Suma();
        Restar restar = new Restar();
        Multiplicar multiplicar = new Multiplicar();
        Scanner i=new Scanner(System.in);
        
        RegistroCalculadora vista=new RegistroCalculadora();
        CalculadoraController controler=new CalculadoraController(dividir, suma, restar, multiplicar, vista);
       
       int nu=0;
        while(true)
        {
              controler.solicitudDatos();
              System.out.println("1 salir del programa, 2 para continuar");
              nu=i.nextInt();
           if(nu==1){
               System.out.println("muchas gracias");
             System.exit(0);}
        }
      
        
    }
    
}
