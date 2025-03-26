
package Modelo;

import java.util.LinkedList;


public class Dividir extends Calculadora {
    
    
    public Dividir(){
        super();
    }
 
    
    public void operacion(){
         double num1=getNumA().getLast();
        double num2=getNumB().getLast();
       double resultado=num1/num2;
        getResp().add(resultado);
    }
    
}
