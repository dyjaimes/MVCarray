
package Controlador;
import Modelo.Cliente;
import Vista.RegistroCliente;
import formularioClienteMVC.FormularioClienteMVC;

public class Controlador {
    private RegistroCliente objFormulario_registro;
    private Cliente objModelo_cliente;
    
    
    //constructor
    public Controlador(Cliente objCliente, RegistroCliente objFormulario){
        this.objModelo_cliente=objCliente;
        this.objFormulario_registro=objFormulario;
    }
    //metodo que inicia la ejecucion del formulario
    public void iniciarFormulario(){
        int opcion=0;
        do{
            opcion=this.objFormulario_registro.mostrarMenu();
            switch(opcion){
                case 1:
                    String auxNombre=this.objFormulario_registro.tomarRegistro_cliente();
                    this.objModelo_cliente.guardarClientes(auxNombre);
                    break;
                case 2:
                    this.objModelo_cliente.imprimirClientes();
                    break;
                case 3:
                    System.out.println("saliendo del sistema...");
                    break;
       
                default:
                    System.out.println("opcion no valida");
            }
            
            
        }while(opcion!=3);
    
}
}