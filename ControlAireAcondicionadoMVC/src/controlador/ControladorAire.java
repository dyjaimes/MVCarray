
package controlador;
import Modelo.*;
import Vista.*;

public class ControladorAire {
    private ModeloSensor objSensor;
    private VistaAire objAire;
    
    
    public ControladorAire(ModeloSensor objSenso, VistaAire objAire){
        this.objSensor=objSenso;
        this.objAire=objAire;
    }
    
    
    public void inciarFormulario(){
    
        int men=objAire.menu();
        switch (men){
            case 1:
                double tem=objAire.temManual();
                objSensor.setingresarTemp(tem);
                double hum=objAire.humManual();
                objSensor.setingresarHumedad(hum);
                objAire.mostrar(objSensor.encendidoAutomatico(),objSensor.getHum(),objSensor.getTem());
                break;
                
            case 2:
                objSensor.setRandomHum();
                objSensor.setRandomTem();

               objAire.mostrar(objSensor.encendidoAutomatico(), objSensor.getHum(),objSensor.getTem());
                
                break;
                
            case 3:
                System.exit(0);
                break;
        }
    }
    
}
