package vista;

import java.util.Scanner;

public class VistaSistema {
    private Scanner scanner;
    
    public VistaSistema(Scanner scanner) { // Se recibe un Scanner externo
        this.scanner = scanner; // Se asigna correctamente
    }
    
    public int mostrarMenu() {
        System.out.println("\nsistema de seguridad con sensores de movimiento");
        System.out.println("1. Activar alarma");
        System.out.println("2. Desactivar alarma");
        System.out.println("3. Establecer modo noche");
        System.out.println("4. Verificar sensores");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }
    
    public boolean pedirModoNoche() {
        System.out.print("¿Es de noche? (1: Sí, 0: No): ");
        return scanner.nextInt() == 1;
    }
    
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
    public void mostrarEstadoSensores(boolean[] registros, boolean alarmaActivada) {
        System.out.println("Estado de los sensores:");
        for (int i = 0; i < registros.length; i++) {
            System.out.println("Sensor " + (i + 1) + ": " + (registros[i] ? "Detectó movimiento" : "Sin movimiento"));
        }
        
        if (alarmaActivada) {
            System.out.println("¡Alarma activada! Intruso detectado.");
        } else {
            System.out.println("No hay amenazas detectadas.");
        }
    }
}