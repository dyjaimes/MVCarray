
package Controlador;
import Modelo.*;
import Vista.RegistroCalculadora;
public class CalculadoraController {
    private Dividir modelDividir;
    private Suma modelSuma;
    private Restar modelRestar;
    private Multiplicar modelMultiplicar;
    private RegistroCalculadora registro;
    
    public CalculadoraController(Dividir sas, Suma suma, Restar res,Multiplicar mul, RegistroCalculadora regist){
        this.modelDividir=sas;
       this.modelSuma=suma;
         this.modelRestar=res;
         this.modelMultiplicar=mul;
         this.registro=regist;
    }
    
    
    
    public void solicitudDatos(){
        int seleccion=0;
        String valor;
        double retorno;
        double jk  ; 
        do{
        
        seleccion=registro.menu();
        
        
        
        switch(seleccion){
             
        case 1:
        valor=this.registro.tomarRegistro();
        modelSuma.ingresarNumA(valor);
        valor=this.registro.tomarRegistro();
        modelSuma.ingresarNumB(valor);
        modelSuma.operacion();
        jk= modelSuma.getResp().getLast();
        registro.mostrar(jk);
        break;
        
        case 2:
            valor=this.registro.tomarRegistro();
        modelRestar.ingresarNumA(valor);
        valor=this.registro.tomarRegistro();
        modelRestar.ingresarNumB(valor);
        modelRestar.operacion();
        jk= modelRestar.getResp().getLast();
        registro.mostrar(jk);
        break;
        
        case 3:
                    valor=this.registro.tomarRegistro();
        modelMultiplicar.ingresarNumA(valor);
        valor=this.registro.tomarRegistro();
        modelMultiplicar.ingresarNumB(valor);
        modelMultiplicar.operacion();
        jk= modelMultiplicar.getResp().getLast();
        registro.mostrar(jk);
        break;
        case 4:
                        valor=this.registro.tomarRegistro();
         modelDividir.ingresarNumA(valor);
        valor=this.registro.tomarRegistro();
         modelDividir.ingresarNumB(valor);
         modelDividir.operacion();
        jk=  modelDividir.getResp().getLast();
        registro.mostrar(jk);
        break;
     
        case 5:
        System.out.println("saliendo del programa");
        break;
           }
        }while(seleccion <0);
    }
    
    
}

