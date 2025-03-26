package formulario;

import controlador.ControladorDomotico;
import vista.VistaDomotica;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VistaDomotica vista = new VistaDomotica(scanner);
        ControladorDomotico controlador = new ControladorDomotico(vista);

        controlador.ejecutar();

        scanner.close();
    }
}