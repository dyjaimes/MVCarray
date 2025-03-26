
package controlador;
import vista.*;
import modelo.*;

public class ControladorReserva {
    private ModeloAsiento objasiento;
     private ModeloSala objsala;
    private VistaReserva objvista;
    
     public ControladorReserva( ModeloAsiento objasiento, ModeloSala objsala, VistaReserva objvista){
         this.objasiento=objasiento;
         this.objsala=objsala;
         this.objvista=objvista;
         
     }
 
 public void inicio(){
     int num=objvista.menu();
  
    switch (num){
        case 1:
            objsala.mostrarAsientosDisponibles();
            break;
        case 2:
           objsala.reservarAsiento(objvista.numasiento());
            
            break;
        case 3:
            System.exit(0);
            break;
    }
 }

    
}
