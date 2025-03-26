
package FormularioAire;

import Modelo.*;
import Vista.VistaAire;
import controlador.ControladorAire;



public class FormularioAire {
    public static void main(String[] args) {
            VistaAire vistaAire =new VistaAire();
    ModeloSensor modelosensor=new ModeloSensor();
    ControladorAire controlador=new ControladorAire( modelosensor,  vistaAire);

    while(true){
        controlador.inciarFormulario();

    }
    
    }

}
