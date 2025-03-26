package formulario;

import controlador.ControladorTienda;
import modelo.Tienda;
import vista.VistaTienda;

public class Formulario {
    public static void main(String[] args) {
        VistaTienda vista = new VistaTienda();
        Tienda tienda = new Tienda(vista.pedirHorario());
        ControladorTienda controlador = new ControladorTienda(tienda, vista);
        controlador.iniciar();
    }
}