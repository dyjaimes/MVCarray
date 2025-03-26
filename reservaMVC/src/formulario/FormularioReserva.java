

package formulario;
import controlador.*;
import modelo.*;
import vista.*;

public class FormularioReserva {
    public static void main(String[] args) {
        VistaReserva vista=new VistaReserva();
        ModeloAsiento asiento=new   ModeloAsiento();
       ModeloSala sala =new ModeloSala();
       ControladorReserva reserva=new ControladorReserva(asiento, sala,vista);
        
        while(true){
        reserva.inicio();
        
    }}
}
