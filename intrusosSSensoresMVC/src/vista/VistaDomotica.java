package vista;
import java.util.Scanner;

public class VistaDomotica {
    private Scanner scanner;

    public VistaDomotica(Scanner scanner) {
        this.scanner = scanner;
    }

    public int mostrarMenu() {
        System.out.println("\nsistema domótico");
        System.out.println("1. Simular control de luces");
        System.out.println("2. Cambiar modo (Día/Noche)");
        System.out.println("3. Salir");
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
}