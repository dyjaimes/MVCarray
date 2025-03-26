
package Vista;

import java.util.Scanner;

public class ProveedorView {
    private Scanner objTeclado;
    
    public ProveedorView(){
        
    }
      public String tomarRegistro_NombreProveedor(){
            this.objTeclado=new Scanner(System.in);
           System.out.println("ingrese los datos del proveedor ");
                System.out.println("digite el nombre del proveedor");          
                 String nombre=objTeclado.nextLine();
      return nombre;
      }
      
            public String tomarRegistro_CedulaProveedor(){
            this.objTeclado=new Scanner(System.in);
                System.out.println("digite el numero de cedula");            
                 String nombre=objTeclado.nextLine();
      return nombre;
      }
            
                        public String tomarRegistro_ServicioProveedor(){
            this.objTeclado=new Scanner(System.in);
                System.out.println("digite el nombre del servicio que ofrece");            
                 String nombre=objTeclado.nextLine();
      return nombre;
      }
            

      
      //se crean los metodos normales del formulario
    public int mostrarMenu(){
        System.out.println("1 registrar Proveedores");
        System.out.println("2 ver lista de proveedores");
        System.out.println("3 cantidad de proveedores");
        System.out.println("4 buscar un proveedor registrado");
        System.out.println("5 salir");
        this.objTeclado=new Scanner(System.in);
        
        int opcionMenu=objTeclado.nextInt();
        return opcionMenu;
    }
}