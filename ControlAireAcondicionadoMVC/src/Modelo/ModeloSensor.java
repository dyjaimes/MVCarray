
package Modelo;

public class ModeloSensor extends ModeloAire{
    
    public ModeloSensor(){
        super();
    }
    
    public String encendidoAutomatico(){
        if(getTem()>28 && getHum()>60)
            return "el aire se encuentra activado";
        else if(getTem()>30)
                return "el aire se encuentra activado";
        else
            return "el aire se encuentra apagado";
    }
    
}
