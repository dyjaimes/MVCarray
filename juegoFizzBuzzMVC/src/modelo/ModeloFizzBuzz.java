
package modelo;



public class ModeloFizzBuzz {
    private int[] numero;

    
    public ModeloFizzBuzz(){
        this.numero=new int[100];
        for(int i=0; i<numero.length;i++){
            numero[i]=i+1;
        }
    }

    
    
    
    
    public int[] divisible( int num){
       int contador=0;
       
        int index=0;
        
               if(num==1){
                   for (int i=0; i<numero.length;i++){
            if(numero[i]%3==0)
               contador++;
               
        }
        int[] resultado =new int[contador];
        for(int i=0;i<numero.length;i++){
             if(numero[i]%3==0){
                 resultado[index]=numero[i];
                 index++;
             } 
        }
       return resultado;
       }
       
        
               else if(num==2){
                   for (int i=0; i<numero.length;i++){
            if(numero[i]%5==0)
               contador++;
               
        }
        int[] resultado =new int[contador];
        for(int i=0;i<numero.length;i++){
             if(numero[i]%5==0){
                 resultado[index]=numero[i];
                 index++;
             } 
        }
       return resultado;
       }
       

                    else  if(num==3){
                   for (int i=0; i<numero.length;i++){
            if(numero[i]%5==0 && numero[i]%3==0 )
               contador++;
               
        }
        int[] resultado =new int[contador];
        for(int i=0;i<numero.length;i++){
             if(numero[i]%5==0  &&numero[i]%3==0 ){
                 resultado[index]=numero[i];
                 index++;
             } 
        }
       return resultado;
       }
               
                     else  if(num==4){
                   for (int i=0; i<numero.length;i++){
            if(!(numero[i]%3==0 || numero[i]%5==0 ))
               contador++;
               
        }
        int[] resultado =new int[contador];
        for(int i=0;i<numero.length;i++){
             if(!(numero[i]%3==0 || numero[i]%5==0 )){
                 resultado[index]=numero[i];
                 index++;
             } 
        }
       return resultado;
       }     
       
       return new int[0];
    }
    
    
    
    public int[] getNumero() {
        return numero;
    }

    public void setNumero(int[] numero) {
        this.numero = numero;
    }
    

    
    
    
}
