/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Vista.ProveedorView;
import Modelo.ProveedorModel;
import formularioClienteMVC.FormularioClienteMVC;

public class ProveedorController {
    private ProveedorView objFormulario_registro;
    private ProveedorModel objModeloProveedor;
    
    public ProveedorController( ProveedorView objFormulario, ProveedorModel objProveedor){
        objFormulario_registro=objFormulario;
        this.objModeloProveedor=objProveedor;
    }
    
        //metodo que inicia la ejecucion del formulario
    public void iniciarFormulario(){
        int opcion=0;
        boolean verificar=true;
        String cedula;
        do{
            opcion=this.objFormulario_registro.mostrarMenu();
            switch(opcion){
                case 1:
                    String proveedor=this.objFormulario_registro. tomarRegistro_NombreProveedor();
                  
                    cedula=this.objFormulario_registro. tomarRegistro_CedulaProveedor();
                    
                    if(verificar==objModeloProveedor.getverificarcedula(cedula)){
                        System.out.println("el usuario ya se encuentra registrado\n");
                        break;
                    }
                    
                    
                    String servicio=this.objFormulario_registro. tomarRegistro_ServicioProveedor();

                    this.objModeloProveedor.guardarProveedor(cedula, proveedor, servicio);
                    break;
                case 2:
                    this.objModeloProveedor.listaCompleta();
                    break;
                case 3:
                    this.objModeloProveedor.cantidadRegistos();
                    break;
                case 4:
                    String cedu=this.objFormulario_registro.tomarRegistro_CedulaProveedor();
                    this.objModeloProveedor.BuscarProveedorCedula(cedu);
                    break;
                case 5:
                    System.out.println("dirigiendo al menu principal");
                   //  FormularioClienteMVC.inicio();
                        break;
                default:
                    System.out.println("opcion no valida");
            }
            
            
        }while(opcion!=5);
        }
}
