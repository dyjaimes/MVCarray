
package Modelo;




public class Suma extends Calculadora {
    
    
  
    public Suma(){
        super( );
    }
    
    
    
    
    public  void  operacion(){
       double num1=getNumA().getLast();
        double num2=getNumB().getLast();
       double resultado=num1+num2;
        getResp().add(resultado);
    }
}
