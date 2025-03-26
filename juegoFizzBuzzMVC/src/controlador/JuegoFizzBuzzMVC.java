
package controlador;
import vista.*;
import modelo.*;

public class JuegoFizzBuzzMVC {

    private ModeloFizzBuzz objmodelo;
    private VistaFizzBuzz objvista;
    
    public JuegoFizzBuzzMVC(ModeloFizzBuzz objmodelo, VistaFizzBuzz objvista ){
        this.objmodelo=objmodelo;
        this.objvista=objvista;
    }
 
    
    
    public void iniciarFormulario(){
        int opcion=objvista.menu();
        
        switch(opcion){
            case 1:
                objvista.mostrarnumeros3(objmodelo.divisible(1));
                break;
            case 2:
                objvista.mostrarnumeros5(objmodelo.divisible(2));
                break;
            case 3:
                objvista.mostrarnumeros3y5(objmodelo.divisible(3));
                break;
            case 4:
             objvista.mostrarnumerosNo(objmodelo.divisible(4));
            break;
                
            case 5:
                    System.exit(0);
                    break;
        }
        
        
        
        
    }
    
}
