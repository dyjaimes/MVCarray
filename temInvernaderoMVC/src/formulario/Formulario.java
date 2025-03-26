package formulario;

import controlador.ControladorInvernadero;
import modelo.ModeloInvernadero;
import vista.VistaInvernadero;

public class Formulario {
    public static void main(String[] args) {
        ModeloInvernadero modelo = new ModeloInvernadero();
        VistaInvernadero vista = new VistaInvernadero();
        ControladorInvernadero controlador = new ControladorInvernadero(modelo, vista);

        controlador.iniciarMonitoreo();
    }
}