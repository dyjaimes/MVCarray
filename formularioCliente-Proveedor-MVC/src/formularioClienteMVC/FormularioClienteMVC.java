
package formularioClienteMVC;
import Controlador.Controlador;
import Controlador.ProveedorController;
import Modelo.Cliente;
import Modelo.ProveedorModel;
import Vista.ProveedorView;
import Vista.RegistroCliente;
import java.util.Scanner;

public class FormularioClienteMVC {

    
    public static void main(String[] args) {
        int continuar=0;
         Scanner input= new Scanner(System.in) ;  
         
        ProveedorModel objProveedor=new ProveedorModel();
        ProveedorView objFormularioProveedor=new ProveedorView();
        ProveedorController objController=new ProveedorController(objFormularioProveedor, objProveedor);
        
        Cliente objCliente=new Cliente();
        RegistroCliente objFormulario=new RegistroCliente();
        Controlador objControlador=new Controlador(objCliente, objFormulario);
        
        
        while(true){//mantiene el programa en ejecución
            System.out.println("desea ingresar al area de clientes o proveedores");
        System.out.println("1. Clientes");
        System.out.println("2. Proveedores");
            System.out.println("3. salir del programa");
            
            do{
                System.out.println("\nseleccione una opcion");
                 continuar=input.nextInt();
            }while(continuar<=0 || continuar>3);
            
        
        switch (continuar){
            case 1:   
                
        objControlador.iniciarFormulario();
        break;
            case 2:

        objController.iniciarFormulario();
        break;
        
        case 3:
        System.out.println("saliendo del programa");
        System.exit(0);//salir del programa
        break;
        }
        }
    }
    /*public static void inicio(){System.out.println("regresando al menu pricipal");}*/
}
