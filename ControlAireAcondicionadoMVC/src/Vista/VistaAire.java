
package Vista;

import java.util.Scanner;
import java.text.DecimalFormat;

public class VistaAire {
    private Scanner io;
    private DecimalFormat df=new DecimalFormat("#.##");
    public VistaAire(){ io=new Scanner(System.in);}
    
    public int menu(){
       
        System.out.println("1. ingresar Temperatura y Humedad manualmente");
        System.out.println("2. detectar automaticamente la Temperatura y Humedad");
        System.out.println("3. salir");
        int num=io.nextInt();
        return num;
    }
    
    public double temManual(){
        System.out.println("ingrese la temperatura");
        double tem=io.nextDouble();
        return tem;
    }
        public double humManual(){
        System.out.println("ingrese la humedad");
        double tem=io.nextDouble();
        return tem;
    }
        public void mostrar(String resultado, double hume, double tem){
            System.out.println("la temperatura es de "+df.format(tem));
            System.out.println("la humedad es de "+df.format(hume));
            System.out.println(resultado+"\n");
        }
    
}
