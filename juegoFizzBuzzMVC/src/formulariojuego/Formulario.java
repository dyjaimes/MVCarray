
package formulariojuego;
import controlador.JuegoFizzBuzzMVC;
import  modelo.ModeloFizzBuzz;
import vista.VistaFizzBuzz;


public class Formulario {
    public static void main(String[] args) {
        ModeloFizzBuzz objmodelo=new ModeloFizzBuzz();
        VistaFizzBuzz objvista=new VistaFizzBuzz();
        JuegoFizzBuzzMVC objcontrol=new JuegoFizzBuzzMVC(objmodelo, objvista);
        
        
        while(true){
            objcontrol.iniciarFormulario();
        }
        
        
        
    }
    
}
