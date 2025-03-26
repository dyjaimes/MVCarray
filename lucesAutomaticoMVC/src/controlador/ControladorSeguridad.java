package controlador;

import modelo.SistemaSeguridad;
import vista.VistaSistema;

public class ControladorSeguridad {
    private SistemaSeguridad sistema;
    private VistaSistema vista;

    public ControladorSeguridad(VistaSistema vista) { // Se corrige el parámetro
        this.sistema = new SistemaSeguridad();
        this.vista = vista; // Se asigna correctamente la vista
    }

    public void ejecutar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    sistema.activarAlarma();
                    vista.mostrarMensaje("Alarma activada.");
                    break;
                case 2:
                    sistema.desactivarAlarma();
                    vista.mostrarMensaje("Alarma desactivada.");
                    break;
                case 3:
                    sistema.establecerModoNoche(vista.pedirModoNoche());
                    vista.mostrarMensaje("Modo noche actualizado.");
                    break;
                case 4:
                    boolean alarmaActivada = sistema.verificarSensores();
                    vista.mostrarEstadoSensores(sistema.obtenerRegistros(), alarmaActivada);
                    break;
                case 5:
                    vista.mostrarMensaje("Saliendo del sistema...");
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida.");
            }
        } while (opcion != 5);
    }
}