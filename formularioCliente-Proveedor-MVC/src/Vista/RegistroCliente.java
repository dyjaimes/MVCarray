
package Vista;
import java.util.Scanner;

public class RegistroCliente {
    //se inicializa los atributos de la interface
    private String colorBoton;
    private int numBotones;
    private int numLabel;
    private String colorLabel;
    private String colorFormulario;
    private Scanner objTeclado;
    
    
    //se crea el constructor
    public RegistroCliente(){
        this.colorBoton="rojo";
        this.numBotones=5;
        this.numLabel=10;
        this.colorLabel="blanco";
        this.colorFormulario="amarillo";
    }
    //se crean los metodos normales del formulario
    public int mostrarMenu(){
        System.out.println("1 registrar clientes");
        System.out.println("2 ver lista de clientes");
        System.out.println("3 salir de la seccion clientes");
        System.out.println("4 menu principal");
        this.objTeclado=new Scanner(System.in);
       
        int opcionMenu=objTeclado.nextInt();
        return opcionMenu;
    }
    public String tomarRegistro_cliente(){
        this.objTeclado=new Scanner(System.in);
        System.out.println("bienvenido al registro del cliente...");
        System.out.println("digite el nombre del cliente");
        String nombreCliente=objTeclado.nextLine();
        System.out.println("digite el apellido del cliente");
        String apellidoCliente=objTeclado.nextLine();
        System.out.println("digite la cedula del cliente");
        String cedulaCliente=objTeclado.nextLine();
        return nombreCliente;
    }
    
  
}
