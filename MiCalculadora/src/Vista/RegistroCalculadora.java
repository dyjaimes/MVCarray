
package Vista;

import java.util.Scanner;


public class RegistroCalculadora {
    
    
    public int menu(){
        int n=0;
        int num;
       
        System.out.println("calculadora basica.\n seleccione la operacion que desea realizar");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        Scanner datos=new Scanner(System.in);
        num=datos.nextInt();
     
        return num;
    }
    
    public String tomarRegistro(){
        String mensaje="INGRESE UN NUMERO";
        
        return  mensaje;
    }
    public void mostrar(double mostrar){
        System.out.println("el resultado es: "+mostrar);
        
    }
}
