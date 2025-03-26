package modelo;

import java.util.ArrayList;

public class Tienda {
    private boolean enHorarioAtencion;
    private ArrayList<Cliente> clientesRegistrados;

    public Tienda(boolean enHorarioAtencion) {
        this.enHorarioAtencion = enHorarioAtencion;
        this.clientesRegistrados = new ArrayList<>(); 
    }

    public boolean estaEnHorario() {
        return enHorarioAtencion;
    }

    public void cambiarHorario(boolean nuevoEstado) {
        enHorarioAtencion = nuevoEstado;
    }

    public boolean permitirAcceso(Cliente cliente) {
        if (cliente.esEmpleado() || (cliente.tieneMembresia() && enHorarioAtencion)) {
            registrarCliente(cliente);
            return true;
        }
        return false;
    }

    private void registrarCliente(Cliente cliente) {
        clientesRegistrados.add(cliente);
    }
}