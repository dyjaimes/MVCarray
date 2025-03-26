
package Modelo;


public class Cliente {
    private String nombreCliente;
    private String[] listaClientes;
    private int contador;
    
    
    public Cliente(){
        this.nombreCliente=" ";
        this.contador=0;
        //lista estatica de clientes
        this.listaClientes=new String[3];

    }
    
    //metodos normales de los atributos
    public String getNombreCliente(){
        return nombreCliente;
    }
    
    public void setNombreCliente(String nombreCliente){
        this.nombreCliente=nombreCliente;
    }
    public String[] getListaClientes(){
        return listaClientes;
    }
    //metodos normales de la clase
    public void guardarClientes(String datoNombre){
        if(this.contador<this.listaClientes.length){
            this.listaClientes[this.contador]=datoNombre;
            this.contador++;
            System.out.println("informacion guardada");
        }
    }
        public void imprimirClientes(){
            for(int i=0;i<this.listaClientes.length;i++){
                System.out.println("xxx; "+this.listaClientes[i]);
            }
        }
                
        }
    
    
