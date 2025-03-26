
package Modelo;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;

public class ModeloAire {
    private LinkedList<Double> temperatura;
    private LinkedList<Double> humedad;
    private Scanner input;
    private Random aleatorio;
   
    
    public ModeloAire(){
        temperatura =new LinkedList<>();
        humedad=new LinkedList<>();
        input =new Scanner(System.in);
        aleatorio=new Random();
    
        
    }

    
    public void setingresarTemp(double valortem){
        temperatura.add(valortem);
    }
    
    public void setingresarHumedad(double valorHumedad){
        humedad.add(valorHumedad);
    }
    public double getTem(){
        return temperatura.getLast();
    }
       public double getHum(){
        return humedad.getLast();
    } 
    
   public void setRandomHum(){
       humedad.add(aleatorio.nextDouble()*100+1);
   }
   public void setRandomTem(){
       double max=75;
       double min=-50;
       temperatura.add(aleatorio.nextDouble()*(max-min)+min);
   }
       
       
       
    
    
    public LinkedList<Double> getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(LinkedList<Double> temperatura) {
        this.temperatura = temperatura;
    }

    public LinkedList<Double> getHumedad() {
        return humedad;
    }

    public void setHumedad(LinkedList<Double> humedad) {
        this.humedad = humedad;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }
    
    
    
    
    
}
