
package controlador;

import modelo.ModeloInvernadero;
import vista.VistaInvernadero;
import java.util.ArrayList;
public class ControladorInvernadero {

     private ModeloInvernadero modelo;
    private VistaInvernadero vista;

    public ControladorInvernadero(ModeloInvernadero modelo, VistaInvernadero vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciarMonitoreo() {
    int opcion;
    do {
        modelo.registrarTemperatura(); 
        ArrayList<Double> temperaturas = modelo.getTemperaturas(); // Ahora usa ArrayList

        vista.mostrarEstado(temperaturas); // Asegúrate de que vista.mostrarEstado() reciba ArrayList<Double>

        opcion = vista.pedirRepeticion(); 
    } while (opcion == 1);

    vista.mostrarMensaje("Finalizando monitoreo del invernadero.");
}
}
