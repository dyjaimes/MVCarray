package formulario;

import controlador.ControladorSeguridad;
import vista.VistaSistema;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VistaSistema vista = new VistaSistema(scanner);
        ControladorSeguridad controlador = new ControladorSeguridad(vista);

        controlador.ejecutar();

        scanner.close();
    }
}