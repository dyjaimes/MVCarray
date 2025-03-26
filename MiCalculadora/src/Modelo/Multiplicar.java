
package Modelo;


public class Multiplicar extends Calculadora {
    

    public Multiplicar(){
        super();
    }
    
    public void operacion(){
   double num1=getNumA().getLast();
        double num2=getNumB().getLast();
       double resultado=num1*num2;
        getResp().add(resultado);
    }
}
