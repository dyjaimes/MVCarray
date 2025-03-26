
package modelo;
import java.util.Random;

public class ModeloSala {
  
    private ModeloAsiento[] asientos;
    private int capacidad;
    private int ocupados;
    private Random aleatorio;
    
    public ModeloSala() {
        this.aleatorio=new Random();
        this.capacidad = aleatorio.nextInt(100)+1;
        this.ocupados = 0;
        this.asientos = new ModeloAsiento[capacidad];

        
        for (int i = 0; i < capacidad; i++) {
            asientos[i] = new ModeloAsiento();
        }
    }
/*
    public void capacidadd(int capacidad){
        
        this.capacidad=capacidad;
this.asientos=new ModeloAsiento[capacidad];
        for (int i = 0; i < capacidad; i++) {
         asientos[i] = new ModeloAsiento();
    }
}*/
    
    
    public void reservarAsiento(int numero) {
        if (ocupados >= capacidad) {
            System.out.println("La sala está llena.");
            return;
        }

        if (numero < 1 || numero > capacidad) {
            System.out.println("Número de asiento inválido.");
            return ;
        }

        if (!asientos[numero - 1].estaOcupado()) {
            asientos[numero - 1].reservar();
            ocupados++;
        } else {
            System.out.println("El asiento ya está ocupado.");

        }
       
    }

    public boolean hayDisponibilidad() {
        return ocupados < capacidad;
    }
    
    public void mostrarAsientosDisponibles() {
        System.out.println("Asientos disponibles:");
        for (int i = 0; i < capacidad; i++) {
            if (!asientos[i].estaOcupado()) {
                System.out.print((i + 1) + " "); // Mostramos el número del asiento disponible
            }
        }
        System.out.println(); // Salto de línea al final
    }
}
    
    
    
    
    
    
  