package controlador;

import modelo.SistemaDomotico;
import vista.VistaDomotica;

public class ControladorDomotico {
    private SistemaDomotico sistema;
    private VistaDomotica vista;

    public ControladorDomotico(VistaDomotica vista) {
        this.sistema = new SistemaDomotico(false); // Inicia con el sistema en modo día
        this.vista = vista;
    }

    public void ejecutar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1:
                    sistema.controlarLuces();
                    try {
                        Thread.sleep(10000); // Espera 10 segundos antes de la siguiente simulación
                    } catch (InterruptedException e) {
                        vista.mostrarMensaje("Error en la espera.");
                    }
                    break;
                case 2:
                    boolean noche = vista.pedirModoNoche();
                    sistema.cambiarModoNoche(noche);
                    vista.mostrarMensaje("Modo noche actualizado.");
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