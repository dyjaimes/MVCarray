
package Modelo;
import java.util.LinkedList;
import java.util.Scanner;

public abstract class Calculadora {
    
    private LinkedList<Double> numA;
    private LinkedList<Double>numB;
    private LinkedList<Double>resp;
    private Scanner input;
    

    
    public Calculadora(){
        numA=new LinkedList<>();
        numB=new LinkedList<>();
        resp=new LinkedList<>();
        input=new Scanner(System.in);
    }
/*
    public Calculadora(double num1, double num 2){
        numA=new LinkedList<num1>();
        numB=newLinkedList
    }
   */
    public void ingresarNumA(/*double num, */String mensaje){
      
        double valor=0;
        boolean validar=false;
        do{
            System.out.println(mensaje);
            if(!input.hasNextDouble()){
                System.out.println("ingresa un numero");
                input.next();
                
        }
        valor=input.nextDouble();
       validar=true;
    }while(!validar);
        this.numA.add(valor);
        }
    public void ingresarNumB(/* num, */String mensaje){
       
        double valor=0;
        boolean validar=false;
        do{
            System.out.println(mensaje);
            if(!input.hasNextDouble()){
                System.out.println("ingresa un numero");
                input.next();
                
        }
        valor=input.nextDouble();
       validar=true;
    }while(!validar);
        this.numB.add(valor);
        }

    public LinkedList<Double> getNumA() {
        return numA;
    }

    public void setNumA(LinkedList<Double> numA) {
        this.numA = numA;
    }

    public LinkedList<Double> getNumB() {
        return numB;
    }

    public void setNumB(LinkedList<Double> numB) {
        this.numB = numB;
    }

    public LinkedList<Double> getResp() {
        return resp;
    }

    public void setResp(LinkedList<Double> resp) {
        this.resp = resp;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }


  


    
    
    public abstract void operacion();
        
}
