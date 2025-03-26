package modelo;

public class SensorLuz {
    private boolean esDeNoche;

    public SensorLuz(boolean esDeNoche) {
        this.esDeNoche = esDeNoche;
    }

    public boolean esDeNoche() {
        return esDeNoche;
    }

    public void establecerModoNoche(boolean noche) {
        esDeNoche = noche;
    }
}