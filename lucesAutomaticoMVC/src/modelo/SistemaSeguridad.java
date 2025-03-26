package modelo;
public class SistemaSeguridad {
    private SensorMovimiento[] sensores;
    private boolean alarmaActiva;
    private boolean esDeNoche;
    private boolean[] registros; // Array no dinámico para registrar estado de sensores

    public SistemaSeguridad() {
        sensores = new SensorMovimiento[3];
        registros = new boolean[3];
        for (int i = 0; i < 3; i++) {
            sensores[i] = new SensorMovimiento();
        }
        alarmaActiva = false;
        esDeNoche = false;
    }

    public void activarAlarma() {
        alarmaActiva = true;
    }

    public void desactivarAlarma() {
        alarmaActiva = false;
    }

    public void establecerModoNoche(boolean noche) {
        esDeNoche = noche;
    }

    public boolean verificarSensores() {
        if (!alarmaActiva) {
            return false;
        }

        int detectados = 0;
        for (int i = 0; i < sensores.length; i++) {
            registros[i] = sensores[i].detectarMovimiento();
            if (registros[i]) {
                detectados++;
            }
        }

        return detectados >= 2 && esDeNoche;
    }

    public boolean[] obtenerRegistros() {
        return registros;
    }
    
    public boolean obtenerEstadoAlarma() {
        return alarmaActiva;
    }
    
    public boolean obtenerModoNoche() {
        return esDeNoche;
    }
}
