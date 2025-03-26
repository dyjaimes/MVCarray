
package Modelo;

import java.util.LinkedList;


public class ProveedorModel {
   
    private LinkedList<String> listaNombre;

    private LinkedList<String> listaNumCedula;
  
    private LinkedList<String> listaServicio;

    
    
    public ProveedorModel(){

       // this.listaProveedores=new String[3];
        this.listaNombre=new LinkedList<>();
        this.listaNumCedula=new LinkedList<>();
        this.listaServicio=new LinkedList<>();
  
        
        
    }
      //metodos normales de la clase
       public void guardarProveedor(String cedula, String nombre, String servicio){
         if(listaNumCedula.contains(cedula)){
             System.out.println("ya se encuentra registrado");
         }
         else{
         this.listaNumCedula.add(cedula);
         this.listaNombre.add(nombre);
         this.listaServicio.add(servicio);
         System.out.println("informacion guardada ");}
     }
       
       
       public boolean getverificarcedula(String ced){
           if(listaNumCedula.contains(ced))
           {
               return true;
           }
        return false;
       }
       
       
    /*
    public void guadarProveedores(String nombreProveedor){
        this.listaNombre.add(nombreProveedor);
        System.out.println("infromacion guardada: "+nombreProveedor);
        
    }
     public void imprimirProveedores(){
         System.out.println("lista de proveedores: ");
         for(String listaDinamica: listaNombre){
             System.out.println(listaDinamica);
         }
         
     }
     
     public void guardarNumCedula(String cedula){
         if(listaNumCedula.contains(cedula)){
             System.out.println("ya se encuentra registrado");
         }
         else{
         this.listaNumCedula.add(cedula);
         System.out.println("informacion guardada: "+cedula);}
     }
     
     public void imprimircedula(){
         System.out.println("lista de cedulas");
         for(String ced: listaNumCedula){
             System.out.println( ced);
         }
     }
     
     public void guardarservicio(String serv){
         this.listaServicio.add(serv);
         System.out.println("informacion guardada: "+serv);
     }
            public void imprimirServicio(){
                for(int i=0;i<listaServicio.size();i++){
                    System.out.println(listaServicio.get(i));
                }
            }
            */
        public void BuscarProveedorCedula(String num){
            int index=listaNumCedula.indexOf(num);
            if(index != -1){
                System.out.println("datos del proveedor");
                System.out.println("nombre: " + listaNombre.get(index));
                System.out.println("cedula: "+listaNumCedula.get(index));
                System.out.println("servicio: "+listaServicio.get(index));
            }
            else{System.out.println("no se encuentra registrado");}
        }   
        
            public void listaCompleta(){
                for(int i=0;i<listaNombre.size();i++){
                    System.out.println("");
                    System.out.println("nombre: "+listaNombre.get(i));
                    System.out.println("cedula: "+listaNumCedula.get(i));
                    System.out.println("servicio: "+listaServicio.get(i));
                }
            }
  

            public void cantidadRegistos(){
                System.out.println("numero de registros: "+listaNumCedula.size()+"\n");
            }


   //metodos normales de los atributos

    public LinkedList<String> getListaNombre() {
        return listaNombre;
    }

    public void setListaNombre(LinkedList<String> listaNombre) {
        this.listaNombre = listaNombre;
    }

    public LinkedList<String> getListaNumCedula() {
        return listaNumCedula;
    }

    public void setListaNumCedula(LinkedList<String> listaNumCedula) {
        this.listaNumCedula = listaNumCedula;
    }

    public LinkedList<String> getListaServicio() {
        return listaServicio;
    }

    public void setListaServicio(LinkedList<String> listaServicio) {
        this.listaServicio = listaServicio;
    }

}
