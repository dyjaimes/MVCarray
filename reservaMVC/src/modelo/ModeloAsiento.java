
package modelo;


public class ModeloAsiento {
        private boolean ocupado;
        public ModeloAsiento() {
        this.ocupado = false; // Inicialmente, el asiento está disponible
    }
    public boolean estaOcupado() {
        return ocupado;
    }

    public void reservar() {
        if (!ocupado) {
            ocupado = true;
            System.out.println("¡Reserva exitosa!");
            return ;
        } else {
           System.out.println("El asiento ya está ocupado.");
          return ;
        }
    }
}
