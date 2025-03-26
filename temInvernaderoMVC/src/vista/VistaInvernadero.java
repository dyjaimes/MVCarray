
package vista;

import java.util.ArrayList;
import java.util.Scanner;
public class VistaInvernadero {
    private Scanner scanner;

    public VistaInvernadero() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarEstado(ArrayList<Double> temperaturas) {
    for (double temp : temperaturas) {
        System.out.printf("Temperatura actual: %.2f°C -> ", temp);

        if (temp < 10) {
            System.out.println("Activando calefactor");
        } else if (temp > 25) {
            System.out.println("Activando ventilador");
        } else {
            System.out.println("Sistema inactivo. Temperatura estable.");
        }
    }
}

    public int pedirRepeticion() {
        System.out.println("\nIngresa 1 para repetir o cualquier otro número para salir:");
        return scanner.nextInt();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}
