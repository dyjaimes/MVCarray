package vista;

import java.util.Scanner;

public class VistaTienda {
    private Scanner scanner;

    public VistaTienda() {
        this.scanner = new Scanner(System.in);
    }

    public boolean pedirHorario() {
        System.out.print("¿La tienda está en horario de atención? (1: Sí, 0: No): ");
        return scanner.nextInt() == 1;
    }

    public int mostrarMenu() {
        System.out.println("\nsistema de control de acceso ");
        System.out.println("1. Intentar ingresar a la tienda");
        System.out.println("2. Cambiar horario de la tienda");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public boolean pedirMembresia() {
        System.out.print("¿El cliente tiene membresía? (1: Sí, 0: No): ");
        return scanner.nextInt() == 1;
    }

    public boolean pedirEmpleado() {
        System.out.print("¿El cliente es empleado? (1: Sí, 0: No): ");
        return scanner.nextInt() == 1;
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}