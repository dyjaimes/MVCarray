package modelo;

import java.util.ArrayList;

public class ModeloInvernadero {
    private SensorTemperatura sensor;
    private ArrayList<Double> temperaturas;

    public ModeloInvernadero() {
        this.sensor = new SensorTemperatura();
        this.temperaturas = new ArrayList<>(); 
    }

    public void registrarTemperatura() {
        temperaturas.add(sensor.leerTemperatura());
    }

    public ArrayList<Double> getTemperaturas() {
        return temperaturas;
    }
}
