package controlador;
import modelo.Cliente;
import modelo.Tienda;
import vista.VistaTienda;

public class ControladorTienda {
    private Tienda tienda;
    private VistaTienda vista;

    public ControladorTienda(Tienda tienda, VistaTienda vista) {
        this.tienda = tienda;
        this.vista = vista;
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    Cliente cliente = new Cliente(vista.pedirMembresia(), vista.pedirEmpleado());
                    boolean acceso = tienda.permitirAcceso(cliente);
                    vista.mostrarMensaje(acceso ? "Acceso permitido." : "Acceso denegado.");
                    break;
                case 2:
                    tienda.cambiarHorario(vista.pedirHorario());
                    vista.mostrarMensaje("Horario actualizado.");
                    break;
                case 3:
                    vista.mostrarMensaje("Saliendo del sistema...");
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida.");
            }
        } while (opcion != 3);
    }
}